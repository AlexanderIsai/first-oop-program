import car.Cabriolet;
import car.Car;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


//        Car a = new Car(1, "BMW E34", "black", 0);
//        Car b = new Car(2, "TESLA X", "red", 0);

//        a.id = 1;
//        b.id = 2;
//
//
//        a.model = "BMW E34";
//        b.model = "TESLA X";
//
//        a.color = "black";
//

        Car car = new Car(1, "BMW E34", "black", 0);
        Cabriolet cabriolet = new Cabriolet(2, "TESLA X", "red", 0, true);

        car.drive();
        cabriolet.drive();
        cabriolet.isOpened = true;

        String str = "a";
        String str1 = "ab";
        String str2 = "abc";
        String str4 = "abc";

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str4.hashCode());

        Date date = new Date(15 - 10 - 2022);

    }
}