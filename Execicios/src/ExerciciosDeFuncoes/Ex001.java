package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número para base: ");
        int base = input.nextInt();

        String text = "";

        for (int i = 0; i < base; i ++) {
            String result = makeTriangle(i);

            System.out.println(result);
        }
    }

    public static String makeTriangle(int index) {

        String text = "";

        for (int i = 0; i < index + 1; i++) {
            text += index + 1 + " ";
        }

        return text;
    }
}