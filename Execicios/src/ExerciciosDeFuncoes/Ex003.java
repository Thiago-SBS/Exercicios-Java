package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 valores:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int result = add(a, b, c);

        System.out.println(result);
    }

    public static int add(int a, int b, int c) {

        int result = a + b + c;
        return result;
    }
}