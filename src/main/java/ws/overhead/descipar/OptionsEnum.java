package ws.overhead.descipar;


public enum OptionsEnum {
    HELP ("-help"),
    ARTIFACT_NAME ("-name"),
    ARTIFACT_VERSION ("-version"),
    MAVEN_REPOSITORY ("-maven"),
    PORT_OFFSET ("-offset"),
    WILDFLY_URL ("-wildfly"),
    VERBOSE ("-v");


    private final String name;

    OptionsEnum(String s) {
        this.name = s;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
