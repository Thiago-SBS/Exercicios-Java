package EstruturasSequenciais;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Farenheit para Celsius. \n");
        System.out.println("De uma temperatura em Celsius:");
        int celsius = input.nextInt();

        int farenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura é de " + farenheit  + "°f");
    }
}
