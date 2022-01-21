/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Interfaz;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IControladorJugador {
    public abstract boolean ingresarJugador(String nickname);
    public abstract List<String> obtenerNicknamesJugadores();
    public abstract List<Logica.Clases.Jugador> obtenerJugadores();
}
