package ws.overhead.descipar;


import org.apache.commons.lang3.ArrayUtils;

public class Main {

    public static void main(final String[] args) throws Exception {
        boolean verbose = false;
        if (ArrayUtils.contains(args, OptionsEnum.HELP.toString())) {
            printHelp();
        } else {
            //TODO Use builder pattern later
            Options options = new Options();
            if (ArrayUtils.contains(args, OptionsEnum.VERBOSE.toString())) {
                verbose = true;
                options.setVerbose(true);
            }
            for (String element : args) {
                if (element.startsWith(OptionsEnum.ARTIFACT_NAME.toString())) {
                    options.setArtifactName((element.split("=")[1]));
                    if (verbose) {
                        System.out.print("Setting Artifact name to " + options.getArtifactName());
                    }
                }
                if (element.startsWith(OptionsEnum.ARTIFACT_VERSION.toString())) {
                    options.setArtifactVersion((element.split("=")[1]));
                    if (verbose) {
                        System.out.print("Setting Artifact Version to " + options.getArtifactVersion());
                    }
                }
                if (element.startsWith(OptionsEnum.MAVEN_REPOSITORY.toString())) {
                    options.setMavenRepo((element.split("=")[1]));
                    if (verbose) {
                        System.out.print("Setting Maven Repository to " + options.getMavenRepo());
                    }
                }
                if (element.startsWith(OptionsEnum.PORT_OFFSET.toString())) {
                    options.setPortOffset(Integer.valueOf(element.split("=")[1]));
                    if (verbose) {
                        System.out.print("Setting Portoffset to " + options.getPortOffset());
                    }
                }
                if (element.startsWith(OptionsEnum.WILDFLY_URL.toString())) {
                    options.setWildflyUrl(element.split("=")[1]);
                    if (verbose) {
                        System.out.print("Setting Wildfly Url to " + options.getWildflyUrl());
                    }
                }
                if (element.startsWith(OptionsEnum.USERNAME.toString())) {
                    options.setUsername(element.split("=")[1]);
                    if (verbose) {
                        System.out.print("Setting Username to " + options.getUsername());
                    }
                }
                if (element.startsWith(OptionsEnum.PASSWORD.toString())) {
                    options.setPassword(element.split("=")[1]);
                    if (verbose) {
                        System.out.print("Setting Password to " + options.getPassword());
                    }
                }

            } if  (!options.isValid()) {
                abort();
            } else {
                Deployment deployment = new Deployment(options);
                deployment.startDeplyoment();

            }
        }
    }

    private static void printHelp() {
        System.out.println("Printing Help");

    }

    private static void abort() {

    }


}
