package ExerciciosDeFuncoes;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Informe as horas (Para encerrar digite 0): ");
            String hours = input.next();

            if (hours.equals("0")) {
                break;
            }

            int hour = Integer.parseInt(hours.substring(0, 2));
            int minutes = Integer.parseInt(hours.substring(3, 5));

            String separation = String.valueOf(hours.charAt(2));

            while (!separation.equals(":") || hour > 23 || hour < 0 || minutes > 59 || minutes < 0) {
                System.out.println("Formato inválido.\n");

                System.out.print("Informe as horas: ");
                hours = input.next();

                separation = String.valueOf(hours.charAt(2));
            }

            String convertedHours = conversion(hour, minutes);

            System.out.println("Horas convertidas: " + convertedHours + "\n");
        }
    }

    public static String conversion(int hour, int minutes) {

        String convertedHours = "";

        if (hour > 12) {
            hour -= 12;
            convertedHours = hour + ":" + minutes + " pm";
        } else {
            convertedHours = hour + ":" + minutes + " am";
        }

        return convertedHours;
    }
}
