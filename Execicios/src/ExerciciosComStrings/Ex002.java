package ExerciciosComStrings;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.next();

        name = name.toUpperCase();

        for (int i = name.length() - 1; i >= 0 ; i--) {

            char character = name.charAt(i);
            System.out.print(character);
        }
    }
}
