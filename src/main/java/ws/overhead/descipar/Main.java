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
                    options.setArtifactName((element.split("=")[1]));
                    if (verbose) {
                        System.out.print("Setting Maven Repository to " + options.getArtifactName());
                    }
                }


            }

            Deployment deployment = new Deployment(new Options());
            deployment.deplyoment(null);
        }
    }

    private static void printHelp() {
        System.out.println("Printing Help");

    }

    private static void abort() {

    }


}
