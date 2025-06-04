package EstruturaRepeticao;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva qualquer coisa:");
        String text = "mama co";

        String letters[] = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int numbers[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            for (int j = 0; j < letters.length; j++) {
                if (String.valueOf(c).equals(letters[j])) {
                    result += numbers[j];
                }
            }
        }

        System.out.println("\n" + result);
    }
}