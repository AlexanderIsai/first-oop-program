package car;

public class Cabriolet extends Car{

    public boolean isOpened;


    public Cabriolet(int id, String model, String color, int currentSpeed, boolean isOpened) {
        super(id, model, color, currentSpeed);
        this.isOpened = isOpened;
    }

    @Override
    public void drive() {
        System.out.println("Super puper cool drive...");
    }
}
