package ws.overhead.descipar;

import org.jboss.as.cli.scriptsupport.CLI;
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

    }

}
