package inheritance;

public class ServerComputer extends Computer {
    private String serverType;

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public void printServerType() {
        System.out.println("server type is " + this.serverType);
    }
}
