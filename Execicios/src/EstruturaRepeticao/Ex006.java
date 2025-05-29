package EstruturaRepeticao;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o valor da dívida:");
        double debt = input.nextDouble();

        double percentage = 0;
        double threeInstallmentsDebt = 0;
        double sixInstallmentsDebt = 0;
        double nineInstallmentsDebt = 0;
        double twelveInstallmentsDebt = 0;
        double threeInstallmentsPrice = 0;
        double sixInstallmentsPrice = 0;
        double nineInstallmentsPrice = 0;
        double twelveInstallmentsPrice = 0;
        double threeInstallmentsInerest = 0;
        double sixInstallmentsInerest= 0;
        double nineInstallmentsInerest = 0;
        double twelveInstallmentsInerest = 0;

        for (int i = 0; i <= 4; i++) {

            if (i == 1) {
                percentage = 10;
            } else if (i == 2) {
                percentage = 15;
            } else if (i == 3) {
                percentage = 20;
            } else if (i == 4) {
                percentage = 25;
            }

            double interestPercentage = (percentage / 100) * debt;
            double totalPrice = debt + interestPercentage;


            if (i == 1) {
                threeInstallmentsDebt = totalPrice;
                threeInstallmentsInerest = interestPercentage;
                threeInstallmentsPrice = totalPrice / 3;
            } else if (i == 2) {
                sixInstallmentsDebt = totalPrice;
                sixInstallmentsInerest = interestPercentage;
                sixInstallmentsPrice = totalPrice / 6;
            } else if (i == 3) {
                nineInstallmentsDebt = totalPrice;
                nineInstallmentsInerest = interestPercentage;
                nineInstallmentsPrice = totalPrice / 9;
            } else if (i == 4) {
                twelveInstallmentsDebt = totalPrice;
                twelveInstallmentsInerest = interestPercentage;
                twelveInstallmentsPrice = totalPrice / 12;
            }
        }

        System.out.println("Valor da Dívida / Valor dos juros / Quantidade de parcelas / valor da parcela");
        System.out.printf("R$ %.2f              0,00                    1               R$ %.2f\n", debt, debt);
        System.out.printf("R$ %.2f            %.2f                    3               R$ %.2f\n", threeInstallmentsDebt, threeInstallmentsInerest, threeInstallmentsPrice);
        System.out.printf("R$ %.2f            %.2f                    6               R$ %.2f\n", sixInstallmentsDebt, sixInstallmentsInerest, sixInstallmentsPrice);
        System.out.printf("R$ %.2f            %.2f                    9               R$ %.2f\n", nineInstallmentsDebt, nineInstallmentsInerest, nineInstallmentsPrice);
        System.out.printf("R$ %.2f            %.2f                   12               R$ %.2f\n", twelveInstallmentsDebt, twelveInstallmentsInerest, twelveInstallmentsPrice);
    }
}