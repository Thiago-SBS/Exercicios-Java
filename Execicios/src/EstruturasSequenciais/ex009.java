package EstruturasSequenciais;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Farenheit para Celsius. \n");
        System.out.println("De uma temperatura em Farenheit:");
        int farenheit = input.nextInt();

        int celsius = 5 * (farenheit - 32) / 9;

        System.out.println("A temperatura é de " + celsius + "°c");

    }
}
