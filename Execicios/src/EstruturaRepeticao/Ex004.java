package EstruturaRepeticao;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lojas D.Dantas");
        System.out.println("=============================");
        System.out.println("Teclado: R$ 400,00");
        System.out.println("Mouse:   R$ 600,00");
        System.out.println("Fone:    R$ 1200,00");
        System.out.println("=============================");
        System.out.println("Insira o produto desejado: (Para encerrar digite 0)");
        String product = input.nextLine();
        System.out.println("Insira a quantidade: (Para encerrar digite 0)");
        int quantity = input.nextInt();

        int keyboardQuantity = 0;
        int mouseQuantity = 0;
        int headsetQuantity = 0;
        double keyboardPrice = 400;
        double mousePrice = 600;
        double headsetPrice = 1200;

        while (quantity > 0) {

            if (product.equals("teclado")) {
                keyboardQuantity = quantity;
            } else if (product.equals("mouse")) {
                mouseQuantity = quantity;
            } else if (product.equals("fone")) {
                headsetQuantity = quantity;
            }

            System.out.println("Insira o produto desejado: (Para encerrar digite 0)");
            product = input.next();
            if (product.equals("0")) {
                break;
            }
            System.out.println("Insira a quantidade:");
            quantity = input.nextInt();
        }

        System.out.println("Valor recebido:");
        double money = input.nextDouble();

        double totalPrice = (keyboardPrice * keyboardQuantity) + (mousePrice * mouseQuantity) + (headsetPrice * headsetQuantity);
        double change = money - totalPrice;

        if (money < totalPrice) {
            System.out.println("\nValor insuficiente.");
            System.out.printf("O preço total foi de: R$ %.2f", totalPrice);
            return;
        }

        System.out.println("\n============ Nota Fiscal ============");
        if (keyboardQuantity > 0) {
            System.out.printf("Teclado " + keyboardQuantity + "x : R$ %.2f\n", keyboardPrice);
        }
        if (mouseQuantity > 0) {
            System.out.printf("Mouse " + mouseQuantity + "x : R$ %.2f\n", mousePrice);
        }
        if (headsetQuantity > 0) {
            System.out.printf("Fone " + headsetQuantity + "x : R$ %.2f\n", headsetPrice);
        }
        System.out.printf("Total : R$ %.2f\n", totalPrice);
        System.out.printf("Dinheiro: R$ %.2f\n", money);
        System.out.printf("Troco: R$ %.2f\n", change);
    }
}