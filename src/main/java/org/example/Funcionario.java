package org.example;

public class Funcionario {
    public boolean verificarElegibilidade() {
        return FuncionarioFacade.verificarPendencias(this);
    }
}
