package EstruturasDecisao;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double firstTestGrade = input.nextDouble();
        System.out.println("Informe a segunda nota:");
        double secondTestGrade = input.nextDouble();
        System.out.println("Informe a terceira nota:");
        double thirdTestGrade = input.nextDouble();

        double media = (firstTestGrade + secondTestGrade + thirdTestGrade) / 3;

        if (media < 7) {
            System.out.println("\nReprovado");
        } else if (media == 10) {
            System.out.println("\nAprovado com Distinção");
        } else {
            System.out.println("\nAprovado");
        }
    }
}
