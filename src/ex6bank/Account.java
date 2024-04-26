package ex6bank;

import java.util.Scanner;

public class Account {
    private String num;
    private String name;
    private double balance;
    private final double fee = 5;
    Scanner sc = new Scanner(System.in);

    public Account() {
        System.out.print("Enter Account Number: ");
        num = sc.nextLine();
        System.out.print("Enter Account Name: ");
        name = sc.nextLine();
        System.out.print("Do you want to deposit? Y/N: ");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            System.out.print("Enter the amount of your first deposit: ");
            balance = sc.nextDouble();
        } else {
            balance = 0;
        }
    }

    public void saque(double amount) {
        balance -= amount+fee;
        System.out.printf("%s sacou R$%.2f%nSaldo: R%.2f%n", name, amount, balance);
    }

    public void deposito(double amount) {
        balance += amount;
        System.out.printf("%s depositou R$%.2f%nSaldo: R%.2f%n", name, amount, balance);
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}
