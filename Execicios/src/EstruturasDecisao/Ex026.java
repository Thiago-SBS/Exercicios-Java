package EstruturasDecisao;

import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Litros vendidos:");
        int liters = input.nextInt();
        System.out.println("Tipo de combustível (A-álcool, G-gasolina)");
        String fuel = input.next();

        double discount = 0;
        double discountPrice = 0;
        double galinePrice = liters * 2.50;
        double alcoholPrice = liters * 1.90;


        if (fuel.equals("A")) {
            if (liters <= 20) {
                discount = 3;
            } else {
                discount = 5;
            }

            discountPrice = (alcoholPrice * (discount / 100)) + alcoholPrice;

        }
        if (fuel.equals("G")) {
            if (liters <= 20) {
                discount = 4;
            } else {
                discount = 6;
            }

            discountPrice = (galinePrice * (discount / 100)) + galinePrice;
        }

        System.out.printf("\nPreço: R$ %.2f", discountPrice);

    }
}
