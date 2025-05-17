package EstruturasDecisao;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para saque (entre 10 e 999): ");
        String valor = input.nextLine();

        int hundred = 0;
        int dozen = 0;
        int unit = 0;
        int hundredNote = 0;
        int fiftyNote = 0;
        int tenNote = 0;
        int fiveNote = 0;
        int oneNote = 0;

        if (valor.length() > 3) {
            System.out.println("Valor de saque inválido.");
        } else if (valor.length() == 3) {
            hundred = Integer.parseInt(String.valueOf(valor.charAt(0)));
            dozen = Integer.parseInt(String.valueOf(valor.charAt(1))) ;
            unit = Integer.parseInt(String.valueOf(valor.charAt(2))) ;
        } else if (valor.length() == 2) {
            dozen = Integer.parseInt(String.valueOf(valor.charAt(0))) ;
            unit = Integer.parseInt(String.valueOf(valor.charAt(1))) ;
        } else if (valor.length() == 1) {
            unit = Integer.parseInt(String.valueOf(valor.charAt(0))) ;
        }

        while (hundred > 0) {
            hundredNote++;
            hundred--;
        }
        while (dozen > 0) {
            if (dozen >= 5) {
                fiftyNote++;
                dozen = dozen - 5;
            } else {
                tenNote++;
                dozen--;
            }
        }
        while (unit > 0) {
            if (unit >= 5) {
                fiveNote++;
                unit = unit -5;
            } else {
                oneNote++;
                unit--;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("----------------------");

        if (hundredNote > 0) {
            System.out.println(hundredNote + " Nota(s) de 100.");
        }
        if (fiftyNote > 0) {
            System.out.println(fiftyNote + " Nota(s) de 50.");
        }
        if (tenNote > 0) {
            System.out.println(tenNote + " Nota(s) de 10.");
        }
        if (fiveNote > 0) {
            System.out.println(fiveNote + " Nota(s) de 5.");
        }
        if (oneNote > 0) {
            System.out.println(oneNote + " Nota(s) de 1.");
        }
    }
}