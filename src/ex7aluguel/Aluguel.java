package ex7aluguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluguel {

    String text = "Alugueis\n";
    Scanner sc = new Scanner(System.in);
    List<Inquilino> inquilinos = new ArrayList<>();

    public void alugar() {
        System.out.print("Quantos quartos serão alugados? ");
        int alugueis = sc.nextInt();
        for (int i = 0; i < alugueis; i++) {
            inquilinos.add(new Inquilino(i));
        }
    }

    public void lotacao() {
        System.out.println("Quartos ocupados:");
        for (Inquilino inquilino : inquilinos) {
            System.out.printf("%d: %s, %s\n", inquilino.getQuarto(), inquilino.getNome(), inquilino.getEmail());
        }
    }
}
