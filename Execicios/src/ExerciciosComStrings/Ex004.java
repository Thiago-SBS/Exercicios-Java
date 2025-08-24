package ExerciciosComStrings;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.next();

        for (int i = 1; i <= name.length(); i++) {
            System.out.println(name.substring(0,i));
        }
    }
}