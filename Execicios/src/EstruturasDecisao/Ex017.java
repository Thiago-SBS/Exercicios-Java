package EstruturasDecisao;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Imforme um ano:");
        int year = input.nextInt();

        int calc = year % 4;

        if (calc == 0) {
            System.out.println("\nO ano de " + year + " é bissexto.");
        } else {
            System.out.println("\nO ano de " + year +  " não é bissexto.");
        }
    }
}
