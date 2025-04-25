package EstruturasSequenciais;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Média bimestral\n");
        System.out.println("Primeira nota:");
        float grade1 = input.nextFloat();
        System.out.println("Segunda nota:");
        float grade2 = input.nextFloat();
        System.out.println("Terceira nota:");
        float grade3 = input.nextFloat();
        System.out.println("Quarta nota:");
        float grade4 = input.nextFloat();

        float avarage = (grade1 + grade2 + grade3 + grade4) /4;
        System.out.printf("A média é %.1f", avarage);
    }
}
