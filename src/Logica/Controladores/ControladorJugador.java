/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Interfaz.IControladorJugador;
import Logica.Servicios.ServicioJugador;

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

    public void ingresarJugador(String nickname) {
        this.servicioJugador.ingresarJugador(nickname);
    }
}
