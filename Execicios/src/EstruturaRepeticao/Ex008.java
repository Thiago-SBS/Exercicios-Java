package EstruturaRepeticao;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do Atleta: (para encerrar o programa digite finalizar)");
        String name = input.nextLine();
        System.out.println("Informe a metragem os 5 saltos: (Ex: 1.0 2.0 3.0 4.0 5.0)");
        String jumpMeters = input.nextLine();

        while (!name.equals("finalizar")) {

            double firstJump = Double.parseDouble(jumpMeters.substring(0, 3));
            double secondJump = Double.parseDouble(jumpMeters.substring(4, 7));
            double thirdJump = Double.parseDouble(jumpMeters.substring(8, 11));
            double fourthJump = Double.parseDouble(jumpMeters.substring(12, 15));
            double fifthJump = Double.parseDouble(jumpMeters.substring(16, 19));
            double betterJump = Math.max(firstJump, Math.max(secondJump, Math.max(thirdJump, Math.max(fourthJump, fifthJump))));
            double wostJump = Math.min(firstJump, Math.min(secondJump, Math.min(thirdJump, Math.min(fourthJump, fifthJump))));
            double jumpAverage = (firstJump + secondJump + thirdJump + fourthJump + fifthJump) / 5;

            System.out.println("=========================");
            System.out.println("Atleta : " + name + "\n");
            System.out.println("Primeiro salto: " + firstJump + " m");
            System.out.println("Segundo salto:  " + secondJump + " m");
            System.out.println("Terceiro salto: " + thirdJump + " m");
            System.out.println("Quarto salto:   " + fourthJump + " m");
            System.out.println("Quinto salto:   " + fifthJump + " m\n");
            System.out.println("Melhor salto:   " + betterJump + " m");
            System.out.println("Pior salto:     " + wostJump + " m");
            System.out.println("Média dos saltos: " + jumpAverage + " m");
            System.out.println("=========================\n");

            System.out.println("Nome do Atleta: (para encerrar o programa digite finalizar)");
            name = input.nextLine();
            if (name.equals("finalizar")) return;
            System.out.println("Informe a metragem os 5 saltos: (Ex: 1.0 2.0 3.0 4.0 5.0)");
            jumpMeters = input.nextLine();
        }
    }
}