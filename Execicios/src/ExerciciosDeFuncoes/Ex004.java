package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número:");
        int number = input.nextInt();

        String result = positiveOrNegative(number);

        System.out.println(result);
    }

    public static String positiveOrNegative(int number) {

        String value = "";
        if (number > 0) {
            value = "Positivo";
        } else {
            value = "Negativo";
        }

        return value;
    }
}
