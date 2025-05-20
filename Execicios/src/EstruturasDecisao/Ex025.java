package EstruturasDecisao;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Responda as seguintes peruntas com sim ou não:");
        System.out.println("Telefonou para a vítima?");
        String telephone = input.next();
        System.out.println("Esteve no local do crime?");
        String local = input.next();
        System.out.println("Mora perto da vítima?");
        String lives = input.next();
        System.out.println("Devia para a vítima?");
        String should = input.next();
        System.out.println("Já trabalhou com a vítima?");
        String work = input.next();

        int crime = 0;

        if (telephone.equals("sim")) {
            crime++;
        }
        if (local.equals("sim")) {
            crime++;
        }
        if (lives.equals("sim")) {
            crime++;
        }
        if (should.equals("sim")) {
            crime++;
        }
        if (work.equals("sim")) {
            crime++;
        }

        if (crime == 2) {
            System.out.println("Você é Suspeita.");
        } else if (crime == 3 || crime == 4) {
            System.out.println("Você é Cúmplice.");
        } else if (crime == 5) {
            System.out.println("Você é o Assassino.");
        } else {
            System.out.println("Você é Inocente.");
        }
    }
}
