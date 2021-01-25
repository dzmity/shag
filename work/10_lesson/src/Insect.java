public class Insect extends Animal {

    private int legsQuantity = 6;
    private int eyesQuantity;

    public int getEyesQuantity() {
        return eyesQuantity;
    }

    public void setEyesQuantity(int eyesQuantity) {
        this.eyesQuantity = eyesQuantity;
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " "
                + legsQuantity + " " + eyesQuantity;
    }
}
