package EstruturasSequenciais;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo (em MB):");
        double fileSize = input.nextDouble();
        System.out.println("Informe a velocidade do link de internet (em Mbps):");
        double internetSpeed = input.nextDouble();

        double fileSizeBits = ((fileSize * 8) * 1024) * 1024;
        double internetSpeedBits = ((internetSpeed * 1024) * 1024);

        double downloadInSeconds = fileSizeBits / internetSpeedBits;
        double downloadInMinutes =  downloadInSeconds / 60;

        System.out.printf("\nO Download levará %.2f minutos.", downloadInMinutes);
    }
}