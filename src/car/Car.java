package car;

import java.util.Objects;

public class Car {

    private final int id;
    private final String model;
    private String color;
    private int currentSpeed;

    private int costAuto;

    public int getCostAuto() {
        return costAuto;
    }

    public void setCostAuto(int costAuto) {
        this.costAuto = costAuto;
    }

    public int addDiscount(int discount){
        return costAuto - costAuto * discount / 100;
    }

    public Car(int id, String model, String color, int currentSpeed) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public void drive() {
        System.out.println("Super cool drive...");
    }

    public void info() {
        System.out.println();
        System.out.println("Info about car");
        System.out.println("Id car = " + id);
        System.out.println("Model car = " + model);
        System.out.println("Color car = " + color);
        System.out.println();
    }

    public void go(int speed) {
        if (currentSpeed == 0) {
            System.out.println("The car begins to drive with speed " + speed);
        } else {
            System.out.println("Auto goes with speed " + speed);
        }

        currentSpeed = speed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed >= 0 && currentSpeed < 500) {
            this.currentSpeed = currentSpeed;
        }
    }

    public void startEngine() {
        checkEngine();
        startAfterCheck();
    }

    private void checkEngine(){
        System.out.println("Проверить топливо");
        System.out.println("Проверить электронику");
    }
    private void startAfterCheck(){
        System.out.println("Запуск электроники");
        System.out.println("Запуск стартера");
        System.out.println("Двигатель запущен");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Car car = (Car) o;
//
//        if (id != car.id) return false;
//        if (currentSpeed != car.currentSpeed) return false;
//        if (costAuto != car.costAuto) return false;
//        if (!Objects.equals(model, car.model)) return false;
//        return Objects.equals(color, car.color);
//    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + currentSpeed;
        result = 31 * result + costAuto;
        return result;
    }
}
