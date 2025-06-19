package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> scores = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        double score = input.nextDouble();

        while (score != -1) {

            scores.add(score);
            score = input.nextDouble();
        }

        System.out.println("\n-=- Resultados -=-");

        System.out.println("a. Quantidade de valores lidos: " + scores.size());

        System.out.print("b. Notas na ordem informada: ");
        for (double i: scores) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("c. Notas na ordem inversa:");
        for (int i = scores.size() - 1; i >= 0; i--) {
            System.out.println(scores.get(i));
        }


        double add = 0;
        for (double i : scores) {
            add += i;
        }
        System.out.println("d. Soma das notas: " + add);

        double average = add / scores.size();
        System.out.println("e. Média das notas: " + average);

        int aboveAverage = 0;
        for (double i : scores) {
            if (i > average) {
                aboveAverage++;
            }
        }
        System.out.println("f. Quantidade de notas acima da média: " + aboveAverage);

        int belowSeven = 0;
        for (double i : scores) {
            if (i < 7) {
                belowSeven++;
            }
        }
        System.out.println("g. Quantidade de notas abaixo de 7: " + belowSeven);

        System.out.println("h. Programa encerrado. Obrigado!");
    }
}