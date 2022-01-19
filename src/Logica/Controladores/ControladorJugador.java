/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Interfaz.IControladorJugador;

/**
 *
 * @author Admin
 */
public class ControladorJugador implements IControladorJugador  {
        private static ControladorJugador instancia; 
    
        public static ControladorJugador getInstance() {
        if (instancia == null) {
            instancia = new ControladorJugador();
        }
        return instancia;
    }
}
