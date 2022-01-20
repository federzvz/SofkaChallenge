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
import java.util.ArrayList;
import java.util.List;

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

    public List<Logica.Clases.Partida> obtenerPartidasDeJugador(String nickname) {
        List<Logica.Clases.Partida> partidas = new ArrayList<>();
        try {
            int idJugador = 0;
            PreparedStatement status = conexion.prepareStatement("SELECT id FROM jugadores WHERE jugadores.nickname=?");
            status.setString(1, nickname);
            ResultSet rs = status.executeQuery();
            if (rs.next()) {
                idJugador = rs.getInt("id");
            }
            PreparedStatement status2 = conexion.prepareStatement("SELECT * FROM partidas WHERE partidas.idJugador=?;");
            status2.setInt(1, idJugador);
            ResultSet rs2 = status2.executeQuery();
            while (rs2.next()) {
                partidas.add(new Logica.Clases.Partida(rs2.getInt("idJugador"), rs2.getInt("idPartida"), rs2.getInt("dineroObtenido"), rs2.getInt("rondasGanadas")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return partidas;
    }

}
