import Equipment.Car;
import Equipment.Ship;
import Equipment.Teapot;

public class Main {
    public static void main(String[] args) {

        Teapot teapot = new Teapot("Teapot", "SUPEEEER");
        Car car = new Car("TAZ210000000", "The best CAR in the world!");
        Ship ship = new Ship("Volandemor", "Super ship.");


        teapot.Show();
        teapot.Description();
        teapot.Sound();

        System.out.println("=======================");

        car.Show();
        car.Description();
        car.Sound();

        System.out.println("=======================");

        ship.Show();
        ship.Description();
        ship.Sound();
    }
}
