package EstruturasDecisao;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o preço do primeiro produto:");
        double firstProduct = input.nextDouble();
        System.out.println("Informe o preço do segundo produto:");
        double secondProduct = input.nextDouble();
        System.out.println("Informe o preço do terceiro produto:");
        double thirdProduct = input.nextDouble();

        if (firstProduct < secondProduct && firstProduct < thirdProduct) {
            System.out.println("Recomendo a compra do primeiro produto.");
        } else if (secondProduct < firstProduct && secondProduct < thirdProduct){
            System.out.println("Recomendo a compra do segundo produto.");
        } else {
            System.out.println("Recomendo a compra do terceiro produto.");
        }
    }
}
