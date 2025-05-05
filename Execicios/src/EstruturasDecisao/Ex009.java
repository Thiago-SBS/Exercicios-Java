package EstruturasDecisao;

import java.util.*;

public class Ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe 3 numeros diferentes:");
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            number.add(input.nextInt());
        }
        number.sort(Collections.reverseOrder());

        System.out.println(number);
    }
}