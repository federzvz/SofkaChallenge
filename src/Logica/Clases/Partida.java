/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Clases;

/**
 *
 * @author Admin
 */
public class Partida {
    private int idJugador, numeroPartida, dineroGanado, rondasGanadas;

    public Partida() {
    }

    public Partida(int idJugador, int numeroPartida, int dineroGanado, int rondasGanadas) {
        this.idJugador = idJugador;
        this.numeroPartida = numeroPartida;
        this.dineroGanado = dineroGanado;
        this.rondasGanadas = rondasGanadas;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getNumeroPartida() {
        return numeroPartida;
    }

    public int getDineroGanado() {
        return dineroGanado;
    }

    public int getRondasGanadas() {
        return rondasGanadas;
    }

    public void setNumeroPartida(int numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public void setDineroGanado(int dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public void setRondasGanadas(int rondasGanadas) {
        this.rondasGanadas = rondasGanadas;
    }
    
    
}
