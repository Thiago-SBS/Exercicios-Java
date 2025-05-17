package EstruturasDecisao;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        double value = input.nextDouble();

        double decimal = Math.ceil(value);

        if (value != decimal) {
            System.out.println("Seu número é decimal.");
        } else {
            System.out.println("Seu número é inteiro.");
        }
    }
}
