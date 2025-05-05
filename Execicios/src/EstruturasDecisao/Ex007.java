package EstruturasDecisao;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        int firstNumber = input.nextInt();
        System.out.println("Informe outro número:");
        int secondNumber = input.nextInt();
        System.out.println("Informe mais um número:");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("O maior número é: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("O maior número é: " + secondNumber);
        } else {
            System.out.println("O maior número é: " + thirdNumber);
        }

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("O menor número é: " + firstNumber);
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber){
            System.out.println("O menor número é: " + secondNumber);
        } else {
            System.out.println("O menor número é: " + thirdNumber);
        }
    }
}
