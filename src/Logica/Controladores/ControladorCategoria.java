/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Clases.Categoria;
import Logica.Clases.Pregunta;
import Logica.Interfaz.IControladorCategoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ControladorCategoria implements IControladorCategoria {

    private static ControladorCategoria instancia;

    public ControladorCategoria() {
    
    }
    
    public static ControladorCategoria getInstance() {
        if (instancia == null) {
            instancia = new ControladorCategoria();
        }
        return instancia;
    }

    public List<Categoria> crearCategoriasConPreguntas() { //Configuración del juego, creación de las preguntas
        Categoria categoriaAux = new Categoria();
        List<Categoria> categorias = new ArrayList<>();
        List<Pregunta> preguntas = new ArrayList<>();
        Pregunta preguntaAux = new Pregunta();
        List<String> respuestasIncorrectas = new ArrayList<>();
        String respuestaCorrecta;

        categoriaAux.setNombre("Fútbol"); //Creamos la primer pregunta de la categoría Fútbol
        categoriaAux.setNivelDeComplejidad(1);
        preguntaAux.setPregunta("¿Cuantas copas américa tiene Uruguay?");
        respuestasIncorrectas.add("14");
        respuestasIncorrectas.add("16");
        respuestasIncorrectas.add("13");
        respuestaCorrecta = "15";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);

        preguntaAux = new Pregunta(); //Reseteamos variables
        respuestasIncorrectas = new ArrayList<>();  //Reseteamos variable

        preguntaAux.setPregunta("¿Quién fue la primer selección en ganar un mundial?");
        respuestasIncorrectas.add("Brasil");
        respuestasIncorrectas.add("Argentina");
        respuestasIncorrectas.add("Inglaterra");
        respuestaCorrecta = "Uruguay";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);

        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable

        categoriaAux.setPreguntas(preguntas);
        categorias.add(categoriaAux);
        return categorias;
    }
}
