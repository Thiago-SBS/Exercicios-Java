package EstruturasSequenciais;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho em m² da área a ser pintada:");
        double area = input.nextDouble();

        double litersRequired = area / 3;
        int canRequired = (int) Math.ceil(litersRequired / 18);
        double totalprice = canRequired * 80;

        System.out.println("\nQuantidade de latas necessarias: " + canRequired );
        System.out.println("Preço: R$" +  totalprice);

    }
}
