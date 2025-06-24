package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> carModels = new ArrayList<>();
        List<Double> consumptionRates = new ArrayList<>();

        System.out.println("Comparativo de Consumo de Combustível");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nVeículo " + i);
            System.out.print("Nome do modelo: ");
            String model = input.nextLine();
            carModels.add(model);

            System.out.print("Km por litro: ");
            double kmPerLiter = Double.parseDouble(input.nextLine());
            consumptionRates.add(kmPerLiter);
        }

        double distance = 1000.0;
        double fuelPrice = 2.25;

        double maxEfficiency = consumptionRates.get(0);
        int bestIndex = 0;

        for (int i = 1; i < consumptionRates.size(); i++) {
            if (consumptionRates.get(i) > maxEfficiency) {
                maxEfficiency = consumptionRates.get(i);
                bestIndex = i;
            }
        }

        System.out.println("\nRelatório Final");

        for (int i = 0; i < carModels.size(); i++) {
            double litersUsed = distance / consumptionRates.get(i);
            double cost = litersUsed * fuelPrice;

            System.out.printf("%d - %-15s - %5.1f km/l - %6.1f litros - R$ %6.2f\n", i + 1, carModels.get(i), consumptionRates.get(i), litersUsed, cost);
        }

        System.out.println("\nO menor consumo é do " + carModels.get(bestIndex) + ".");
    }
}