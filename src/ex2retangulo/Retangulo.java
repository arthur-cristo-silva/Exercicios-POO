package ex2retangulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Retangulo {
    private double largura;
    private double altura;
    public Retangulo() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Retangulo ===");
            System.out.print("Largura: ");
            largura = sc.nextDouble();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            System.out.println(this);
        } catch (InputMismatchException e) {
            System.out.println("Por favor insira dados válidos.");
        }
    }

    public double getArea(){
        return largura*altura;
    }

    public double getPerimetro(){
        return 2*(largura+altura);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("=== Retangulo ===\n" +
                "Largura: %s\n" +
                "Altura: %s\n" +
                "Área: %s\n" +
                "Perímetro: %s\n" +
                "Diagonal: %s\n", largura, altura, getArea(), getPerimetro(), getDiagonal());
    }
}
