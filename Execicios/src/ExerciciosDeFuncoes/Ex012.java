package ExerciciosDeFuncoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = input.next();

        String scrambledWord = shuffle(word);

        System.out.println("Palavra embaralhada: " + scrambledWord);
    }

    public static String shuffle(String word) {

        List<Integer> characters = new ArrayList<>();
        String scrambledWord = "";

        for (int i = 0; i < word.length(); i++) {

            int character = 0;

            while (characters.contains(character)) {

                character = (int)(Math.random() * word.length());


            }

            scrambledWord += word.charAt(character);
            characters.add(character);
        }

        return  scrambledWord;
    }
}
