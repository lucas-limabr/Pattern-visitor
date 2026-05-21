package com.designPattern.visitor.core;

public class VisitorAnaliseCredito implements Visitor {

    private final double LIMITE_CREDITO_PFISICA = 5000;
    private final double LIMITE_CREDITO_PJURIDICA = 10000;

    public String analise(Cliente cliente) {
        return cliente.visitar(this);
    }

    @Override
    public String visit(PessoaFisica cliente) {
        if (cliente.getRendaMensal() < LIMITE_CREDITO_PFISICA) {
            return "Crédito negado por critério de renda mínima";
        }
        return "Crédito de pessoa física aprovado";
    }

    @Override
    public String visit(PessoaJuridica cliente) {
        if (cliente.getFaturamentoMensal() < LIMITE_CREDITO_PJURIDICA) {
            return "Crédito negado por critério de faturamento mínimo";
        }
        return "Crédito de pessoa jurídica aprovado";
    }
}
