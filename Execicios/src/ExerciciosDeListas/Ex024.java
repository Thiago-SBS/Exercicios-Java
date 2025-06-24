package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;

public class Ex024 {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            count.add(0);
        }

        for (int i = 0; i < 100; i++) {
            int dice = (int)(Math.random() * 6) + 1;
            results.add(dice);

            int position = dice - 1;
            count.set(position, count.get(position) + 1);
        }

        System.out.println("Resultado dos lançamentos:");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Valor %d: %d vezes\n", i + 1, count.get(i));
        }
    }
}