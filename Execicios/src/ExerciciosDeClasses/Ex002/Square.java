package ExerciciosDeClasses.Ex002;

public class Square {
    double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    public void changeSize(double newSize) {
        this.sideSize = newSize;
    }

    public double showSize() {
        return this.sideSize;
    }

    public double calcArea() {
        return this.sideSize * this.sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }
}