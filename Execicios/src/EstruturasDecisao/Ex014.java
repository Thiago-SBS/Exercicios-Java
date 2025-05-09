package EstruturasDecisao;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double firstTestScore = input.nextDouble();
        System.out.println("Informe a segunda nota:");
        double secondTestScore = input.nextDouble();

        double avarage = (firstTestScore + secondTestScore) / 2;

        if (avarage <= 3.99) {
            System.out.println("Conceito: E");
        } else  if (avarage <= 5.99) {
            System.out.println("Conceito: D");
        } else  if (avarage <= 7.4) {
            System.out.println("Conceito: C");
        } else  if (avarage <= 8.99) {
            System.out.println("Conceito: B");
        } else  if (avarage <= 10) {
            System.out.println("Conceito: A");
        } else {}
    }
}
