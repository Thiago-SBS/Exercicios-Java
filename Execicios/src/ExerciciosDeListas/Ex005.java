package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 20 números:");

        int[] numbers = new int[20];
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            numbers[i] = input.nextInt();

            int calc = numbers[i] % 2;

            if (calc != 0) {
                odd.add(numbers[i]);
            } else {
                even.add(numbers[i]);
            }
        }

        System.out.println("Todos os números: " + Arrays.toString(numbers));
        System.out.println("Números par: " + even);
        System.out.println("Números ímpares: " + odd);
    }
}
