package ExerciciosDeClasses.Ex017;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        List<AnimalFarm> farm = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int randomHunger = random.nextInt(11);
            int randomBoredom = random.nextInt(11);
            farm.add(new AnimalFarm("Bichinho " + i, randomHunger, randomBoredom));
        }

        int option;
        do {
            System.out.println("\n=== FAZENDA DE BICHINHOS ===");
            System.out.println("1 - Alimentar todos");
            System.out.println("2 - Brincar com todos");
            System.out.println("3 - Ouvir todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Quanto de comida dar a cada bichinho? ");
                    int food = input.nextInt();

                    for (AnimalFarm b : farm) {
                        b.toFeed(food);
                    }
                    break;

                case 2:
                    System.out.print("Quanto tempo brincar com cada bichinho? ");
                    int time = input.nextInt();

                    for (AnimalFarm b : farm) {
                        b.play(time);
                    }
                    break;

                case 3:
                    for (AnimalFarm b : farm) {
                        b.status();
                    }
            }
        } while (option != 0);
    }
}