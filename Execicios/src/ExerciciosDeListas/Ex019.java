package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> votes = new ArrayList<>();
        List<String> systems = List.of("", "Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro");

        System.out.println("Enquete: Qual o melhor Sistema Operacional para servidores?");
        System.out.println("Digite um número entre 1 e 6. Digite 0 para encerrar.");

        while (true) {
            System.out.print("Seu voto: ");
            int vote = input.nextInt();

            if (vote == 0) {
                break;
            }

            if (vote >= 1 && vote <= 6) {
                votes.add(vote);
            } else {
                System.out.println("Voto inválido. Digite entre 1 e 6.");
            }
        }

        if (votes.isEmpty()) {
            System.out.println("Nenhum voto foi registrado.");
            return;
        }

        int totalVotes = votes.size();

        List<Integer> codes = new ArrayList<>();
        List<Integer> count = new ArrayList<>();


        for (int vote : votes) {
            int position = codes.indexOf(vote);
            if (position == -1) {
                codes.add(vote);
                count.add(1);
            } else {
                count.set(position, count.get(position) + 1);
            }
        }

            System.out.println("\nSistema Operacional     Votos   %");
            System.out.println("-------------------------------------------");

            int moreVoted = 0;
            int moreVotedIndex = 0;


        for (int i = 0; i < codes.size(); i++) {
            int code = codes.get(i);
            int quantity = count.get(i);
            double percentual = (quantity * 100.0) / totalVotes;

            System.out.printf("%-22s %5d   %.0f%%\n", systems.get(code), quantity, percentual);

            if (quantity > moreVoted) {
                moreVoted = quantity;
                moreVotedIndex = code;
            }
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Total                   %5d\n", totalVotes);

        double percentualMaisVotado = (moreVoted * 100.0) / totalVotes;

        System.out.printf("\nO Sistema Operacional mais votado foi o %s, com %d votos, correspondendo a %.0f%% dos votos.\n", systems.get(moreVotedIndex), moreVoted, percentualMaisVotado);
    }
}
