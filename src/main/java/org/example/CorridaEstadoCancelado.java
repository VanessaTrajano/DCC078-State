package org.example;

public class CorridaEstadoCancelado extends CorridaEstado{
    private CorridaEstadoCancelado() {};
    private static CorridaEstadoCancelado instance = new CorridaEstadoCancelado();
    public static CorridaEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
