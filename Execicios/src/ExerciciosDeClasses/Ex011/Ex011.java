package ExerciciosDeClasses.Ex011;

public class Ex011 {
    public static void main(String[] args) {

        Car car1 = new Car(10);

        car1.ride(30);
        car1.seeFuelTank();
        car1.obtainFuel(50);
        car1.seeFuelTank();
        car1.ride(4);
        car1.seeFuelTank();
        car1.ride(2);
    }
}