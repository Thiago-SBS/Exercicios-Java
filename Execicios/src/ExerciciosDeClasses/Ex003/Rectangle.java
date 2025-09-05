package ExerciciosDeClasses.Ex003;

public class Rectangle {
    private double sideSizeA;
    private double sideSizeB;

    public Rectangle(double sideSizeA, double sideSizeB) {
        this.sideSizeA = sideSizeA;
        this.sideSizeB = sideSizeB;
    }

    public void changeSizeA(double newSize) {
        this.sideSizeA = newSize;
    }

    public void changeSizeB(double newSize) {
        this.sideSizeB = newSize;
    }

    public double showSizesA() {
        return this.sideSizeA;
    }

    public double showSizesB() {
        return this.sideSizeB;
    }

    public double calcArea() {
        return this.sideSizeA * this.sideSizeB;
    }

    public double calcPerimeter() {
        return (sideSizeB + sideSizeA) * 2;
    }

    public double getSideSizeA() {
        return sideSizeA;
    }

    public void setSideSizeA(double sideSizeA) {
        this.sideSizeA = sideSizeA;
    }

    public double getSideSizeB() {
        return sideSizeB;
    }

    public void setSideSizeB(double sideSizeB) {
        this.sideSizeB = sideSizeB;
    }
}