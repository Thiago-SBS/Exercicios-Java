package EstruturasSequenciais;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Média bimestral\n");
        System.out.println("Primeira nota:");
        float firstCourseWork = input.nextFloat();
        System.out.println("Segunda nota:");
        float secondCourseWork = input.nextFloat();
        System.out.println("Terceira nota:");
        float firstTestGrade = input.nextFloat();
        System.out.println("Quarta nota:");
        float secondTestGrade = input.nextFloat();

        float avarage = (firstCourseWork + secondCourseWork + firstTestGrade + secondTestGrade) / 4;
        System.out.printf("A média é %.1f", avarage);
    }
}
