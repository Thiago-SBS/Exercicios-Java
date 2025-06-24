package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wages = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            wages.add(0);
        }

        System.out.print("Quantos vendedores? ");
        int sellers = scanner.nextInt();

        for (int i = 0; i < sellers; i++) {
            System.out.print("Digite o valor de vendas do vendedor #" + (i + 1) + ": ");
            double sales = scanner.nextDouble();

            double salary = 200 + (0.09 * sales);

            int j = (int) (salary / 100) - 2;

            if (j >= 8) {
                j = 8;
            }

            wages.set(j, wages.get(j) + 1);
        }

        List<String> caption = List.of ("$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
                "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 ou mais");

        System.out.println("\nsalários:");
        for (int i = 0; i < wages.size(); i++) {
            System.out.println(caption.get(i) + ": " + wages.get(i));
        }
    }
}