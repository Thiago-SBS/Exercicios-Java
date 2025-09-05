package ExerciciosDeClasses.Ex002;

public class Ex002 {
    public static void main(String[] args) {
        Square s1 = new Square(20);

        System.out.println(s1.showSize());

        s1.changeSize(50);

        System.out.println(s1.showSize());

        System.out.println(s1.calcArea());
    }
}
