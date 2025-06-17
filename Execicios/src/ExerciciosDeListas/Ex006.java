package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        List<Double> avarage = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o nome do aluno:");
            names.add(input.next());
            System.out.println("Informe as 4 notas do aluno:");
            double note1 = input.nextDouble();
            double note2 = input.nextDouble();
            double note3 = input.nextDouble();
            double note4 = input.nextDouble();

            avarage.add((note1 + note2 + note3 + note4) / 4);

        }

        for (int i = 0; i < 10; i++) {
            if (avarage.get(i) >= 7) {
                result++;
            }
        }

        System.out.println("Notas acima do 7: " + result);
    }
}