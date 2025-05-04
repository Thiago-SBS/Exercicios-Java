package EstruturasSequenciais;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o peso do peixe:");
        double fishWeight = input.nextDouble();

        double fine = 0;
        double extraWeiht = 0;

        while (50 < fishWeight) {
            fine = fine + 4;
            ++extraWeiht;
            fishWeight--;
        }

        System.out.println("\nResultados:");
        System.out.println("---------------------");
        System.out.printf("\nPeso sobressalente: %.2fKg", extraWeiht);
        System.out.printf("\nmulta: R$%.2f", fine);
    }
}
