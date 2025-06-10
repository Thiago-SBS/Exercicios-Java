package ExerciciosDeListas;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe as 4 notas do semestre:");

        double[] notes = new double[4];

        for (int i = 0; i < 4; i++) {
            notes[i] = input.nextDouble();
        }

        System.out.println("\nNota do primeiro teste: " + notes[0]);
        System.out.println("Nota do segundo teste:  " + notes[1]);
        System.out.println("Nota do terceiro teste: " + notes[2]);
        System.out.println("Nota do quarto teste:   " + notes[3]);


        double media = (notes[0] + notes[1] + notes[2] + notes[3]) / 4;

        System.out.println("\nMédia: " + media);

    }
}