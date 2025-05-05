package EstruturasDecisao;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double firstTestGrade = input.nextDouble();
        System.out.println("Informe a segunda nota");
        double secondTestGrade = input.nextDouble();

        double avarage = (firstTestGrade + secondTestGrade) / 2;

        if (avarage >= 9) {
            System.out.println("Aprovado com Distinção, sua média é: " + avarage);
        } else if (avarage < 7) {
            System.out.println("Reprovado, sua média é: " + avarage);
        } else {
            System.out.println("Aprovado, sua média é: " + avarage);
        }
    }
}
