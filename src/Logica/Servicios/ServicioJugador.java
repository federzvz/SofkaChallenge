/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Servicios;

import Logica.Clases.Categoria;
import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            PreparedStatement status = conexion.prepareStatement("SELECT nickname FROM jugadores WHERE jugadores.nickname=?");
            status.setString(1, nickname);
            ResultSet rs = status.executeQuery();
            while (rs.next()) {
                if(rs.getString("nickname").equalsIgnoreCase(nickname)){
                    return false;
                }
            }
            PreparedStatement status2 = conexion.prepareStatement("INSERT INTO jugadores (nickname) VALUES (?)");
            status2.setString(1, nickname);
            status2.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
