package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> ages = new ArrayList<>();
        List<Double> heights = new ArrayList<>();
        int students = 2;
        double heightAdd = 0;

        for (int i = 0; i < students; i++) {
            System.out.printf("Aluno %d:%n", i + 1);
            System.out.print("Informe a idade: ");
            ages.add(input.nextInt());

            System.out.print("Informe a altura: ");
            heights.add(input.nextDouble());
            heightAdd += heights.get(i);
        }

        double heightAverage = heightAdd / students;

        int counter = 0;
        for (int i = 0; i < students; i++) {
            if (ages.get(i) > 13 && heights.get(i) < heightAverage) {
                counter++;
            }
        }

        System.out.println("\nResultado: " + counter);
    }
}