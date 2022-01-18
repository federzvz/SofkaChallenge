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
    private boolean partidaEnCurso;
    private int numeroRonda;

    public Partida() {
        this.numeroRonda = 1;
    }

    public Partida(boolean partidaEnCurso, int numeroRonda) {
        this.partidaEnCurso = partidaEnCurso;
        this.numeroRonda = numeroRonda;
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public boolean isPartidaEnCurso() {
        return partidaEnCurso;
    }

    public void setPartidaEnCurso(boolean partidaEnCurso) {
        this.partidaEnCurso = partidaEnCurso;
    }
    
    public void siguienteRonda(){
        this.numeroRonda+=1;
    }
    
    
}
