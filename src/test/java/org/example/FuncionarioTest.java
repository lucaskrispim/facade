package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPendenciaTI() {
        Funcionario funcionario = new Funcionario();
        TI.getInstancia().addFuncionarioPendente(funcionario);

        assertFalse(funcionario.verificarElegibilidade());
    }

    @Test
    void deveRetornarPendenciaRH() {
        Funcionario funcionario = new Funcionario();
        RH.getInstancia().addFuncionarioPendente(funcionario);

        assertFalse(funcionario.verificarElegibilidade());
    }

    @Test
    void deveRetornarPendenciaFinanceiro() {
        Funcionario funcionario = new Funcionario();
        Financeiro.getInstancia().addFuncionarioPendente(funcionario);

        assertFalse(funcionario.verificarElegibilidade());
    }

    @Test
    void deveRetornarFuncionarioSemPendencia() {
        Funcionario funcionario = new Funcionario();
        assertTrue(funcionario.verificarElegibilidade());
    }

}