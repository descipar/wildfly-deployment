package ws.overhead.descipar;

public class Options {

    private static final Integer basePort = 9990;
    private boolean verbose = false;
    private String artifactId = null;
    private String artifactVersion = null;
    private String wildflyUrl = "localhost";
    private Integer portOffset = 0;
    private String mavenRepo = "https://repo1.maven.org/maven2/";
    private String username = null;
    private String password = "";
    private String groupid = "";

    String getMavenRepo() {
        return mavenRepo;
    }

     void setMavenRepo(String mavenRepo) {
        this.mavenRepo = mavenRepo;
    }

     String getArtifactId() {
        return artifactId;
    }

     void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

     String getArtifactVersion() {
        return artifactVersion;
    }

     void setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
    }

     String getWildflyUrl() {
        return wildflyUrl;
    }

     void setWildflyUrl(String wildflyUrl) {
        this.wildflyUrl = wildflyUrl;
    }

     Integer getPortOffset() {
        return portOffset;
    }



     void setPortOffset(Integer portOffset) {
        //TODO calculate port offset based on normal wildfly ports
        this.portOffset = portOffset;
    }

     boolean isValid() {
        return artifactId != null && groupid != null && username != null;
    }

    public boolean isVerbose() {
        return verbose;
    }

     void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public static Integer getBasePort() {
        return basePort;
    }

    private String getFullport() {
        return String.valueOf(basePort + portOffset);
    }

     String getUsername() {
        return username;
    }

     void setUsername(String username) {
        username = username;
    }

     String getPassword() {
        return password;
    }

     void setPassword(String password) {
        this.password = password;
    }

     String getGroupid() {
        return groupid;
    }

     void setGroupid(String groupid) {
        this.groupid = groupid;
    }
}
