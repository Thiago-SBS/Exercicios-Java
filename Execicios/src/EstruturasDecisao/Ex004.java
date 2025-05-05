package EstruturasDecisao;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma letra:");
        String letter = input.nextLine();

        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Sua letra é uma vogal.");
        } else {
            System.out.println("Sua letra é uma consoante.");
        }
    }
}
