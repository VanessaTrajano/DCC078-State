package org.example;

public abstract class CorridaEstado {
    public abstract String getEstado();

    public boolean buscar(Corrida corrida) {
        return false;
    }

    public boolean aCaminho(Corrida corrida) {
        return false;
    }

    public boolean cancelar(Corrida corrida) {
        return false;
    }

    public boolean emAndamento(Corrida corrida) {
        return false;
    }

    public boolean finalizar(Corrida corrida) {
        return false;
    }
}
