package org.example;

public class RH extends Departamento {

    private static RH rh = new RH();

    private RH() {}

    public static RH getInstancia() {
        return rh;
    }
}
