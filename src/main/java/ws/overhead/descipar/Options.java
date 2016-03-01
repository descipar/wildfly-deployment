package ws.overhead.descipar;


public class Options {

    private String artifactName = "";
    private String artifactVersion = "";
    private String networkaddress = "";
    private Integer portOffset = 0;
    private String mavenRepo = "";

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

    public String getNetworkaddress() {
        return networkaddress;
    }

    public void setNetworkaddress(String networkaddress) {
        this.networkaddress = networkaddress;
    }

    public Integer getPortOffset() {
        return portOffset;
    }

    public void setPortOffset(Integer portOffset) {
        this.portOffset = portOffset;
    }
}
