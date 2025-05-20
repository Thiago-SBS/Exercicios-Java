package EstruturasDecisao;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu salário por hora:");
        double hoursWage = input.nextDouble();
        System.out.println("Informe suas horas trabalhadas no mês:");
        double hoursWorked = input.nextDouble();

        double grosSalary = hoursWage * hoursWorked;
        double irPercent;
        double inss =grosSalary * (10.00 / 100.00);
        double fgts =grosSalary * (11.00 / 100.00);

        if (grosSalary <= 900) {
            irPercent = 0;
        } else  if (grosSalary <= 1500) {
            irPercent = 5;
        } else  if (grosSalary <= 2500) {
            irPercent = 10;
        } else  {
            irPercent = 20;
        }

        double ir = grosSalary * (irPercent / 100);
        double totalDiscont = ir + inss + fgts;
        double netSalary = grosSalary - ir - inss;

        System.out.println("===== Bilhete de pagamento =====");
        System.out.printf("\nSalário Bruto:      R$%.2f",grosSalary);
        System.out.printf("\n(-) IR (5%%):        R$%.2f", ir);
        System.out.printf("\n(-) INSS (10%%):     R$%.2f",inss);
        System.out.printf("\nFGTS (11%%):         R$%.2f",fgts);
        System.out.printf("\nTotal de descontos: R$%.2f", totalDiscont);
        System.out.printf("\nSalário Liquido:    R$%.2f",netSalary);
    }
}
