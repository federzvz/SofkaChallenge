/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Servicios;

import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ServicioPartida {

    private Connection conexion = new ConexionDB().getConexion();

    public ServicioPartida() {
    }

    public void registrarPartida(String nickname, int rondasGanadas, int dineroObtenido) {
        try {
            int idJugador = 0;
            PreparedStatement status = conexion.prepareStatement("SELECT id FROM jugadores WHERE jugadores.nickname=?");
            status.setString(1, nickname);
            ResultSet rs = status.executeQuery();
            if (rs.next()) {
                idJugador = rs.getInt("id");
            }
            PreparedStatement status2 = conexion.prepareStatement("INSERT INTO partidas (idJugador,rondasGanadas,dineroObtenido) VALUES (?,?,?)");
            status2.setInt(1, idJugador);
            status2.setInt(2, rondasGanadas);
            status2.setInt(3, dineroObtenido);
            status2.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
