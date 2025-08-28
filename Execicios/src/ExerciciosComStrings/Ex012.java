package ExerciciosComStrings;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número de telefone:");
        String phoneNumber = input.next();

        String regex = "\\d{7}";
        String regex2 = "\\d{3}-\\d{4}";

        if (!phoneNumber.matches(regex) && !phoneNumber.matches(regex2)) {
            System.out.println("Formato inválido!");
        } else {
            System.out.println("Telefone possui 7 dígitos. Vou acrescentar o digito três na frente.");
            System.out.println("Numero corrigido: 3" + phoneNumber);
        }
    }
}