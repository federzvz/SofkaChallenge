/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Controladores.ControladorCategoria;
import Logica.Controladores.ControladorJugador;
import Logica.Controladores.ControladorPartida;
import Logica.Interfaz.IControladorCategoria;
import Logica.Interfaz.IControladorJugador;
import Logica.Interfaz.IControladorPartida;

/**
 *
 * @author Admin
 */
public class Fabrica {

    private static Fabrica instancia;

    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    public IControladorPartida getIControladorPartida() {
        IControladorPartida ControladorF = ControladorPartida.getInstance();
        return ControladorF; //To change body of generated methods, choose Tools | Templates.
    }

    public IControladorCategoria getIControladorCategoria() {
        IControladorCategoria ControladorCAT = ControladorCategoria.getInstance();
        return ControladorCAT; //To change body of generated methods, choose Tools | Templates.
    }

    public IControladorJugador getIControladorJugador() {
        IControladorJugador ControladorJUG = ControladorJugador.getInstance();
        return ControladorJUG; //To change body of generated methods, choose Tools | Templates.
    }
}
