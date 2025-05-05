package EstruturasDecisao;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Seu número é par.");
        } else {
            System.out.println("Seu numero é impar.");
        }
    }
}
