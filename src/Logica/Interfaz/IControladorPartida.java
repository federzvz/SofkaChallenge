/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Interfaz;

import Logica.Clases.Categoria;
import Logica.Clases.Pregunta;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IControladorPartida {
    public abstract Pregunta generarPregunta(List<Categoria> categoria, int numeroRonda);
}
