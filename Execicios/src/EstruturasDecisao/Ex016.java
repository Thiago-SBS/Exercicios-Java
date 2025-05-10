package EstruturasDecisao;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora do 2º Grau, determine o valor de a:");
        double a = input.nextLong();

        if (a != 0) {

            System.out.println("Determine o valor de b:");
            double b = input.nextDouble();
            System.out.println("Determine o valor de c:");
            double c = input.nextDouble();
            double delta = Math.pow(b,2) - 4 * a * c;

            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("\nResultado: ");
            System.out.println("Delta é = " + delta);

            if (0 > delta) {
                System.out.println("A equação não possue raiz.");
            } else if (delta == 0) {
                System.out.println("x1= " + x1);
            } else {
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        } else {
            System.out.println("Não é uma equação do segundo grau.");
        }
    }
}
