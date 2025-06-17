package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int result = 0;

        System.out.println("Informe 10 número inteiro");

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());

            result += numbers.get(i);
        }

        System.out.println("Resultado da soma dos números: " + result);
    }
}