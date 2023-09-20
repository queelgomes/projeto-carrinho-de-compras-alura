package meu.projeto.compras.modelo;

import java.util.*;

public class Compra {
    Scanner scanner = new Scanner(System.in);
    // atributos :::
    private double limite;
    private List<Cliente> itensCarrinho;

    // construtor :::
    public Compra() {
        System.out.print("Limite do cliente: ");
        this.limite = scanner.nextDouble();
        itensCarrinho = new ArrayList<>();
    }

    // métodos :::
    public void adicionarItemCarrinho(){
        System.out.print("Nome do produto: ");
        String produto = scanner.next();
        System.out.print("Valor do produto: R$");
        double valor = scanner.nextDouble();
        if (limite - valor >= 0) {
            limite -= valor;
            itensCarrinho.add(new Cliente(produto, valor));
        } else {
            System.out.printf("""
                    ** Produto não adicionado.
                    ** Valor do produto ultrapassa o limite disponível de R$%.2f.
                    """, limite);
        }
    }
    public void exibirLista() {
        List<Cliente> listaOrdenada = new ArrayList<>(itensCarrinho);
        Collections.sort(listaOrdenada);
        System.out.println("\n---- CARRINHO DE COMPRAS ----");
        for (Cliente p : listaOrdenada){
            System.out.printf("   > %s - R$%.2f \n", p.getNomeProduto().toUpperCase(), p.getValorProduto());
        }
        System.out.println("----------------------------\n");
    }

}