package ExerciciosDeClasses.Ex001;

public class Ball {
    public String color;
    public double circumference;
    public String material;

    public Ball(String color, double circumference, String material) {
        this.color = color;
        this.circumference = circumference;
        this.material = material;
    }

    public void changeColor(String newColor) {
            this.color = newColor;
    }

    public String showColor() {
        return this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}