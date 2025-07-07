package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Jogo de Craps ==========");
        System.out.println("Pressione ENTER para jogar os dados:");
        scanner.nextLine();

        int result = rollDices();

        if (result == 7 || result == 11) {
            System.out.println("Natural! Você ganhou!");
        } else if (result == 2 || result == 3 || result == 12) {
            System.out.println("Craps! Você perdeu!");
        } else {
            int points = result;
            System.out.println("Seu ponto é: " + points);
            System.out.println("Continue jogando até tirar " + points + " novamente. Se sair 7, você perde.");

            while (true) {
                System.out.println("Pressione ENTER para jogar novamente:");
                scanner.nextLine();

                int newResult = rollDices();

                if (newResult == points) {
                    System.out.println("Você tirou seu ponto! Você ganhou!");
                    break;
                } else if (newResult == 7) {
                    System.out.println("Você tirou 7. Você perdeu!");
                    break;
                } else {
                    System.out.println("Tente novamente...");
                }
            }
        }
    }

    public static int rollDices() {
        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        int add = firstDice + secondDice;

        System.out.println("Você tirou: " + firstDice + " + " + secondDice + " = " + add);
        return add;
    }
}