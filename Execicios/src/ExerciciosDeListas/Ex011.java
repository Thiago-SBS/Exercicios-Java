package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        List<String> letters = new ArrayList<>();
        List<String> symbols = new ArrayList<>();
        String result = " ";

        System.out.println("Informe 10 número inteiro:");

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        System.out.println("Informe 10 letras:");

        for (int i = 0; i < 10; i++) {
            letters.add(input.next());
        }

        System.out.println("Informe 10 simbolos:");

        for (int i = 0; i < 10; i++) {
            symbols.add(input.next());
        }

        for (int i = 0; i < 10; i++) {
            result += numbers.get(i) + " ";
            result += letters.get(i) + " ";
            result += symbols.get(i) + " ";
        }

        System.out.println("Resultado:" + result);
    }
}