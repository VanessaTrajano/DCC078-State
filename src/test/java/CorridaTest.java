import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorridaTest {
    Corrida corrida;

    @BeforeEach
    public void setUp() {
        corrida = new Corrida();
    }

    // Corrida - buscando

    @Test
    public void naoDeveBuscarCorridaBuscando() {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        assertFalse(corrida.buscar());
    }

    @Test
    public void deveFicarACaminhoCorridaBuscando() {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        assertTrue(corrida.aCaminho());
        assertEquals(CorridaEstadoACaminho.getInstance(), corrida.getEstado());
    }

    @Test
    public void deveCancelarCorridaBuscando() {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        assertTrue(corrida.cancelar());
        assertEquals(CorridaEstadoCancelado.getInstance(), corrida.getEstado());
    }

    @Test
    public void naoDeveFicarEmAndamentoCorridaBuscando() {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        assertFalse(corrida.emAndamento());
    }

    @Test
    public void naoDeveFinalizarCorridaBuscando() {
        corrida.setEstado(CorridaEstadoBuscando.getInstance());
        assertFalse(corrida.finalizar());
    }

    // Corrida - a caminho

    @Test
    public void deveBuscarCorridaACaminho() {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        assertTrue(corrida.buscar());
        assertEquals(CorridaEstadoBuscando.getInstance(), corrida.getEstado());
    }

    @Test
    public void naoDeveFicarACaminhoCorridaACaminho() {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        assertFalse(corrida.aCaminho());
    }

    @Test
    public void deveCancelarCorridaACaminho() {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        assertTrue(corrida.cancelar());
        assertEquals(CorridaEstadoCancelado.getInstance(), corrida.getEstado());
    }

    @Test
    public void deveFicarEmAndamentoCorridaACaminho() {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        assertTrue(corrida.emAndamento());
        assertEquals(CorridaEstadoEmAndamento.getInstance(), corrida.getEstado());
    }

    @Test
    public void naoDeveFinalizarCorridaACaminho() {
        corrida.setEstado(CorridaEstadoACaminho.getInstance());
        assertFalse(corrida.finalizar());
    }

    // Corrida cancelada

    @Test
    public void naoDeveBuscarCorridaCancelado() {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        assertFalse(corrida.buscar());
    }

    @Test
    public void naoDeveFicarACaminhoCorridaCancelado() {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        assertFalse(corrida.aCaminho());
    }

    @Test
    public void naoDeveCancelarCorridaCancelado() {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        assertFalse(corrida.cancelar());
    }

    @Test
    public void naoDeveFicarEmAndamentoCorridaCancelado() {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        assertFalse(corrida.emAndamento());
    }

    @Test
    public void naoDeveFinalizarCorridaCancelado() {
        corrida.setEstado(CorridaEstadoCancelado.getInstance());
        assertFalse(corrida.finalizar());
    }

    // Corrida em andamento

    @Test
    public void naoDeveBuscarCorridaEmAndamento() {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        assertFalse(corrida.buscar());
    }

    @Test
    public void naoDeveFicarACaminhoCorridaEmAndamento() {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        assertFalse(corrida.aCaminho());
    }

    @Test
    public void naoDeveCancelarCorridaEmAndamento() {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        assertFalse(corrida.cancelar());
    }

    @Test
    public void naoDeveFicarEmAndamentoCorridaEmAndamento() {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        assertFalse(corrida.emAndamento());
    }

    @Test
    public void deveFinalizarCorridaEmAndamento() {
        corrida.setEstado(CorridaEstadoEmAndamento.getInstance());
        assertTrue(corrida.finalizar());
        assertEquals(CorridaEstadoFinalizado.getInstance(), corrida.getEstado());
    }

    // Corrida finalizado

    @Test
    public void naoDeveBuscarCorridaFinalizado() {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        assertFalse(corrida.buscar());
    }

    @Test
    public void naoDeveFicarACaminhoCorridaFinalizado() {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        assertFalse(corrida.aCaminho());
    }

    @Test
    public void naoDeveCancelarCorridaFinalizado() {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        assertFalse(corrida.cancelar());
    }

    @Test
    public void naoDeveFicarEmAndamentoCorridaFinalizado() {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        assertFalse(corrida.emAndamento());
    }

    @Test
    public void naoDeveFinalizarCorridaFinalizado() {
        corrida.setEstado(CorridaEstadoFinalizado.getInstance());
        assertFalse(corrida.finalizar());
    }
}
