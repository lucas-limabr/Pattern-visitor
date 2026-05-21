package com.designPattern.visitor.core;

public class VisitorScore implements Visitor {

    public String analise(Cliente cliente) {
        return cliente.visitar(this);
    }

    @Override
    public String visit(PessoaFisica cliente) {
        if (cliente.getValorDivida() > 50000) {
            return "Score do cliente " +cliente.getNome() +": Ruim";
        }
        return "Score do cliente " +cliente.getNome() +": Bom";
    }

    @Override
    public String visit(PessoaJuridica cliente) {
        if (cliente.getValorDivida() > 100000) {
            return "Score da empresa " +cliente.getRazaoSocial() +": Ruim";
        }
        return "Score da empresa " +cliente.getRazaoSocial() +": Bom";
    }
}
