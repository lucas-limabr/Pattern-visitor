package com.designPattern.visitor.core;

public interface Visitor {

    String visit(PessoaFisica cliente);
    String visit(PessoaJuridica cliente);

}
