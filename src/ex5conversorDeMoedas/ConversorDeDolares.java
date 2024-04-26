package ex5conversorDeMoedas;

import java.util.Scanner;

public class ConversorDeDolares {
    private double cotacao;
    private double amount;
    private final double IOF = 1.06;
    static Scanner sc = new Scanner(System.in);

    public void setCotacao() {
        try {
            System.out.print("Qual é o preço do dólar? ");
            cotacao = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Valor inválido.");
        }
    }

    public void setAmount() {
        if (cotacao != 0) {
            System.out.print("Quantos dólares serão comprados? ");
            try {
                amount = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Valor inválido.");
            }
        }

    }

    public double getValor() {
        if (!(cotacao == 0 || amount == 0)) {
            return amount * (cotacao * IOF);
        }
        return -1;
    }

    public ConversorDeDolares() {
        setCotacao();
        setAmount();
        if (getValor() > 0) {
            System.out.printf("Valor a ser pago em reais = R$%.2f%n", getValor());
        }
    }
}