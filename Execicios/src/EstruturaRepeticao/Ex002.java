package EstruturaRepeticao;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = input.nextInt();
        System.out.println("Type a exponent:");
        int exponent = input.nextInt();

        int result = 1;

        if (exponent == 0) {
            System.out.println("\nResult: " + result);
            return;
        } else if (exponent < 0) {
            exponent = -exponent;
        }

        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }

        System.out.println("\nResult: " + result);
    }
}
