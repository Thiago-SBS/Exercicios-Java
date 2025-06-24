package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> defects = new ArrayList<>();

        System.out.println("Cadastro de Defeitos de Mouses");
        System.out.println("=================================");
        System.out.println("Tipos de defeito:");
        System.out.println("1 - necessita da esfera");
        System.out.println("2 - necessita de limpeza");
        System.out.println("3 - necessita troca do cabo ou conector");
        System.out.println("4 - quebrado ou inutilizado");
        System.out.println("Digite 0 como ID para encerrar.\n");

        while (true) {
            System.out.print("ID do mouse: ");
            int id = input.nextInt();

            if (id == 0) break;

            System.out.print("Código do defeito (1-4): ");
            int defectCode = input.nextInt();

            if (defectCode >= 1 && defectCode <= 4) {
                defects.add(defectCode);
            } else {
                System.out.println("Código inválido. Digite um número entre 1 e 4.");
            }
        }

        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            counts.add(0);
        }

        for (int code : defects) {
            int index = code - 1;
            counts.set(index, counts.get(index) + 1);
        }

        int total = defects.size();
        List<String> defectDescriptions = List.of("1- necessita da esfera", "2- necessita de limpeza", "3- necessita troca do cabo ou conector", "4- quebrado ou inutilizado"
        );

        System.out.println("\nRelatório de Defeitos");
        System.out.println("Quantidade de mouses: " + total);
        System.out.println("\nSituação               Quantidade    Percentual");

        for (int i = 0; i < 4; i++) {
            int qty = counts.get(i);
            double percent = (qty * 100.0) / total;
            System.out.println(defectDescriptions.get(i) + " - " + qty + " mouses - " + (int)percent + "%");
        }
    }
}