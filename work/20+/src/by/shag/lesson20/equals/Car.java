package by.shag.lesson20.equals;

import java.lang.annotation.Documented;

import by.shag.lesson20.annotation.ThisCodeAuthor;

@ThisCodeAuthor(creationDate = "03/03/2021", version = 2)
public class Car {


    private String firm;
    private String model;
    private int enginePower;
    private EquipmentType equipmentType;



    @Deprecated
    public Car(String firm, String model, int enginePower, EquipmentType equipmentType) {
        this.firm = firm;
        this.model = model;
        this.enginePower = enginePower;
        this.equipmentType = equipmentType;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || !this.getClass().equals(o.getClass())) {
//            return false;
//        }
//        Car car = (Car) o;
//        boolean result = true;
//
//        if (car.firm == null) {
//            result = this.firm == null;
//        } else {
//            result = car.firm.equals(this.firm);
//        }
//        if (!result){
//            return false;
//        }
//        ////////////////////////////////////////
//        if (car.model == null) {
//            result = this.model == null;
//        } else {
//            result = car.model.equals(this.model);
//        }
//        if (!result){
//            return false;
//        }
//        ////////////////////////////////////////
//        if (car.enginePower != this.enginePower) {
//            return false;
//        }
//        ////////////////////////////////////////
//        if (car.equipmentType  == null) {
//            result = this.equipmentType == null;
//        } else {
//            result = car.equipmentType == this.equipmentType;
//        }
//        return result;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = 17;
//        result = 31 * result + (firm == null? 0 : firm.hashCode());
//        result = 31 * result + (model == null? 0 : model.hashCode());
//        result = 31 * result + enginePower;
//        result = 31 * result + (equipmentType == null? 0 : equipmentType.hashCode());
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (enginePower != car.enginePower) {
            return false;
        }
        if (firm != null ? !firm.equals(car.firm) : car.firm != null) {
            return false;
        }
        if (model != null ? !model.equals(car.model) : car.model != null) {
            return false;
        }
        return equipmentType == car.equipmentType;
    }

    @Override
    public int hashCode() {
        int result = firm != null ? firm.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + enginePower;
        result = 31 * result + (equipmentType != null ? equipmentType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", enginePower=" + enginePower +
                ", equipmentType=" + equipmentType +
                '}';
    }
}
