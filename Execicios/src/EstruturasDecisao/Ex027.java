package EstruturasDecisao;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Frutas a venda: [morango e maçã].");
        System.out.println("Informe a fruta que deseja comprar:");
        String fruits = input.nextLine();

        double strawberryKG = 0;
        double appleKG = 0;
        double straberryPrice = 0;
        double applePrice = 0;
        double totalPrice = 0;
        double fruitsPrice = 0;

        if (fruits.contains("morango") && fruits.contains("maçã")) {
            System.out.println("Quantos quilos de morango?");
            strawberryKG = input.nextDouble();
            System.out.println("Quantos quilos de maçã?");
            appleKG = input.nextDouble();
        } else if (fruits.equals("morango")) {
            System.out.println("Quantos quilos?");
            strawberryKG = input.nextDouble();
        } else if (fruits.equals("maça")) {
            System.out.println("Quantos quilos?");
            appleKG = input.nextDouble();
        } else {
            System.out.println("Não temos esta fruta a venda.");
            return;
        }

        double totalKG = strawberryKG + appleKG;

        if (strawberryKG > 5) {
            straberryPrice = 2.20 * strawberryKG;
        } else {
            straberryPrice = 2.50 * strawberryKG;
        }
        if (appleKG > 5) {
            applePrice = 1.50 * appleKG;
        } else {
            applePrice = 1.80 * appleKG;
        }

        if (strawberryKG > 0 && appleKG > 0) {
            fruitsPrice = straberryPrice + applePrice;
        } else if (strawberryKG > 0) {
            fruitsPrice = straberryPrice;
        } else if (appleKG > 0) {
            fruitsPrice = applePrice;
        }

        if (fruitsPrice > 25 || totalKG > 8.0) {
            double discount = fruitsPrice * (10.0 / 100.0);
            totalPrice = fruitsPrice - discount;
        } else {
            totalPrice = fruitsPrice;
        }

        System.out.printf("\nPreço: R$ %.2f", totalPrice);
    }
}