package EstruturasDecisao;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 999:");
        String number = input.nextLine();

        if (number.length() == 1) {
            System.out.println("Seu número contém " + number.charAt(0) + " unidades.");
        } else if (number.length() == 2) {
            System.out.println("Seu número contém " + number.charAt(0) + "dezenas e " + number.charAt(1) + " unidades.");
        } else if (number.length() == 3) {
            System.out.println("Seu número contém " + number.charAt(0) + " centenas, " + number.charAt(1) + " dezenas e " + number.charAt(2) + " unidades.");
        } else {
            System.out.println("O número informado é invalido");
        }
    }
}
