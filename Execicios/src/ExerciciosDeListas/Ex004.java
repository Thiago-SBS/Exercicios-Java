package ExerciciosDeListas;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe 10 letras:");

        String[] letters = new String[10];
        String[] vowels = {"a", "e", "i", "o", "u"};
        String result = "";

        for (int i = 0; i < 10; i++) {

            letters[i] = input.next().toLowerCase();

            boolean isVowel = false;

            for (int j = 0; j < 5; j++) {
               if (letters[i].equals(vowels[j])) {
                   isVowel = true;
                   break;
               }
            }

            if (!isVowel) {
                result += letters[i];
            }
        }

        System.out.println("\nConsoaltes: " + result);
        System.out.println("Quantidade: " + result.length());
    }
}