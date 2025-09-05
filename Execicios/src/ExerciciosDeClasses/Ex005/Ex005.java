package ExerciciosDeClasses.Ex005;

public class Ex005 {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.setAccountNumber(2106);
        p1.setAccountOwner("Thiago");
        p1.openAccount("CC");
        BankAccount p2 = new BankAccount();
        p2.setAccountNumber(1014);
        p2.setAccountOwner("Gabriel");
        p2.openAccount("CP");
        p1.deposit((double)300.0F);
        p2.deposit((double)500.0F);
        p2.withdraw((double)100.0F);
        p1.currentStatus();
        p2.currentStatus();
    }
}