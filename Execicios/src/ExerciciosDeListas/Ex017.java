package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> jumps = new ArrayList<>();
        String name = "";

        do {
            System.out.println("\nPara finalizar digite 'sair'");
            System.out.print("Nome do Atleta: ");
            name = input.next();

            if (name.equals("sair")) break;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a distância do " + i + "º salto: ");
                double distance = input.nextDouble();
                jumps.add(distance);
            }

            System.out.println("\nAtleta: " + name);
            System.out.printf("Primeiro Salto: %.1f m\n", jumps.get(0));
            System.out.printf("Segundo Salto: %.1f m\n", jumps.get(1));
            System.out.printf("Terceiro Salto: %.1f m\n", jumps.get(2));
            System.out.printf("Quarto Salto: %.1f m\n", jumps.get(3));
            System.out.printf("Quinto Salto: %.1f m\n", jumps.get(4));

            double add = 0;

            for (double salto : jumps) {
                add += salto;
            }

            double average = add / jumps.size();

            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + name);
            System.out.print("Saltos: ");

            for (int i = 0; i < jumps.size(); i++) {
                System.out.print(jumps.get(i));

                if (i < jumps.size() - 1) {
                    System.out.print(" - ");
                }
            }

            System.out.printf("\nMédia dos saltos: %.1f m\n", average);

        } while (true);
    }
}