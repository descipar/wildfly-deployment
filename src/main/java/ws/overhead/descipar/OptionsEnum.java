package ws.overhead.descipar;


public enum OptionsEnum {
    HELP ("-help"),
    ARTIFACT_NAME ("-name"),
    ARTIFACT_ID ("-artifactid"),
    GROUP_ID ("-groupid"),
    MAVEN_REPOSITORY ("-maven"),
    PORT_OFFSET ("-offset"),
    WILDFLY_URL ("-wildfly"),
    VERBOSE ("-v"),
    USERNAME ("-user"),
    PASSWORD ("-password");


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
