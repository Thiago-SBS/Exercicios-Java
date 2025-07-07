package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        int digits = counter(number);

        System.out.println("Quantidade de dígitos: " + digits);
    }

    public static int counter(int number) {
        number = String.valueOf(number).length();
        return number;
    }
}
