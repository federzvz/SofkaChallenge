/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Controladores.ControladorPartida;
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
    
    public IControladorPartida getIControladorFuncion() {
        IControladorPartida ControladorF = ControladorPartida.getInstance();
        return ControladorF; //To change body of generated methods, choose Tools | Templates.
    }
}
