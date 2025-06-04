package EstruturaRepeticao;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva qualquer coisa:");
        String text = input.nextLine();

        String invertedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            invertedText += text.charAt(i);

        }

        System.out.println(invertedText);
    }
}