package ExerciciosComStrings;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String phrase1 = input.nextLine();
        System.out.println("Escreva outra frase: ");
        String phrase2 = input.nextLine();

        System.out.println("\nPrimeira frase: " + phrase1 + " - Tamanho: " + phrase1.length());
        System.out.println("Segunda frase: " + phrase2 + " - Tamanho: " + phrase2.length());

        if (phrase1.length() == phrase2.length()) {
            System.out.println("Ambas as frases possuem o mesmo tamanho!");
        } else {
            System.out.println("As frases possuem tamanhos diferentes!");
        }
    }
}