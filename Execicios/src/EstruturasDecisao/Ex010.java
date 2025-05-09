package EstruturasDecisao;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Imforme em que turno você estuda (M-matutino, V-Vespertino ou N- Noturno):");
        String shift = input.nextLine();

        if (shift.equals("M") || shift.equals("m")) {
            System.out.println("Bom dia!");
        } else if (shift.equals("V") || shift.equals("v")) {
            System.out.println("Boa tarde!");
        } else if (shift.equals("N") || shift.equals("n")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
