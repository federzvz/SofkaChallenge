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
public class Jugador {

    private String nickname;
    private int partidasGanadas, dineroObtenido, respuestasAcertadas, partidasJugadas;

    public Jugador() {
    }

    public Jugador(String nickname) {
        this.nickname = nickname;
    }

    public Jugador(String nickname, int partidasGanadas, int dineroObtenido, int respuestasAcertadas, int partidasJugadas) {
        this.nickname = nickname;
        this.partidasGanadas = partidasGanadas;
        this.dineroObtenido = dineroObtenido;
        this.respuestasAcertadas = respuestasAcertadas;
        this.partidasJugadas = partidasJugadas;
    }

    

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public int getDineroObtenido() {
        return dineroObtenido;
    }

    public int getRespuestasAcertadas() {
        return respuestasAcertadas;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setRespuestasAcertadas(int respuestasAcertadas) {
        this.respuestasAcertadas = respuestasAcertadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

   

    public void setDineroObtenido(int dineroObtenido) {
        this.dineroObtenido = dineroObtenido;
    }
    
}
