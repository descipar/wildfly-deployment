package ws.overhead.descipar;


public class Options {

    private String name = "";
    private String Version = "";
    private String networkaddress = "";
    private Integer portOffset = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
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
