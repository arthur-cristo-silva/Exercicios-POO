package ex3calculadoraSalario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double salarioLiquido;
    private double imposto;

    public Funcionario() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== CADASTRAR FUNCIONÁRIO ===");
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Salário bruto: R$");
            salarioBruto = sc.nextDouble();
            System.out.print("Imposto: R$");
            imposto = sc.nextDouble();
            salarioLiquido = salarioBruto - imposto;
            System.out.println(this);
        } catch (InputMismatchException e) {
            System.out.println("Por favor insira dados válidos.");
        }
    }

    public void aumentoSalarial() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Insira o aumento salarial (ex: 10% -> 10): ");
            double aumento = (sc.nextDouble() / 100);
            double tempSalario = salarioBruto;
            salarioBruto += salarioBruto * aumento;
            System.out.printf("Mudança do salário bruto:\nR$%.2f -> R$%.2f\n", tempSalario, salarioBruto);
        } catch (InputMismatchException e) {
            System.out.println("Por favor insira dados válidos.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s\nSalário Liquido: R$%.2f", nome, salarioBruto - imposto);
    }
}
