package ex1estoqueDeProdutos;

public class Main {
    public static void main(String[] args) {
        Produto canetas = new Produto();
        System.out.println("-".repeat(30));
        canetas.entradaEstoque(500);
        System.out.println("-".repeat(30));
        canetas.saidaEstoque(200);
        System.out.println("-".repeat(30));
        System.out.println(canetas);
        System.out.println("-".repeat(30));
        System.out.println("Valor do estoque: R$"+canetas.getValorEstoque());
    }
}
