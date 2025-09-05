package ExerciciosDeClasses.Ex003;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o comprimento do local (em metros): ");
        double length = input.nextDouble();

        System.out.print("Informe a largura do local (em metros): ");
        double width = input.nextDouble();

        Rectangle local = new Rectangle(10, 5);

       double area = local.calcArea();
       double perimeter = local.calcPerimeter();

        System.out.print("Informe a área de cada piso (em m²): ");
        double floor = input.nextDouble();

        System.out.print("Informe o comprimento de cada rodapé (em metros): ");
        double footer = input.nextDouble();

        int qttFloor = (int) Math.ceil(area / floor);
        int qttFooter = (int) Math.ceil(perimeter / footer);

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Área do local: " + area + " m²");
        System.out.println("Perímetro do local: " + perimeter + " m");
        System.out.println("Quantidade de pisos necessária: " + qttFloor);
        System.out.println("Quantidade de rodapés necessária: " + qttFooter);
    }
}