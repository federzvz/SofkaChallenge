/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Clases.Categoria;
import Logica.Clases.Pregunta;
import Logica.Interfaz.IControladorPregunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ControladorPregunta implements IControladorPregunta {

    private static ControladorPregunta instancia;

    public static ControladorPregunta getInstance() {
        if (instancia == null) {
            instancia = new ControladorPregunta();
        }
        return instancia;
    }

    
}
