package EstruturasDecisao;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o salario:");
        double salary = input.nextDouble();

        double percent = 0;

        if (salary <= 280.00 ) {
            percent = 20;
        } else if (salary >= 281 && salary <= 699) {
            percent = 15;
        } else if (salary >= 700 && salary <= 1499) {
           percent = 10;
        } else if (salary > 1500) {
            percent = 5;
        } else {}

        double newSalary = salary + salary * (percent / 100.00);
        double increase = newSalary - salary;

        System.out.printf("\nsalário antes do reajuste: R$%.2f", salary);
        System.out.println("\nPercentual de aumento aplicado: " + percent + "%");
        System.out.printf("Valor do aumento: R$%.2f", increase);
        System.out.printf("\nNovo salário, após o aumento: R$%.2f", newSalary);
    }
}
