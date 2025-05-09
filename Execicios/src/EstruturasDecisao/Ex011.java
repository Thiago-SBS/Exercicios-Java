package EstruturasDecisao;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o salario:");
        double salary = input.nextDouble();

        if (salary <= 280.00 ) {

            double newSalary = salary + salary * (20.00 / 100.00);
            double increase = newSalary - salary;

            System.out.printf("\nsalário antes do reajuste: R$%.2f", salary);
            System.out.println("\nPercentual de aumento aplicado: 20%");
            System.out.printf("Valor do aumento: R$%.2f", increase);
            System.out.printf("\nNovo salário, após o aumento: R$%.2f", newSalary);

        } else if (salary >= 281 || salary <= 699) {

            double newSalary = salary + salary * (15.00 / 100.00);
            double increase = newSalary - salary;

            System.out.printf("\nsalário antes do reajuste: R$%.2f", salary);
            System.out.println("\nPercentual de aumento aplicado: 15%");
            System.out.printf("Valor do aumento: R$%.2f", increase);
            System.out.printf("\nNovo salário, após o aumento: R$%.2f", newSalary);

        } else if (salary >= 700 || salary <= 1499) {

            double newSalary = salary + salary * (10.00 / 100.00);
            double increase = newSalary - salary;

            System.out.printf("\nsalário antes do reajuste: R$%.2f", salary);
            System.out.println("\nPercentual de aumento aplicado: 10%");
            System.out.printf("Valor do aumento: R$%.2f", increase);
            System.out.printf("\nNovo salário, após o aumento: R$%.2f", newSalary);

        } else if (salary > 1500) {

            double newSalary = salary + salary * (5.00 / 100.00);
            double increase = newSalary - salary;

            System.out.printf("\nsalário antes do reajuste: R$%.2f", salary);
            System.out.println("\nPercentual de aumento aplicado: 5%");
            System.out.printf("Valor do aumento: R$%.2f", increase);
            System.out.printf("\nNovo salário, após o aumento: R$%.2f", newSalary);
        }
    }
}
