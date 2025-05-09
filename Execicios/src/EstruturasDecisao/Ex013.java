package EstruturasDecisao;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe um número de 1 a 7:");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("O número informado representa domingo");
        } else if (number == 2) {
            System.out.println("O número informado representa segunda-feira");
        } else if (number == 3) {
            System.out.println("O número informado representa terça-feira");
        } else if (number == 4) {
            System.out.println("O número informado representa quarta-feira");
        } else if (number == 5) {
            System.out.println("O número informado representa quinta-feira");
        } else if (number == 6) {
            System.out.println("O número informado representa sexta-feira");
        } else if (number == 7) {
            System.out.println("O número informado representa sábado");
        } else {
            System.out.println("O número informado é invalido.");
        }
    }
}
