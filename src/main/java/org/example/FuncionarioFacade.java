package org.example;

public class FuncionarioFacade {

    public static boolean verificarPendencias(Funcionario funcionario) {
        boolean pendencia = true;
        if (RH.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            pendencia = false;
        }
        if (TI.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            pendencia = false;
        }
        if (Financeiro.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            pendencia = false;
        }
        return pendencia;
    }
}
