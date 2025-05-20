package EstruturasDecisao;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n============= Tabela de carnes =============\n");
        System.out.println("               Até 5 Kg        Acima de 5 Kg");
        System.out.println("File Duplo: R$ 5,80 por Kg    R$ 4,90 por Kg");
        System.out.println("Alcatra:    R$ 6,80 por Kg    R$ 5,90 por Kg");
        System.out.println("Picanha:    R$ 7,80 por Kg    R$ 6,90 por Kg");
        System.out.println("============================================\n");

        System.out.println("Qual tipo de carne o senhor(a) deseja?");
        String meatType = input.nextLine();
        System.out.println("\nQuantos kilos de carne o senhor(a) deseja?");
        double meatKilograms = input.nextDouble();
        System.out.println("\nQual a forma de pagamento? (cartão de debito, credito ou tabajara)");
        String paymentMethod = input.next();

        double striploinPrice = 5.80 * meatKilograms;
        double rumpSteakPrice = 6.80 * meatKilograms;
        double rumpCapPrice = 7.80 * meatKilograms;
        double totalPrice = 0;
        double discount = 0;

        if (meatKilograms > 5) {
            striploinPrice = 4.90 * meatKilograms;
            rumpSteakPrice = 5.90 * meatKilograms;
            rumpCapPrice = 6.90 * meatKilograms;
        }

        if (meatType.equals("File Duplo")) {
            totalPrice = striploinPrice;
        } else if (meatType.equals("Alcatra")) {
            totalPrice = rumpSteakPrice;
        } else if (meatType.equals("Picanha")) {
            totalPrice = rumpCapPrice;
        }

        if (paymentMethod.equals("tabajara")) {
            discount = totalPrice * (5.0 / 100.0);
        }

        double priceWithDiscount = totalPrice - discount;

        System.out.println("\n========== Nota Fiscal ==========");
        System.out.printf("Peso Kg's:              %.2f Kg\n", meatKilograms);
        System.out.println("Forma de pagamento:     " + paymentMethod);
        System.out.printf("Preço:                  R$ %.2f\n", totalPrice);
        System.out.printf("Desconto:               R$ %.2f\n", discount);
        System.out.printf("\nValor a pagar:        R$ %.2f", priceWithDiscount);
    }
}
