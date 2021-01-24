package inheritance;

public class PocketComputer extends PersonalComputer {

    private int cameraResolution;

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void printCameraResolution() {
        System.out.println("camera resolution = " + this.cameraResolution);
    }
}
