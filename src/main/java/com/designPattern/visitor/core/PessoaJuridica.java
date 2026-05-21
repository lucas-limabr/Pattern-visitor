package com.designPattern.visitor.core;

import java.math.BigDecimal;

public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private double faturamentoMensal;
    private double valorDivida;

    public PessoaJuridica(String razaoSocial, double faturamentoMensal, double valorDivida) {
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
        this.valorDivida = valorDivida;
    }

    @Override
    public String visitar(Visitor visitor) {
        return visitor.visit(this);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
