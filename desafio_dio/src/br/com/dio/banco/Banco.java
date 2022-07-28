package br.com.dio.banco;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> c1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getC1() {
        return c1;
    }

    public void setC1(List<Conta> c1) {
        this.c1 = c1;
    }
}
