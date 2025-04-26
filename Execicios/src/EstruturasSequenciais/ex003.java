package EstruturasSequenciais;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um número:");
        int firtNumber = input.nextInt();
        System.out.println("Escolha mais um:");
        int secondNumber = input.nextInt();
        System.out.println("A soma dos valores é " + (firtNumber + secondNumber));
    }
}
