package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do item: R$ ");
        double cost = input.nextDouble();

        System.out.print("Digite a taxa de imposto em %: ");
        double rate = input.nextDouble();

        double taxCost = addTax(rate, cost);

        System.out.printf("Preço com imposto: R$ %.2f", taxCost);
    }

    public static double addTax(double taxRate, double cost) {

        double tax = cost * (taxRate / 100);
        return cost + tax;
    }
}