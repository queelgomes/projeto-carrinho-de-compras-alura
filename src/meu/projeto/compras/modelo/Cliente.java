package meu.projeto.compras.modelo;

public class Cliente implements Comparable<Cliente> {

    // atributos :::
    private String nomeProduto;
    private double valorProduto;

    // construtor :::
    public Cliente(String nomeProduto, double valorProduto) {
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
    public int compareTo(Cliente o) {
        return nomeProduto.compareTo(o.nomeProduto);
    }
}
