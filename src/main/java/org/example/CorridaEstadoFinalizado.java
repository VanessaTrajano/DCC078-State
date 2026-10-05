package org.example;

public class CorridaEstadoFinalizado extends CorridaEstado{
    private CorridaEstadoFinalizado() {};
    private static CorridaEstadoFinalizado instance = new CorridaEstadoFinalizado();
    public static CorridaEstadoFinalizado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizado";
    }
}
