package EstruturasSequenciais;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe 2 números inteiros e um numero quebrado:");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        float thirdNumber = input.nextFloat();

        float firstResult = (firstNumber * 2) + (secondNumber / 2);
        float secondResult = (firstNumber * 3) + thirdNumber;
        double thirdResult = Math.pow(thirdNumber, 3);

        System.out.println("\nResultados:");
        System.out.println("---------------------");
        System.out.println("Primeiro resultado: " + firstResult);
        System.out.println("Segundo resultado: " + secondResult);
        System.out.printf("Terceiro resultado: %.1f", thirdResult);
    }
}
