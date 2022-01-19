/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Servicios;

import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ServicioJugador {

    private Connection conexion = new ConexionDB().getConexion();
    
    public ServicioJugador() {
    }


    public boolean ingresarJugador(String nickname) {
        try {
            PreparedStatement status = conexion.prepareStatement("INSERT INTO jugadores (nickname) VALUES (?)");
            status.setString(1, nickname);
            status.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
