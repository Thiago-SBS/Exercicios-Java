package ExerciciosDeClasses.Ex012;

public class Ex012 {
    public static void main(String[] args) {
        InvestmentAccount i1 = new InvestmentAccount(1000, 10);

        System.out.println("Saldo inicial: R$ " + i1.getBalance());

        for (int i = 1; i <= 5; i++) {
            i1.addInterest();
            System.out.println("Saldo após " + i + " aplicação(ões) de juros: R$ " + i1.getBalance());
        }
    }
}
