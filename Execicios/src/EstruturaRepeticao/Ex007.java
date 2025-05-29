package EstruturaRepeticao;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n============== MENU ==============");
        System.out.println(" Especificação  Código   Preço");
        System.out.println("Cachorro Quente  100    R$ 1,20");
        System.out.println("Bauru Simple     101    R$ 1,30");
        System.out.println("Bauru com ovo    102    R$ 1,50");
        System.out.println("Hambúrguer       103    R$ 1,20");
        System.out.println("Cheeeseburguer   104    R$ 1,30");
        System.out.println("Refrigerante     105    R$ 1,00");
        System.out.println("=================================\n");
        System.out.println("Insira o código do pedido: (Para finalizar o pedido digite 0)");
        int code = input.nextInt();
        System.out.println("Insira a quantidade:");
        int quantity = input.nextInt();

        int hotDog = 0;
        int bauru = 0;
        int bauruWithEgg = 0;
        int hamburger = 0;
        int cheeseburger = 0;
        int soda = 0;
        double hotDogPrice = 1.20;
        double bauruPrice= 1.30;
        double bauruWithEggPrice = 1.50;
        double hamburgerPrice = 1.20;
        double cheeseburgerPrice = 1.30;
        double sodaPrice = 1.0;
        double totalPrice = 0;

        while (code != 0) {
            if (code == 100) {
                hotDog += quantity;
                hotDogPrice *= quantity;
                totalPrice += hotDogPrice;
            } else if (code == 101) {
                bauru += quantity;
                bauruPrice *= quantity;
                totalPrice += bauruPrice;
            } else if (code == 102) {
                bauruWithEgg += quantity;
                bauruWithEgg *= quantity;
                totalPrice += bauruWithEggPrice;
            } else if (code == 103) {
                hamburger += quantity;
                hamburgerPrice *= quantity;
                totalPrice += hamburgerPrice;
            } else if (code == 104) {
                cheeseburger += quantity;
                cheeseburgerPrice *= quantity;
                totalPrice += cheeseburgerPrice;
            } else if (code == 105) {
                soda += quantity;
                sodaPrice *= quantity;
                totalPrice += sodaPrice;
            }

            System.out.println("Insira o código do pedido: (Para finalizar o pedido digite 0)");
            code = input.nextInt();
            if (code == 0) break;
            System.out.println("Insira a quantidade:");
            quantity = input.nextInt();
        }

        System.out.println("=============== Fiscal Note ===================");
        System.out.println("   Lanche    Quantidade    Preço");

        if (hotDog > 0) {
            System.out.printf("Cachorro Quente  " + hotDog + "        R$ %.2f\n", hotDogPrice);
        }
        if (bauru > 0) {
            System.out.printf("Bauru Simples    " + bauru + "        R$ %.2f\n", bauruPrice);
        }
        if (bauruWithEgg > 0) {
            System.out.printf("Bauru com ovo    " + bauruWithEgg + "        R$ %.2f\n", bauruWithEggPrice);
        }
        if (hamburger > 0) {
            System.out.printf("Hambúrguer       " + hamburger + "        R$ %.2f\n", hamburgerPrice);
        }
        if (cheeseburger > 0) {
            System.out.printf("Cheeseburguer    " + cheeseburger + "        R$ %.2f\n", cheeseburgerPrice);
        }
        if (soda > 0) {
            System.out.printf("Refrigerante     " + soda + "        R$ %.2f\n", sodaPrice);
        }
        System.out.printf("\nPreço total: R$ %.2f", totalPrice);
    }
}
