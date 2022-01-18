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

    public Jugador(String nickname) {
        this.nickname = nickname;
    }

    public Jugador() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
}
