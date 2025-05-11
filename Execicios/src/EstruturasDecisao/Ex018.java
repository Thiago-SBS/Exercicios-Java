package EstruturasDecisao;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma data no formato dd/mm/aaaa:");
        String date = input.nextLine();

        int day = 0;
        int month = 0;
        int year = 0;
        int validDays = 0;

        if (date.length() != 10 || date.charAt(2) != '/'  || date.charAt(5) != '/') {
            System.out.println("O formato informado é invalido.");
            return;
        }

        day = Integer.parseInt(date.substring(0, 2));
        month = Integer.parseInt(date.substring(3, 5));
        year = Integer.parseInt(date.substring(6, 10));

        int leapYear = year % 4;

        if (leapYear == 0 && month == 2) {
            validDays = 29;
        } else if (leapYear != 0 && month == 2) {
            validDays = 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
           validDays = 31;
        } else  if (month == 4 || month == 6 || month == 9 || month == 11) {
            validDays = 30;
        }

        if (day > validDays) {
            System.out.println("O formato informado é invalido.");
        } else {
            System.out.println("O formato é informado valido");
        }
    }
}
