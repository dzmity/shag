package inheritance;

public class DesktopComputer extends PersonalComputer {

    private String systemBlockColor;

    public String getSystemBlockColor() {
        return systemBlockColor;
    }

    public void setSystemBlockColor(String systemBlockColor) {
        this.systemBlockColor = systemBlockColor;
    }

    public void printSystemBlockColor() {
        System.out.println("system block color = " + this.systemBlockColor);
    }
}
