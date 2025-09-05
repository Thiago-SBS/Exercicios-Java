package ExerciciosDeClasses.Ex008;

public class Ex008 {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("Chip");
        Monkey m2 = new Monkey("Zé");

        m1.eat("Banana");
        m1.showStomach();

        m1.eat("Maçã");
        m1.showStomach();

        m1.digest();
        m1.showStomach();

        m2.eat("Manga");
        m2.showStomach();

        m2.eat("Uva");
        m2.showStomach();

        m2.eat("Melancia");
        m2.showStomach();

        m2.digest();
        m2.digest();
        m2.showStomach();

        m1.eat(m2.getName());
        m1.showStomach();
    }
}