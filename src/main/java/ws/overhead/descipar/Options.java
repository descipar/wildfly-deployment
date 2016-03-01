package ws.overhead.descipar;

public class Options {

    private static final Integer basePort = 9990;
    private boolean verbose = false;
    private String artifactName = null;
    private String artifactVersion = null;
    private String wildflyUrl = "localhost";
    private Integer portOffset = 0;
    private String mavenRepo = "https://repo1.maven.org/maven2/";
    private String username = null;
    private String password = "";

    public String getMavenRepo() {
        return mavenRepo;
    }

    public void setMavenRepo(String mavenRepo) {
        this.mavenRepo = mavenRepo;
    }

    public String getArtifactName() {
        return artifactName;
    }

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    public String getArtifactVersion() {
        return artifactVersion;
    }

    public void setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
    }

    public String getWildflyUrl() {
        return wildflyUrl;
    }

    public void setWildflyUrl(String wildflyUrl) {
        this.wildflyUrl = wildflyUrl;
    }

    public Integer getPortOffset() {
        return portOffset;
    }

    public void setPortOffset(Integer portOffset) {
        //TODO calculate port offset based on normal wildfly ports
        this.portOffset = portOffset;
    }

    public boolean isValid() {
        return artifactName != null && artifactVersion != null && username != null;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    public static Integer getBasePort() {
        return basePort;
    }

    private String getFullport() {
        return String.valueOf(basePort + portOffset);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
