package ExerciciosComStrings;

import java.util.List;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Character> letters = List.of('a','b','c','d','e','f','g','h','i','j', 'k','l','m','n','o','p',
                'q','r','s','t', 'u','v','w','x','y','z'
        );

        List<String> leet = List.of("4", "8", "<", "|)", "3", "|=", "6", "#", "1", "_|", "|<", "1", "/\\/\\",
                "|\\|", "0", "|*", "9", "|2", "5", "7", "|_|", "\\/", "\\/\\/", "><", "`/", "2");

        System.out.print("Digite um texto: ");
        String text = input.nextLine().toLowerCase();

        String textLeet = "";

        for (char c : text.toCharArray()) {
            int i = letters.indexOf(c);
            if (i != -1) {
                textLeet = textLeet + leet.get(i);
            } else {
                textLeet = textLeet + c;
            }
        }

        System.out.println("Texto em Leet Speak:" + textLeet);
    }
}
