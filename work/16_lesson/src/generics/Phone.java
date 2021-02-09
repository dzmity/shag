package generics;

public class Phone extends Product {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public boolean compare(Product product) {
        if (product instanceof Phone) {
            Phone phone = (Phone) product;
            return super.compare(phone)
                    && model.equals( phone.getModel());
        }
        return false;
    }
}
