package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPaid = 0;
        int numberOfInstallments = 0;

        while (true) {
            System.out.print("Digite o valor da prestação (0 para sair): R$ ");
            double value = input.nextDouble();

            if (value == 0) {
                break;
            }

            System.out.print("Digite o número de dias em atraso: ");
            int daysLate = input.nextInt();

            double finalValue = paymentValue(value, daysLate);
            System.out.printf("Valor a ser pago: R$ %.2f\n\n", finalValue);

            totalPaid += finalValue;
            numberOfInstallments++;
        }

        System.out.println("\nRelatório do dia:");
        System.out.println("Quantidade de prestações pagas: " + numberOfInstallments);
        System.out.printf("Valor total pago: R$ %.2f%n", totalPaid);
    }

    public static double paymentValue(double value, int daysLate) {

        if (daysLate == 0) {
            return value;
        } else {
            double fine = value * 0.03;
            double fees = value * 0.001 * daysLate;
            return value + fine + fees;
        }
    }
}
