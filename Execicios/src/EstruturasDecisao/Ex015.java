package EstruturasDecisao;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipos de Triângulos\n");
        System.out.println("Diga o tamanho do lado A do triângulo:");
        short a = input.nextShort();
        System.out.println("Diga o tamanho do lado B do triângulo:");
        short b = input.nextShort();
        System.out.println("Diga o tamanho do lado C do triângulo");
        short c = input.nextShort();

        if (a<=0 ^ b<=0 ^ c<=0) {
            System.out.println("Não forma um triângulo.");
        } else if (a==b && b==c) {
            System.out.println("É um triângulo equilátero.");
        } else if (a==b ^ b==c ^ a==c) {
            System.out.println("É um triângulo isóseles.");
        } else if (a!=b && b!=c && a!=c) {
            System.out.println("É um triângulo escaleno.");
        }
    }
}
