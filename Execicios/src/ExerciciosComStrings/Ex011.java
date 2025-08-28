package ExerciciosComStrings;

import java.io.IOException;
import java.util.*;

public class Ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int wordDraw = random.nextInt(words.size());
        String wordGallows = words.get(wordDraw).toUpperCase();

        int errors = 0;
        int maxErrors = 6;
        List<String> attempts = new ArrayList<>();

        List<Character> progress = new ArrayList<>();
        for (int i = 0; i < wordGallows.length(); i++) {
            progress.add('_');
        }

        System.out.println("===== Jogo da Forca =====");

        while (errors < maxErrors && progress.contains('_')) {
            System.out.println("Palavra: " + progress.toString().replaceAll(",", ""));
            System.out.println("Erros: " + errors + "/" + maxErrors);
            System.out.println("Letras já usadas: " + attempts);
            System.out.println("Digite uma letra: ");
            String letter = input.next().toUpperCase();

            if (attempts.contains(letter)) {
                System.out.println("Você ja tentou essa letra.\n");
                continue;
            }

            attempts.add(letter);

            if (wordGallows.indexOf(letter) >= 0) {
                for (int i = 0; i < wordGallows.length(); i++) {
                    if (wordGallows.charAt(i) == letter.charAt(0)) {
                        progress.set(i, letter.charAt(0));
                    }
                }
                System.out.println("Você acertou a letra!");
            } else {
                errors++;
                System.out.println("Você errou!");
            }
        }

        if (errors == maxErrors) {
        } else {
            System.out.println("\nParabéns! Você acertou: " + wordGallows + ".");
        }
    }

    public static List<String> words = Arrays.asList(
            "abacaxi", "computador", "janelao", "pinguim", "bicicleta",
            "estrela", "cachorro", "girafa", "morango", "violino",
            "carroca", "formiga", "camiseta", "dentista", "garrafa",
            "abstrato", "colherada", "elefante", "montanha", "passagem",
            "teclado", "campeao", "soldado", "pescador", "telefone",
            "buzinas", "cultura", "paciente", "lareira", "cachoeira",
            "goiabas", "batente", "visitar", "mistura", "feriado",
            "tomates", "limoeiro", "sabores", "planeta", "musical",
            "chuveiro", "cozinhar", "figueira", "alicate", "biblioteca",
            "torneira", "escovar", "mercado", "vitrine", "pincelada",
            "pioneiro", "romance", "trilhos", "pescaria", "cortinas",
            "lanterna", "carneiro", "padeiro", "janelao", "espelho",
            "massagem", "brinquedo", "canivete", "pastelão", "gigante",
            "pintura", "galinha", "navalha", "florescer", "tempesta",
            "curtume", "caderno", "serpente", "pintinho", "esmalte",
            "dedalhos", "marinha", "suspenso", "cabresto", "manivela",
            "explorar", "gravura", "moinhos", "alicate", "molduras",
            "jardins", "cartaz", "caravel", "protesto", "lapiseira",
            "corrida", "travesse", "vassoura", "chaveiro", "espantalho",
            "cimento", "cristais", "pistache", "leopardo", "cantil",
            "macarrao", "tigresa", "coragem", "camadas", "preguica",
            "aventure", "palmeira", "botinas", "xadrez", "rebanhos",
            "serrote", "trabalho", "vassoura", "garotos", "pedreiro",
            "tinture", "respeito", "guardado", "amarelas", "profetas",
            "margens", "talheres", "bonecas", "velharias", "caldeira",
            "buracos", "pingente", "ratinho", "abordar", "palhaco",
            "franquea", "sardinha", "cachorra", "valores", "oleiros",
            "bananas", "lapidar", "foguete", "peneiras", "bravura",
            "cordoes", "marginal", "batente", "esfinge", "rapadura",
            "tubarao", "quimicos", "abrigado", "caatinga", "brindado",
            "confete", "trilheiro", "profundo", "espelhos", "somente",
            "artista", "estudar", "colherem", "bamboles", "cimento",
            "corrente", "ligacao", "macaneta", "gravata", "colmeias",
            "suspense", "arejado", "filhotes", "caretas", "novelas",
            "aquarela", "doentes", "aventura", "misterio", "escorpiao",
            "granito", "cavalos", "londres", "travesse", "diversao",
            "carteira", "profisso", "mestrado", "cobertas", "volante",
            "anotado", "quebrado", "colherao", "guaxinim", "morcegos",
            "planetas", "pincelou", "melancia", "pintores", "passaros",
            "resoluto", "balanço", "goteiras", "cabanhas", "navegou",
            "ventanas", "formigas", "alcançar", "lampadas", "receitas",
            "brigando", "morcegos", "carangos", "futebol", "soldados",
            "temperos", "profundo", "pastores", "mexerica", "algodão",
            "padeiros", "enterrar", "amizades", "gritaria", "colherao",
            "janelas", "bolinhos", "floresta", "estreias", "passagem",
            "canteiro", "pedreira", "lapidado", "rebanhos", "solucoes",
            "torradas", "galinheiro", "salgados", "padeiros", "trilhoes",
            "roedores", "vontades", "melodias", "carangas", "presente",
            "castelos", "serraria", "martelos", "luzinhas", "banheiro",
            "pinturas", "piscinas", "varandas", "calçadas", "estrelar",
            "palmadas", "diversos", "brincado", "conversa", "sabedoria",
            "varreram", "lapiseira", "esponjas", "morcegos", "trilheira",
            "dourados", "baguetes", "parqueis", "estantes", "formigas",
            "trabalho", "resoluto", "alegria", "passadas", "carnaval",
            "viagens", "montaria", "teatros", "profetas", "cantores"
    );
}