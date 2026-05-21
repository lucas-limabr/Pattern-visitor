package com.designPattern.visitor.core;

public class PessoaFisica extends Cliente {

    private String nome;
    private double rendaMensal;
    private double valorDivida;

    public PessoaFisica(String nome, double rendaMensal, double valorDivida) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
        this.valorDivida = valorDivida;
    }

    @Override
    public String visitar(Visitor visitor) {
        return visitor.visit(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
