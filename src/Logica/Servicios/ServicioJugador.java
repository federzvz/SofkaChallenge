/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Servicios;

import Logica.Clases.Categoria;
import Persistencia.ConexionDB;
import Presentacion.Jugador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                if (rs.getString("nickname").equalsIgnoreCase(nickname)) {
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
    
    public List<String> obtenerNicknamesJugadores(){
        List<String> jugadores = new ArrayList<>();
        try {
            Statement status = conexion.createStatement();
            ResultSet rs = status.executeQuery("SELECT * FROM jugadores");
            while (rs.next()) {
                jugadores.add(rs.getString("nickname"));
            }
        } catch (Exception e) {
            return null;
        }
        return jugadores;
    }

    public List<Logica.Clases.Jugador> obtenerJugadores() {
        List<Logica.Clases.Jugador> jugadores = new ArrayList<>();
        try {
            Statement status = conexion.createStatement();
            ResultSet rs = status.executeQuery("SELECT jugadores.nickname, sum(partidas.rondasGanadas) as respuestasAcertadas, sum(partidas.dineroObtenido) as dineroObtenido, (SELECT COUNT(partidas.idJugador) FROM partidas where partidas.rondasGanadas=5 AND jugadores.id=partidas.idJugador) as partidasGanadas, count(partidas.idPartida) as partidasJugadas FROM jugadores,partidas WHERE jugadores.id=partidas.idJugador GROUP BY (jugadores.id) UNION  SELECT jugadores.nickname, 0 as respuestasAcertadas, 0 as dineroObtenido, 0 as partidasGanadas, 0 as partidasJugadas FROM jugadores WHERE jugadores.id NOT IN (SELECT partidas.idJugador FROM partidas);");
            while (rs.next()) {
                Logica.Clases.Jugador player = new Logica.Clases.Jugador(rs.getString("nickname"), rs.getInt("partidasGanadas"), rs.getInt("dineroObtenido"), rs.getInt("respuestasAcertadas"), rs.getInt("partidasJugadas"));
                jugadores.add(player);
            }
        } catch (Exception e) {
            return null;
        }
        return jugadores;
    }

}

