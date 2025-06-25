package ExerciciosDeListas;

import java.util.ArrayList;
import java.util.List;

public class Ex023 {
    public static void main(String[] args) {

        List<String> names = List.of("Alexandre", "Anderson", "Antonio", "Carlos", "Cesar", "Rosemary");
        List<Integer> weight = List.of(456123789, 1245698456, 123456456, 91257581, 987458, 789456125);
        List<Double> weightPercent = new ArrayList<>();

        long totalPercent = 0;

       for (int i = 0; i < weight.size(); i++) {
           totalPercent += weight.get(i);
       }

       for (int i = 0; i < weight.size(); i++) {

           double percent = (double) weight.get(i) / totalPercent * 100;
           weightPercent.add(percent);
       }

        System.out.println("ACME Inc.               Uso do espaço em disco pelos usuários");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Nr.   Usuário   Espaço Utilizado   % do Uso");

        for (int i = 0; i < names.size(); i++) {

            double mb = (double) weight.get(i) / (1024 * 1024);

            System.out.printf("%d  %-15s %.2f MB %.2f %%\n", i + 1, names.get(i), mb, weightPercent.get(i));
        }

        double totalSpace = (double) totalPercent / (1024 * 1024);
        double averageSpace = totalSpace / weight.size();

        System.out.printf("\nEspaço total ocupado: %.2f MB\n", totalSpace);
        System.out.printf("Espaço médio ocupado: %.2f MB\n", averageSpace);
    }
}
