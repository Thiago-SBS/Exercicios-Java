package EstruturasSequenciais;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quanto você recebe por hora:");
        double hourlyValue = input.nextDouble();
        System.out.println("Agora informe suas horas trabalhadas no mês:");
        int hoursWorked = input.nextInt();

        double grossSalary = hourlyValue * hoursWorked;
        double ir = (11 * 100) / grossSalary;
        double inss = (8 * 100) / grossSalary;
        double syndicate = (5 * 100) / grossSalary;
        double netSalary = grossSalary - ir - inss - syndicate;


        System.out.println("\nFolha de pagamento:");
        System.out.println("------------------------------");
        System.out.printf("\n+ Salário Bruto: R$%.2f", grossSalary);
        System.out.printf("\n- IR (11%%): R$%.2f", ir);
        System.out.printf("\n- INSS (8%%): R$%.2f", inss);
        System.out.printf("\n- Sindicato (5%%): R$%.2f", syndicate);
        System.out.printf("\nSalário Liquido: R$%.2f", netSalary);
    }
}
