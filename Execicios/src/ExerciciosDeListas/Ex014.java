package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> questions = List.of("Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");
        List<String> answers = new ArrayList<>();

        for (String question : questions) {
            String answer = "";
            do {

            System.out.print(question + " (responda com 'sim' ou 'não'): ");

            answer = input.nextLine().toLowerCase();

                if (!answer.equals("sim") && !answer.equals("não")) {
                    System.out.println("Resposta inválida. Tente novamente.");
                }

            } while (!answer.equals("sim") && !answer.equals("não"));

            answers.add(answer);
        }

        int positiveAnswers = 0;

        for (String answer : answers) {
            if (answer.equals("sim")) {
                positiveAnswers++;
            }
        }

        String classification = "";

        if (positiveAnswers == 2) {
            classification = "Suspeita";
        } else if (positiveAnswers == 3 || positiveAnswers == 4) {
            classification = "Cúmplice";
        } else if (positiveAnswers == 5) {
            classification = "Assassino";
        } else {
            classification = "Inocente";
        }

        System.out.println("\nClassificação: " + classification);
    }
}