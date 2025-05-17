package EstruturasDecisao;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Imforme um número:");
        int value = input.nextInt();

        int even = value % 2;

        if (even == 0) {
            System.out.println("\nSeu número é par.");
        } else {
            System.out.println("\nSeu número é impar.");
        }
    }
}
