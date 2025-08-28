package ExerciciosComStrings;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um CPF no formato (xxx.xxx.xxx-xx):");
        String cpf = input.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        if (!cpf.matches(regex)) {
            System.out.println("Formato inválido!");
        } else {
            System.out.println("Formato válido!");
        }
    }
}