package EstruturasSequenciais;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura:");
         double height = input.nextDouble();

        double weight = (72.7 * height) - 58;
        System.out.printf("\nSeu peso ideal é %.2fKg", weight);
    }
}
