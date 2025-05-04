package EstruturasSequenciais;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Média bimestral\n");
        System.out.println("Primeira nota:");
        float firstTestGrade = input.nextFloat();
        System.out.println("Segunda nota:");
        float secondTestGrade = input.nextFloat();
        System.out.println("Terceira nota:");
        float thirdTestGrade = input.nextFloat();
        System.out.println("Quarta nota:");
        float fourthTestGrade = input.nextFloat();

        float avarage = (firstTestGrade + fourthTestGrade + thirdTestGrade + fourthTestGrade) / 4;
        System.out.printf("A média é %.1f", avarage);
    }
}
