package ex1estoqueDeProdutos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
        try {
            System.out.println("--- REGISTRAR PRODUTO ---");
            System.out.print("Insira o nome do produto: ");
            Scanner sc = new Scanner(System.in);
            nome = sc.nextLine();
            System.out.print("Insira o preço do produto: ");
            preco = sc.nextDouble();
            System.out.print("O produto tem estoque inicial? S/N: ");
            if (sc.next().equalsIgnoreCase("s")) {
                System.out.print("Insira o estoque inicial do produto: ");
                estoque = sc.nextInt();
            } else {
                estoque = 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um preço válido.");
        }
        System.out.println(this);
    }

    public void entradaEstoque(int quantidade) {
        estoque += quantidade;
        System.out.printf("%d foram adicionados ao estoque de %ss.\nEstoque: %d\n", quantidade, nome, estoque);
    }

    public void saidaEstoque(int quantidade) {
        estoque -= quantidade;
        System.out.printf("%d foram removidos do estoque de %ss.\nEstoque: %d\n", quantidade, nome, estoque);
    }

    public double getValorEstoque() {
        return estoque * preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return String.format("Produto: %ss\nPreço: R$ %.2f\nEstoque: %d", nome, preco, estoque);
    }
}
