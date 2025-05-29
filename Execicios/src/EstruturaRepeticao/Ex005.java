package EstruturaRepeticao;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o salário inicial:");
        double salary = input.nextDouble();

        int startYear = 1996;
        int year = LocalDate.now().getYear();
        double increasePercent = 1.5;
        double increase = 0;

        while (startYear < year) {
            increase = (increasePercent / 100) * salary;
            salary += increase;
            increasePercent *= 2;
            startYear++;
        }


        System.out.printf("R$ %.2f", salary);
    }
}
