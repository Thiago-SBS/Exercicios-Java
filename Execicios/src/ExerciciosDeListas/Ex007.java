package ExerciciosDeListas;

import java.util.Arrays;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 5 numeros inteiros:");

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {

            numbers[i] = input.nextInt();

        }

        int plusCalc = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        int timesCalc = numbers[0] * numbers[1] * numbers[2] * numbers[3] * numbers[4];

        System.out.println("Números: " + Arrays.toString(numbers));
        System.out.println("Resultado da soma: " + plusCalc);
        System.out.println("Resultado da multiplicação: " + timesCalc);
    }

}