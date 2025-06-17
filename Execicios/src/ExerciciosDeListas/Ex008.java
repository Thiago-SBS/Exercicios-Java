package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> age = new ArrayList<>();
        List<Double> height = new ArrayList<>();

        String resultAge = " ";
        String resultHeight = " ";

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe a idade:");
            age.add(input.nextInt());
            System.out.println("Informe a altura:");
            height.add(input.nextDouble());
        }

        for (int i = 4; i >= 0; i--) {

            resultAge += age.get(i) + " ";
            resultHeight += height.get(i) + " ";

        }

        System.out.println("Idade:" + resultAge);
        System.out.println("Altura:" + resultHeight);
    }
}