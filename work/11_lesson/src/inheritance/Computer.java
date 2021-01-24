package inheritance;

public class Computer {

    private String model;
    private String cpu;
    private String graphics;
    private int ramSize;
    private int storageSize;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String geSpecifications() {
        return String.format("Производитель: %s, Модель процессора: %s, Модель видеокарты: %s, Объем оперативной памяти: %s, объем жесткого диска: %s",
                getModel(), getCpu(), getGraphics(), getRamSize(), getStorageSize());
    }

    public void printSpecifications() {
        System.out.println(geSpecifications());
    }
}
