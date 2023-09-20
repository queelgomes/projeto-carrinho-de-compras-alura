package meu.projeto.compras.modelo;

public class Produto implements Comparable<Produto> {

    // atributos :::
    private String nomeProduto;
    private double valorProduto;

    // construtor :::
    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    // getters :::
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return String.format("\n  >>> %s - R$%.2f", nomeProduto, valorProduto);
    }

    @Override
    public int compareTo(Produto o) {
        return nomeProduto.compareTo(o.nomeProduto);
    }
}
