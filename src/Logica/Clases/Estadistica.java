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
public class Estadistica extends Jugador {
    private int partidasJugadas;
    private double dineroGanado;
    private int respuestasCorrectas;
    private int respuestasIncorrectas;

    public Estadistica(int partidasJugadas, double dineroGanado, int respuestasCorrectas, int respuestasIncorrectas) {
        this.partidasJugadas = partidasJugadas;
        this.dineroGanado = dineroGanado;
        this.respuestasCorrectas = respuestasCorrectas;
        this.respuestasIncorrectas = respuestasIncorrectas;
    }

    public Estadistica() {
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public double getDineroGanado() {
        return dineroGanado;
    }

    public int getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public int getRespuestasIncorrectas() {
        return respuestasIncorrectas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public void setDineroGanado(double dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public void setRespuestasCorrectas(int respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public void setRespuestasIncorrectas(int respuestasIncorrectas) {
        this.respuestasIncorrectas = respuestasIncorrectas;
    }
}
