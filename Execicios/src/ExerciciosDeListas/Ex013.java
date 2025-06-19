package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> temperatures = new ArrayList<>();
        List<String> months = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");

        for (int i = 0; i < 12; i++) {
            System.out.printf("Informe a temperatura média de %s: ", months.get(i));
            temperatures.add(input.nextDouble());
        }

        double add = 0;
        for (double i : temperatures) {
            add += i;
        }
        double yearlyAverage = add / 12;

        System.out.printf("\nMédia anual das temperaturas: %.2f°C \n", yearlyAverage);
        System.out.println("Meses com temperatura acima da média:");

        for (int i = 0; i < 12; i++) {
            if (temperatures.get(i) > yearlyAverage) {
                System.out.printf("%s: %.2f°C \n", months.get(i), temperatures.get(i));
            }
        }
    }
}