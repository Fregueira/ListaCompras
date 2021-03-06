package br.net.listacompras;

import java.util.Objects;

public class Produto {
    private long id;
    private String nome;
    private int quantidade;
    private double preco;
    private boolean comprado;

    public Produto(long id, String nome, int quantidade, double preco, boolean comprado) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.comprado = comprado;
    }

    public Produto(String nome, int quantidade, double preco, boolean comprado) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.comprado = comprado;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
