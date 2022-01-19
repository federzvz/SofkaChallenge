/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Controladores;

import Logica.Clases.Categoria;
import Logica.Clases.Partida;
import Logica.Clases.Pregunta;
import Logica.Interfaz.IControladorPartida;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ControladorPartida implements IControladorPartida {

    private static ControladorPartida instancia;
    private Map<String, Partida> partidas;
    private Pregunta preguntaDeRonda;

    public static ControladorPartida getInstance() {
        if (instancia == null) {
            instancia = new ControladorPartida();
        }
        return instancia;
    }

    public ControladorPartida() {
    }
    
    
    
    public Pregunta generarPregunta(List<Categoria> categoria, int numeroRonda){ //Se seleccionará la pregunta dado el número de la ronda.
        Pregunta preguntaAux=new Pregunta();
        List<Categoria> categoriasSegunComplejidad = new ArrayList<>();
        int categoríaRandom,preguntaRandom;
        //PRIMER PASO: OBTENER CATEOGRÍAS ACORDE AL NIVEL DE COMPLEJIDAD
        for(int i=0; i<categoria.size(); i++){ 
            if(categoria.get(i).getNivelDeComplejidad()==numeroRonda){ 
                categoriasSegunComplejidad.add(categoria.get(i)); //Obtengo las categorías disponibles para esta ronda
            }
        }
        //SEGUNDO PASO: DE LAS CATEGORÍAS DISPONIBLES SELECCIONAR UNA DE FORMA ALEATORIA
        Random randomGenerator = new Random();
        categoríaRandom = randomGenerator.nextInt(categoriasSegunComplejidad.size());
        //TERCER PASO: SELECCIONAR UNA PREGUNTA ALEATORIA
        preguntaRandom = randomGenerator.nextInt(5);
        preguntaAux=categoriasSegunComplejidad.get(categoríaRandom).getPreguntas().get(preguntaRandom);
        preguntaAux.setCategoria(categoriasSegunComplejidad.get(categoríaRandom).getNombre());
        return preguntaAux;
    }

    
}
