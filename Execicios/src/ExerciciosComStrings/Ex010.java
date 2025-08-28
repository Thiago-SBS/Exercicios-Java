package ExerciciosComStrings;

import java.util.List;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> units = List.of("zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove");
        List<String> tens = List.of("", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa");

        System.out.println("Digite um número de 0 e 99:");
        int number = input.nextInt();

        int ten = number / 10;
        int uni = number % 10;

        if (number > 99 || number < 0) {
            System.out.println("Número inválido.");
            return;
        }
        if (number < 20) {
            System.out.println(units.get(number));
        } else if (number % 10 == 0) {
            System.out.println(tens.get(ten));
        } else {
            System.out.println(tens.get(ten) + " e " + units.get(uni));
        }
    }
}
