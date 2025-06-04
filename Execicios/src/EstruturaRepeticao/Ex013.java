package EstruturaRepeticao;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o valor do carro:");
        double carPrice = input.nextDouble();

        int percentage = 0;
        int installments = 1;
        double addition = 0;
        double installmentsPrice = 0;

        while (percentage <= 30) {

            double totalPrice = carPrice;
            addition = (percentage / 100.0) * carPrice;
            totalPrice += addition;
            installmentsPrice = totalPrice / installments;

            System.out.println("\n===================================");
            System.out.printf("Preço inicial:          R$ %.2f\n", carPrice);
            System.out.println("Quantidade de parcelas: " + installments + "x");
            System.out.printf("Preço da parcela:       R$ %.2f\n", installmentsPrice);
            System.out.printf("\nPreço final: R$ %.2f", totalPrice);

            if (installments == 1) installments--;

            installments += 6;
            percentage += 3;
        }
    }
}