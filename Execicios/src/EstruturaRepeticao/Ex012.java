package EstruturaRepeticao;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe seu salário:");
        double salary = input.nextDouble();
        System.out.println("\n=============================");
        System.out.println("Menu de opções:\n");
        System.out.println("1. Novo salário");
        System.out.println("2. Férias");
        System.out.println("3. Décimo terceiro");
        System.out.println("4. Sair");
        System.out.println("\nDigite a opção desejada:");
        int options = input.nextInt();

        double newSalary = 0;

        while (options !=  4) {

            if (options == 1) {

                int increasePercent = 0;

                if (salary > 600) {
                    increasePercent = 5;
                } else if (salary > 350) {
                    increasePercent = 10;
                } else {
                    increasePercent = 15;
                }

                double increase = (increasePercent / 100.0) * salary;
                newSalary = salary + increase;

                System.out.printf("\nNovo salário: R$ %.2f\n", newSalary);
            }

            if (options == 2){

                System.out.println("\n1. Salário Antigo");
                System.out.println("2. Salário Novo\n");
                System.out.println("Digite a opção desejada:");
                int salaryOptions = input.nextInt();

                double vacation = 0;

                if (salaryOptions == 1) {
                    vacation = (salary / 3) + salary;

                    System.out.printf("\nSalário + Ferias: R$ %.2f\n", vacation);
                } else if (salaryOptions == 2 && newSalary == 0) {
                    System.out.println("\nO novo salário não foi registrado.");
                } else if (salaryOptions == 2) {
                    vacation = (newSalary / 3) + newSalary;

                    System.out.printf("\nSalário + Ferias: R$ %.2f\n", vacation);
                } else {
                    System.out.println("Opção invalída.");
                }
            }

            if (options == 3) {
                System.out.println("\n1. Salário Antigo");
                System.out.println("2. Salário Novo\n");
                System.out.println("Digite a opção desejada:");
                int salaryOptions = input.nextInt();

                int months = 0;

                if (salaryOptions == 2 && newSalary == 0) {
                    System.out.println("\nO novo salário não foi registrado.");
                } else if (salaryOptions == 1) {
                    System.out.println("Informe seus meses trabalhados esse ano:");
                    months = input.nextInt();

                    double thirteenth = salary / 12;
                    double thirteenthSalary = thirteenth * months;

                    System.out.printf("Decimo terceiro: R$ %.2f\n", thirteenthSalary);
                } else if (salaryOptions == 2) {
                    System.out.println("Informe seus meses trabalhados esse ano:");
                    months = input.nextInt();

                    double thirteenth = newSalary / 12;
                    double thirteenthSalary = thirteenth * months;

                    System.out.printf("Decimo terceiro: R$ %.2f", thirteenthSalary);
                } else {
                    System.out.println("Opção invalída.");
                }
            }

            if (options > 4) {
                System.out.println("Opção invalída");
            }

            System.out.println("\n=============================");
            System.out.println("Menu de opções:\n");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.println("\nDigite a opção desejada:");
            options = input.nextInt();
        }
        System.out.println("\nPrograma finalizado");
    }
}