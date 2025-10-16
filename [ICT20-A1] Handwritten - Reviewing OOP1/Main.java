package mainpack;

import com.Car;
import com.Car1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car object ...set with setter\n");
        Car car = new Car();
        car.setColor("red");
        car.setYear(2020);
        System.out.println("Color:" + car.getColor());
        System.out.println("Year:" + car.getYear());
        car.carStatus();

        System.out.println("\nCar1 object ...set with cons\n");
        Car1 car1 = new Car1("Blue", 2018);
        System.out.println("Color:" + car1.getColor());
        System.out.println("Year:" + car1.getYear());
        car1.carStatus();
    }
}
