public class FoodStuff {

    private String foodName;
    private String typeOfFood;
    private String brandName;
    private int proteinQuantity;
    private int fatQuantity;
    private int carbohydrateQuantity;

    public FoodStuff() {
    }

    public FoodStuff(String foodName, String typeOfFood, String brandName, int proteinQuantity, int fatQuantity, int carbohydrateQuantity) {
        this.foodName = foodName;
        this.typeOfFood = typeOfFood;
        this.brandName = brandName;
        this.proteinQuantity = proteinQuantity;
        this.fatQuantity = fatQuantity;
        this.carbohydrateQuantity = carbohydrateQuantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        if (isValidString(foodName)) {
            this.foodName = foodName;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (isValidString(typeOfFood)) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        if (isValidString(brandName)) {
            this.brandName = brandName;
        }
    }

    public int getProteinQuantity() {
        return proteinQuantity;
    }

    public void setProteinQuantity(int proteinQuantity) {
        if (isValidInt(proteinQuantity)) {
            this.proteinQuantity = proteinQuantity;
        }
    }

    public int getFatQuantity() {
        return fatQuantity;
    }

    public void setFatQuantity(int fatQuantity) {
        if (isValidInt(fatQuantity)) {
            this.fatQuantity = fatQuantity;
        }
    }

    public int getCarbohydrateQuantity() {
        return carbohydrateQuantity;
    }

    public void setCarbohydrateQuantity(int carbohydrateQuantity) {
        if (isValidInt(carbohydrateQuantity)) {
            this.carbohydrateQuantity = carbohydrateQuantity;
        }
    }

    private boolean isValidString(String s) {
        if (s.isBlank()) {
            System.out.println("Некорректное значение!");
            return false;
        }
        return true;
    }

    private boolean isValidInt(int i) {
        if (i <= 0) {
            System.out.println("Некорректное значение!");
            return false;
        }
        return true;
    }

}
