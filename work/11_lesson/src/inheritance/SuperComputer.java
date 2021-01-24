package inheritance;

public class SuperComputer extends Computer {

    private String quantumProcessorType;

    public String getQuantumProcessorType() {
        return quantumProcessorType;
    }

    public void setQuantumProcessorType(String quantumProcessorType) {
        this.quantumProcessorType = quantumProcessorType;
    }

    public void printProcessorInformation() {
        System.out.println(super.getCpu() + " with quantum processor " + this.quantumProcessorType);
    }
}
