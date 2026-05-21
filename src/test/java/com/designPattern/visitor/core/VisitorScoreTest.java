package com.designPattern.visitor.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorScoreTest {

    PessoaFisica pessoaFisica;
    PessoaJuridica pessoaJuridica;
    VisitorScore visitorScore;

    @BeforeEach
    void setUp() {
        pessoaFisica = new PessoaFisica("João", 5000.0, 50000.0);
        pessoaJuridica = new PessoaJuridica("Empresa XYZ", 20000.0, 100000.0);
        visitorScore = new VisitorScore();
    }

    @Test
    void deveRetornarScoreBomParaPessoaFisica() {
        assertEquals("Score do cliente João: Bom", visitorScore.analise(pessoaFisica));
    }

    @Test
    void deveRetornarScoreRuimParaPessoaFisica() {
        pessoaFisica.setValorDivida(50000.1);
        assertEquals("Score do cliente João: Ruim", visitorScore.analise(pessoaFisica));
    }

    @Test
    void deveRetornarScoreBomParaPessoaJuridica() {
        assertEquals("Score da empresa Empresa XYZ: Bom", visitorScore.analise(pessoaJuridica));
    }

    @Test
    void deveRetornarScoreRuimParaPessoaJuridica() {
        pessoaJuridica.setValorDivida(100000.1);
        assertEquals("Score da empresa Empresa XYZ: Ruim", visitorScore.analise(pessoaJuridica));
    }

}