package EstruturasSequenciais;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de área do trianulo.\n");
        System.out.println("De a área do cilculo:");
        double radius = input.nextDouble();

        double area = Math.PI * (Math.pow(radius, 2));

        System.out.printf("A área do circulo é %.2fm²", area);
    }
}
