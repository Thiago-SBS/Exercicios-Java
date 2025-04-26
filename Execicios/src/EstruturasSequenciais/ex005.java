package EstruturasSequenciais;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("De um valor em metros para ser convertido para centímetros:");

        float meters = input.nextFloat();
        float centimeters = meters * 100;

        System.out.println("\nIsso da " + centimeters + " centímetros.");
    }
}
