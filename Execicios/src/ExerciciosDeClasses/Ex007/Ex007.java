package ExerciciosDeClasses.Ex007;

public class Ex007 {
    public static void main(String[] args) {
        Tamagushi pet = new Tamagushi("Floquinho", 30, 80, 2);

        System.out.println("Nome: " + pet.getName());
        System.out.println("Fome: " + pet.getHunger());
        System.out.println("Saúde: " + pet.getHealth());
        System.out.println("Idade: " + pet.getAge());
        System.out.println("Humor: " + pet.getMood());

        pet.setHunger(10);
        pet.setHealth(90);

        System.out.println("\nDepois de cuidar de " + pet.getName() + ":");
        System.out.println("Fome: " + pet.getHunger());
        System.out.println("Saúde: " + pet.getHealth());
        System.out.println("Humor: " + pet.getMood());
    }
}
