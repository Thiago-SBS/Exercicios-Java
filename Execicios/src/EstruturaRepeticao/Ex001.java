package EstruturaRepeticao;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int startNumber = input.nextInt();
        System.out.println("Informe mais um numero:");
        int endNumber = input.nextInt();

        if (startNumber == endNumber) {
            System.out.println("Ambos os numeros são iguais.");
            return;
        }

        while (startNumber != endNumber) {
           if (startNumber < endNumber) {
               System.out.println(startNumber);
               startNumber++;
           } else {
               System.out.println(endNumber);
               endNumber++;
           }
        }

        System.out.println(startNumber);

    }
}
