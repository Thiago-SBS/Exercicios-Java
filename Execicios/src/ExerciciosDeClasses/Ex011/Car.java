package ExerciciosDeClasses.Ex011;

public class Car {
    private int litersPerKm;
    private int fuelTank;

    public Car(int litersPerKm) {
        this.litersPerKm = litersPerKm;
        this.fuelTank = 0;
    }

    public void ride(int km) {
        if (litersPerKm < fuelTank) {
            int consumption =  km * litersPerKm;

            if (consumption < fuelTank) {
                this.fuelTank -= km * litersPerKm;
                System.out.println("O carro andou " + km + "Km.");
            } else {
                System.out.println("Não há combustivel o suficiente!");
            }
        } else {
            System.out.println("Não há combustivel o suficiente!");
        }
    }

    public void seeFuelTank() {
        System.out.println("Quantidade de gasolina no tanque: " + fuelTank + " litros.");
    }

    public void obtainFuel(int fuel) {
        this.fuelTank = fuel;
        System.out.println("O tanque foi abastecido com " + fuel + " litros de gasolina.");
    }

    public int getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(int litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }
}