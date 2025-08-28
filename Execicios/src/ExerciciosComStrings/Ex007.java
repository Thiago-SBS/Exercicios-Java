package ExerciciosComStrings;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int space = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println("Digite uma frase:");
        String phrase = input.nextLine();

        phrase = phrase.toLowerCase();

        for (int j = 0; j < phrase.length(); j++) {

            char c = phrase.charAt(j);

            if (c == ' ') {
                space++;
            } else if (c == 'a') {
                a++;
            } else if (c == 'e') {
                e++;
            } else if (c == 'i') {
                i++;
            } else if (c == 'o') {
                o++;
            } else if (c == 'u') {
                u++;
            }
        }

        System.out.println("========Resut========");
        System.out.println("Espaços vazios: " + space);
        System.out.println("Letra a:        " + a);
        System.out.println("Letra e:        " + e);
        System.out.println("Letra i:        " + i);
        System.out.println("Letra o:        " + o);
        System.out.println("Letra u:        " + u);
    }
}