package EstruturasDecisao;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu sexo: (M ou F)");
         String sex = input.nextLine();

        if (sex.equals("M") || sex.equals("m")) {
            System.out.println("Você é do sexo masculino.");
        } else if (sex.equals("F") || sex.equals("f")) {
            System.out.println("Você é do sexo feminino.");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
