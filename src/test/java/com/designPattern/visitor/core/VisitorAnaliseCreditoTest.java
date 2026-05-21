package com.designPattern.visitor.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorAnaliseCreditoTest {

    PessoaFisica pessoaFisica;
    PessoaJuridica pessoaJuridica;
    VisitorAnaliseCredito visitorAnaliseCredito;

    @BeforeEach
    void setUp() {
        pessoaFisica = new PessoaFisica("João", 5001.0, 30000.0);
        pessoaJuridica = new PessoaJuridica("Empresa XYZ", 10000.1, 50000.0);
        visitorAnaliseCredito = new VisitorAnaliseCredito();
    }

    @Test
    void deveAprovarCreditoAPessoaFisica() {
        assertEquals("Crédito de pessoa física aprovado", visitorAnaliseCredito.analise(pessoaFisica));
    }

    @Test
    void deveNegarCreditoAPessoaFisicaPorCriterioRendaMinima() {
        pessoaFisica.setRendaMensal(4999.0);
        assertEquals("Crédito negado por critério de renda mínima", visitorAnaliseCredito.analise(pessoaFisica));
    }

    @Test
    void deveAprovarCreditoAPessoaJuridica() {
        assertEquals("Crédito de pessoa jurídica aprovado", visitorAnaliseCredito.analise(pessoaJuridica));
    }

    @Test
    void deveNegarCreditoAPessoaJuridicaPorCriterioFaturamentoMinimo() {
        pessoaJuridica.setFaturamentoMensal(9999.9);
        assertEquals("Crédito negado por critério de faturamento mínimo", visitorAnaliseCredito.analise(pessoaJuridica));
    }
}