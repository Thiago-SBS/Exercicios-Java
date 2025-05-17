package EstruturasDecisao;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        double firstValue = input.nextDouble();
        System.out.println("Informe mais um número:");
        double secondValue = input.nextDouble();
        System.out.println("Agora informe qual operação você quer realiar (+, -, x ou /):");
        String operator = input.next();

        double result = 0;

        if (operator.equals("+")) {
            result = firstValue + secondValue;
        } else if (operator.equals("-")) {
            result = firstValue - secondValue;
        } else if (operator.equals("x")) {
            result = firstValue * secondValue;
        } else if (operator.equals("/")) {
            result = firstValue / secondValue;
        } else {
            System.out.println("Operador inválido");
            return;
        }

        double even = result % 2;
        double decimal = Math.ceil(result);

        System.out.println("\nO resultado da conta é: " + result);

        if (even == 0) {
            System.out.println("O resultado é um número par.");
        } else {
            System.out.println("O resultado é um número impar.");
        }

        if (result > 0) {
            System.out.println("O resultado é um número positivo.");
        } else {
            System.out.println("O resultado é um número negativo.");
        }

        if (result != decimal) {
            System.out.println("O resultado é um número decimal.");
        } else {
            System.out.println("O resultado é um número inteiro.");
        }
    }
}
