package org.example;

public class CorridaEstadoEmAndamento extends CorridaEstado{
    private CorridaEstadoEmAndamento() {};
    private static CorridaEstadoEmAndamento instance = new CorridaEstadoEmAndamento();
    public static CorridaEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Andamento";
    }

    @Override
    public boolean finalizar(Corrida corrida) {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        return true;
    }
}
