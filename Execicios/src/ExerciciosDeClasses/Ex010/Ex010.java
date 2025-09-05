package ExerciciosDeClasses.Ex010;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FuelPump pump = new FuelPump("Gasolina", 5.49, 100.0);

        int option;
        do {
            System.out.println("\n=== Menu Bomba de Combustível ===");
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litros");
            System.out.println("3 - Alterar valor do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade de combustível");
            System.out.println("6 - Exibir status da bomba");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe o valor em R$: ");
                    double value = input.nextDouble();
                    pump.supplyByValue(value);
                    break;
                case 2:
                    System.out.print("Informe a quantidade em litros: ");
                    double liters = input.nextDouble();
                    pump.supplyByLiter(liters);
                    break;
                case 3:
                    System.out.print("Novo valor por litro: ");
                    double newValue = input.nextDouble();
                    pump.changeValue(newValue);
                    break;
                case 4:
                    System.out.print("Novo tipo de combustível: ");
                    String newFuel = input.nextLine();
                    pump.changeFuel(newFuel);
                    break;
                case 5:
                    System.out.print("Nova quantidade em litros: ");
                    double newAmount = input.nextDouble();
                    pump.changeFuelAmount(newAmount);
                    break;
                case 6:
                    pump.Status();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }
}
