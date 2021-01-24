package inheritance;

public class Laptop extends PersonalComputer {
    private String monitorType;

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public void printCameraResolution() {
        System.out.println("monitor type = " + this.monitorType);
    }
}
