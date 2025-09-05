package ExerciciosDeClasses.Ex009;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Point p1 = new Point(0, 0);
        Rectangle rectangle = new Rectangle(10, 5, p1);

        int option;
        do {
            System.out.println("\n=== MENU RETÂNGULO ===");
            System.out.println("1 - Imprimir retângulo e centro");
            System.out.println("2 - Alterar largura");
            System.out.println("3 - Alterar altura");
            System.out.println("4 - Alterar vértice inferior esquerdo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    rectangle.print();
                    break;
                case 2:
                    System.out.print("Nova largura: ");
                    double width = input.nextDouble();
                    rectangle.setWidth(width);
                    System.out.println("Largura alterada!");
                    break;
                case 3:
                    System.out.print("Nova altura: ");
                    double height = input.nextDouble();
                    rectangle.setHeight(height);
                    System.out.println("Altura alterada!");
                    break;
                case 4:
                    System.out.print("Novo X do vértice inferior esquerdo: ");
                    double x = input.nextDouble();
                    System.out.print("Novo Y do vértice inferior esquerdo: ");
                    double y = input.nextDouble();
                    rectangle.getBottomLeftVertex().setX(x);
                    rectangle.getBottomLeftVertex().setY(y);
                    System.out.println("Vértice alterado!");
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }
}
