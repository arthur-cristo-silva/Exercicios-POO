package ex4notas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double media;

    public Aluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Aluno ===");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        setN1();
        setN2();
        setN3();
        setMedia();
        System.out.println(this);
        System.out.println(media > 60 ? "Aprovado!" : "Reprovado. Faltaram " + (60 - media) + " pontos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1() {
        Scanner sc = new Scanner(System.in);
        while (n1 <= 0 || n3 > 30) {
            try {
                System.out.print("Insira a 1ª nota do aluno (0/30): ");
                double tempN1 = sc.nextDouble();
                if (tempN1 > 0 && tempN1 < 30) {
                    n1 = tempN1;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nota Inválida.");
                sc.nextLine();
            }
        }
    }

    public double getN2() {
        return n2;
    }

    public void setN2() {
        Scanner sc = new Scanner(System.in);
        while (n2 <= 0 || n2 > 35) {
            try {
                System.out.print("Insira a 2ª nota do aluno (0/35): ");
                double tempN2 = sc.nextDouble();
                if (tempN2 > 0 && tempN2 < 35) {
                    n2 = tempN2;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nota Inválida.");
                sc.nextLine();
            }
        }
    }

    public double getN3() {
        return n3;
    }

    public void setN3() {
        Scanner sc = new Scanner(System.in);
        while (n3 <= 0 || n3 > 35) {
            try {
                System.out.print("Insira a 3ª nota do aluno (0/35): ");
                double tempN3 = sc.nextDouble();
                if (tempN3 > 0 && tempN3 < 35) {
                    n3 = tempN3;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Nota Inválida.");
                sc.nextLine();
            }
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia() {
        media = n1 + n2 + n3;
    }

    @Override
    public String toString() {
        return String.format("%s\n1ª Nota: %.1f\n2ª Nota: %.1f\n3ª Nota: %.1f\nMédia: %.1f", nome, n1, n2, n3, media);
    }
}
