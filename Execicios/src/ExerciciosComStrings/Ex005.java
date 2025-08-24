package ExerciciosComStrings;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.next();

        for (int i = name.length(); i >= 1; i--) {
            System.out.println(name.substring(0,i));
        }
    }
}