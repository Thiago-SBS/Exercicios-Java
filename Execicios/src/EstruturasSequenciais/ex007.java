package EstruturasSequenciais;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho de um dos lados do quadrado:");
        float side = input.nextFloat();

        double area = Math.pow(side, 2) * 2;

        System.out.printf("O dobro da area do quadrado é " + area);
    }
}
