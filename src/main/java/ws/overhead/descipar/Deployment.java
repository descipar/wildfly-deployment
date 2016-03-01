package ws.overhead.descipar;

import org.jboss.as.controller.client.ModelControllerClient;
import org.jboss.dmr.ModelNode;

import javax.security.auth.callback.*;
import javax.security.sasl.RealmCallback;
import java.io.IOException;
import java.net.InetAddress;

public class Deployment {

    private final Options deploymentOptions;

    public Deployment(Options options) {
        this.deploymentOptions = options;
    }

    public void startDeplyoment() throws Exception {

        ModelControllerClient client = ModelControllerClient.Factory.create(
                InetAddress.getByName("localhost"), 9990,
                new CallbackHandler() {

                    public void handle(Callback[] callbacks)
                            throws IOException, UnsupportedCallbackException {
                        for (Callback current : callbacks) {
                            if (current instanceof NameCallback) {
                                NameCallback ncb = (NameCallback) current;
                                ncb.setName(deploymentOptions.getUsername());
                            } else if (current instanceof PasswordCallback) {
                                PasswordCallback pcb = (PasswordCallback) current;
                                pcb.setPassword(deploymentOptions.getPassword().toCharArray());
                            } else if (current instanceof RealmCallback) {
                                RealmCallback rcb = (RealmCallback) current;
                                rcb.setText(rcb.getDefaultText());
                            } else {
                                throw new UnsupportedCallbackException(current);
                            }
                        }
                    }
                });

        ModelNode operation = new ModelNode();
        operation.get("operation").set("read-attribute");
        operation.get("name").set("servlet-container");

        ModelNode address = operation.get("address");
        address.add("subsystem", "undertow");
        address.add("server", "default-server");

        System.out.println("ModelNode operation");
        System.out.println(operation.toJSONString(false));

        try {
            ModelNode returnVal = client.execute(operation);

            System.out.println("Result:");
            System.out.println(returnVal.toJSONString(false));

        } finally {
            client.close();
            System.exit(1);

        }

    }

}
