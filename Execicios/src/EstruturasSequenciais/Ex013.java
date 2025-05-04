package EstruturasSequenciais;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura:");
        double height = input.nextDouble();

        double manWeight = (72.7 * height) - 58;
        double womanWeight = (62.1 * height) - 44.7;

        System.out.printf("\nPeso ideal para homens: %.2fKg", manWeight);
        System.out.printf("\nPeso ideal para mulheres: %.2fkg", womanWeight);
    }
}
