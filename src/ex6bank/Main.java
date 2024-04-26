package ex6bank;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println("-".repeat(20));
        account1.deposito(1000);
        System.out.println("-".repeat(20));
        account1.saque(500);
        System.out.println("-".repeat(20));
    }
}
