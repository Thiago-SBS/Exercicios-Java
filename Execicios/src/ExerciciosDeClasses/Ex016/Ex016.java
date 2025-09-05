package ExerciciosDeClasses.Ex016;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tamagushi pet = new Tamagushi("Floquinho", 30, 80, 2);

        int option;
        do {
            System.out.println("\n-=- MENU TAMAGUSHI -=-");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Mostrar status");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Quanto de comida deseja dar? ");
                    int food = input.nextInt();
                    pet.toFeed(food);
                    break;
                case 2:
                    System.out.print("Por quanto tempo brincar (minutos)? ");
                    int time = input.nextInt();
                    pet.play(time);
                    break;
                case 3:
                    pet.status();
                    break;
                case 7:
                    System.out.println(pet.toString());
                    break;
            }

        } while (option != 0);

    }
}
