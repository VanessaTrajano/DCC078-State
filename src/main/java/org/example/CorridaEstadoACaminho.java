package org.example;

public class CorridaEstadoACaminho extends CorridaEstado{
    private CorridaEstadoACaminho() {};
    private static CorridaEstadoACaminho instance = new CorridaEstadoACaminho();
    public static CorridaEstadoACaminho getInstance() {
        return instance;
    }

    public String getEstado() {
        return "A Caminho";
    }

    @Override
    public boolean cancelar(Corrida corrida) {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        return true;
    }

    @Override
    public boolean emAndamento(Corrida corrida) {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        return true;
    }

    @Override
    public boolean buscar(Corrida corrida) {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        return true;
    }
}
