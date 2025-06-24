package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> votes = new ArrayList<>();


        System.out.println("Enquete: Quem foi o melhor jogador?");
        System.out.println("Digite o número do jogador (1 a 23). Digite 0 para encerrar.");

        while (true) {
            System.out.print("Número do jogador: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 1 || number > 23) {
                System.out.println("Número inválido! Digite entre 1 e 23.");
            } else {
                votes.add(number);
            }
        }

        if (votes.isEmpty()) {
            System.out.println("Nenhum voto foi computado.");
            return;
        }

        int totalVotes = votes.size();

        List<Integer> playerWithVote = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();

        for (int vote : votes) {
            int position = -1;

            for (int i = 0; i < playerWithVote.size(); i++) {
                if (playerWithVote.get(i) == vote) {
                    position = i;
                    break;
                    }
                }

                if (position == -1) {
                    playerWithVote.add(vote);
                    counter.add(1);
                } else {
                    counter.set(position, counter.get(position) + 1);
                }
            }

            System.out.println("\nResultado da votação:");
            System.out.println("Foram computados " + totalVotes + " votos.");
            System.out.println("Jogador\tVotos\t%");

            int moreVoted = 0;
            int bestPlayer = 0;

            for (int i = 0; i < playerWithVote.size(); i++) {
                int jogador = playerWithVote.get(i);
                int qtdVotos = counter.get(i);
                double percentual = (qtdVotos * 100.0) / totalVotes;

                System.out.printf("%d\t\t%d\t\t%.1f%%\n", jogador, qtdVotos, percentual);

                if (qtdVotos > moreVoted) {
                    moreVoted = qtdVotos;
                    bestPlayer = jogador;
                }
            }

            double percentualMelhor = (moreVoted * 100.0) / totalVotes;
            System.out.printf("\nO melhor jogador foi o número %d, com %d votos (%.1f%%).\n",
                    bestPlayer, moreVoted, percentualMelhor);

    }
}