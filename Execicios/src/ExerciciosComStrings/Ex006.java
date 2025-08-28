package ExerciciosComStrings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> months = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");

        System.out.println("Informe sua data de nascimento: (dd/mm/aaaa)");
        String date = input.next();

        String regex = "\\d{2}/\\d{2}/\\d{4}";

        if (!date.matches(regex)) {
            System.out.println("Formato inválido.");
            return;
        }

        List<String> piece = Arrays.asList(date.split("/"));

        int month = Integer.parseInt(piece.get(1));

        System.out.println("Você nasceu em " + date.substring(0,2) + " de " + months.get(month - 1) + " de " + date.substring(6,10) + "!");
    }
}