package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de linhas (1 a 20): ");
        int lines = input.nextInt();

        System.out.print("Digite o número de colunas (1 a 20): ");
        int columns = input.nextInt();

        drawFrame(lines, columns);
    }

    public static void drawFrame(int lines, int columns) {

        if (lines < 1) lines = 1;
        else if (lines > 20) lines = 20;

        if (columns < 1) columns = 1;
        else if (columns > 20) columns = 20;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < columns; j++) {

                if ((i == 0 || i == lines - 1) && (j == 0 || j == columns - 1)) {
                    System.out.print("+");
                }
                else if (i == 0 || i == lines - 1) {
                    System.out.print("-");
                }
                else if (j == 0 || j == columns - 1) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
