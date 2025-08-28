package ExerciciosComStrings;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra ou uma frase:");
        String phrase = input.nextLine();

        String normalPhrase = phrase.toLowerCase().replaceAll(" ", "");
        String invertedPhrase = new StringBuilder(normalPhrase).reverse().toString();

        if (normalPhrase.equals(invertedPhrase)) {
            System.out.println("Sua palavra ou frase é um palíndro.");
        } else {
            System.out.println("Sua palavra ou frase não é um palíndro.");
        }
    }
}