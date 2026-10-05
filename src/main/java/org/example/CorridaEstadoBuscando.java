package org.example;

public class CorridaEstadoBuscando extends CorridaEstado{
    private CorridaEstadoBuscando() {};
    private static CorridaEstadoBuscando instance = new CorridaEstadoBuscando();
    public static CorridaEstadoBuscando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Buscando";
    }

    @Override
    public boolean aCaminho(Corrida corrida) {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Corrida corrida) {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        return true;
    }
}
