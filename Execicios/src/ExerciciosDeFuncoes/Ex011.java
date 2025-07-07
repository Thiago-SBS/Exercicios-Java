package ExerciciosDeFuncoes;

import java.util.List;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String date = input.next();

        int day = Integer.parseInt(date.substring(0,2));
        int month = Integer.parseInt(date.substring(3,5));
        int year = Integer.parseInt(date.substring(6,10));
        String firstSeparation = String.valueOf(date.charAt(2));
        String secondSeparation = String.valueOf(date.charAt(5));

       String extensiveDate = extensiveDate(day, month, year, firstSeparation, secondSeparation);

        System.out.println(extensiveDate);
    }

    public static String extensiveDate (int day, int month, int year, String firstSeparation, String secondSeparation) {

        List<String> months = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
        String invalidFormat = "Formato Invalido!";

        if (month > 12 || !firstSeparation.equals("/") || !secondSeparation.equals("/")) {
            return invalidFormat;
        } else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return invalidFormat;
        } else if (month == 2 && day > 29) {

            int leapYear = year % 4;

            if (leapYear != 0 && day == 29) {
                return invalidFormat;
            }
        }

        return day + " de " + months.get(month - 1) + " de " + year;
    }
}