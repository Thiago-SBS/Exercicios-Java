package EstruturasDecisao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        int firstNumber = input.nextInt();
        System.out.println("Informe outro número:");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("O maior número é: " + firstNumber);
        } else {
            System.out.println("O maior número é: " + secondNumber);
        }
    }
}