package EstruturaRepeticao;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        int center = input.nextInt();

        String result = "";
        String arrow = "* ";

        for (int i = 1; i <= center - 1; i++) {

            result += arrow;

            System.out.println(result);
        }

        for (int i = 1; i <= center; i++) {
            for (int j = i; j <= center; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
