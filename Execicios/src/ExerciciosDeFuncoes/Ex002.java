package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número para base:");
        int base = input.nextInt();

        String text = "";

        for (int i = 0; i < base; i++) {
            String result = makeTriangle(i, text);

            text = result;

            System.out.println(result);
        }
    }

    public static String makeTriangle(int index, String result) {

        int add = index + 1;
        result += add + " ";
        return result;
    }
}