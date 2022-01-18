/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Clases.Partida;
import Logica.Interfaz.IControladorPartida;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class ControladorPartida implements IControladorPartida {

    private static ControladorPartida instancia;
    private Map<String, Partida> partidas;

    public static ControladorPartida getInstance() {
        if (instancia == null) {
            instancia = new ControladorPartida();
        }
        return instancia;
    }

    
}
