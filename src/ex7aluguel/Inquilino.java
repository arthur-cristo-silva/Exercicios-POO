package ex7aluguel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inquilino {
    private String nome;
    private String email;
    private int quarto;
    private Scanner sc = new Scanner(System.in);

    public Inquilino(int i) {
        System.out.println("Aluguel #" + (i + 1));
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        while (quarto == 0) {
            try {
                System.out.print("Nº do Quarto: ");
                quarto = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas o número do quarto.");
                sc.nextLine();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    @Override
    public String toString() {
        return String.format("Nome:%s\nEmail:%s\nQuarto:%s", nome, email, quarto);
    }
}
