package ExerciciosDeClasses.Ex001;

public class Ex001 {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Vermelho", 70, "Borracha");

        System.out.println(ball1.showColor());

        ball1.changeColor("blue");

        System.out.println(ball1.showColor());
    }
}