public class Phone extends Product {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public boolean compare(Phone phone) {
        return super.compare(phone)
                && model.equals(phone.getModel());
    }
}
