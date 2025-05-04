package EstruturasSequenciais;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho em m² da área a ser pintada:");
        double area = input.nextDouble();

        double areaWithClearance = area * 1.10;
        double litersRequired = areaWithClearance / 6;

        double litersPerCan = 18;
        double litersPerGallon = 3.6;
        double canPrice = 80.0;
        double gallonPrice = 25.0;

        int canRequired = (int) Math.ceil(litersRequired / litersPerCan);
        double cansPrice = canPrice * canRequired;

        int gallonRequired = (int) Math.ceil(litersRequired / litersPerGallon);
        double gallonsPrice = gallonPrice * gallonRequired;

        int mixedCans = (int) (litersRequired / litersPerCan);
        double rest = litersRequired - (mixedCans * litersPerCan);
        int mixedGallons = (int) Math.ceil(rest / litersPerGallon);
        double mixedPrice = (mixedCans * canPrice) + (mixedGallons * gallonPrice);

        System.out.println("\nOpção 1 - Latas 18L");
        System.out.println("-----------------------------------");
        System.out.println("Quantidade de latas: " + canRequired);
        System.out.println("Preço: R$" + cansPrice);

        System.out.println("\nOpção 2 - Galões 3,6L");
        System.out.println("-----------------------------------");
        System.out.println("Quantidade de galões: " + gallonRequired);
        System.out.println("Preço: R$" + gallonsPrice);

        System.out.println("\nOpção 3 - Latas e Galões");
        System.out.println("-----------------------------------");
        System.out.println("Latas: " + mixedCans);
        System.out.println("Galões: " + mixedGallons);
        System.out.println("Preço: R$" + mixedPrice);

    }
}
