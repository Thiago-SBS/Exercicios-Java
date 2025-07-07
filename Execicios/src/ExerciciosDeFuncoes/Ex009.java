package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        String result = reverseNumber(number);
        System.out.println("Número invertido: " + result);
    }

    public static String reverseNumber(int number) {
        String str = Integer.toString(number);
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
