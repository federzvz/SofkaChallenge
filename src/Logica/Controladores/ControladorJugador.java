/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Interfaz.IControladorJugador;
import Logica.Servicios.ServicioJugador;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ControladorJugador implements IControladorJugador {

    private static ControladorJugador instancia;
    private ServicioJugador servicioJugador;

    public ControladorJugador() {
        this.servicioJugador = new ServicioJugador();
    }
    
    

    public static ControladorJugador getInstance() {
        if (instancia == null) {
            instancia = new ControladorJugador();
        }
        return instancia;
    }

    public boolean ingresarJugador(String nickname) {
        return this.servicioJugador.ingresarJugador(nickname);
    }
    
    public List<String> obtenerNicknamesJugadores(){
        return this.servicioJugador.obtenerNicknamesJugadores();
    }
    
    public List<Logica.Clases.Jugador> obtenerJugadores() {
        return this.servicioJugador.obtenerJugadores();
    }
}
