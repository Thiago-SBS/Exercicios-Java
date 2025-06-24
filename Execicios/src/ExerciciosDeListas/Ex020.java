package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> salaries = new ArrayList<>();
        List<Double> bonuses = new ArrayList<>();

        System.out.println(" Projeção de Gastos com Abono");
        System.out.println("===============================");

        while (true) {
            System.out.print("Salário: ");
            double salary = input.nextDouble();

            if (salary == 0) {
                break;
            }

            salaries.add(salary);
        }

        double totalBonus = 0;
        double maxBonus = 0;
        int minBonusCount = 0;

        for (double salary : salaries) {
            double bonus = salary * 0.2;

            if (bonus < 100) {
                bonus = 100;
                minBonusCount++;
            }

            bonuses.add(bonus);
            totalBonus += bonus;

            if (bonus > maxBonus) {
                maxBonus = bonus;
            }
        }

        System.out.println("\nSalário     - Abono");
        for (int i = 0; i < salaries.size(); i++) {
            System.out.printf("R$ %8.2f - R$ %8.2f\n", salaries.get(i), bonuses.get(i));
        }

        System.out.println("\nForam processados " + salaries.size() + " colaboradores");
        System.out.printf("Total gasto com abonos:: R$ %.2f\n", totalBonus);
        System.out.println("Valor mínimo pago a " + minBonusCount + " colaboradores");
        System.out.printf("Maior valor de abono pago: R$ %.2f\n", maxBonus);
    }
}