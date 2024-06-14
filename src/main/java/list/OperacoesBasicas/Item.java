package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) { // constructor
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { // get: retorna um valor
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "{ Item: " +
                 nome + '\'' +
                ", R$" + preco +
                ", quant = " + quantidade +
                "\n" + '}';
    }
}
