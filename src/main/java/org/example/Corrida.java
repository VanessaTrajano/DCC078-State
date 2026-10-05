package org.example;

public class Corrida {
    private String nome;
    private CorridaEstado estado;

    public Corrida() {
        this.estado = CorridaEstadoBuscando.getInstance();
    }

    public void setEstado(CorridaEstado estado) {
        this.estado = estado;
    }

    public boolean buscar() {
        return estado.buscar(this);
    }

    public boolean aCaminho() {
        return estado.aCaminho(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean emAndamento() {
        return estado.emAndamento(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CorridaEstado getEstado() {
        return estado;
    }
}
