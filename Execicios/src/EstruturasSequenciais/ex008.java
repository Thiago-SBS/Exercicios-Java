package EstruturasSequenciais;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quanto você recebe por hora:");
        double hourlyValue = input.nextDouble();
        System.out.println("Agora informe suas horas trabalhadas no mês:");
        int hoursWorked = input.nextInt();

        double wage = hourlyValue * hoursWorked;
        System.out.println("Seu salario é de R$" + wage + " por mês.");
    }
}
