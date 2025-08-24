package ExerciciosComStrings;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.next();

        for (int i = 0; i != name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
