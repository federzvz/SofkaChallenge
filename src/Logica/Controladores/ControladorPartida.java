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
import Logica.Servicios.ServicioPartida;
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
    private ServicioPartida servicioPartida;
    private Map<String, Partida> partidas;
    private Pregunta preguntaDeRonda;

    public ControladorPartida(ServicioPartida servicioPartida, Map<String, Partida> partidas, Pregunta preguntaDeRonda) {
        this.servicioPartida = servicioPartida;
        this.partidas = partidas;
        this.preguntaDeRonda = preguntaDeRonda;
    }

    public ControladorPartida() {
        this.servicioPartida= new ServicioPartida();
    }

    public static ControladorPartida getInstance() {
        if (instancia == null) {
            instancia = new ControladorPartida();
        }
        return instancia;
    }

    public Pregunta generarPregunta(List<Categoria> categoria, int numeroRonda) { //Se seleccionará la pregunta dado el número de la ronda.
        Pregunta preguntaAux = new Pregunta();
        List<Categoria> categoriasSegunComplejidad = new ArrayList<>();
        int categoríaRandom, preguntaRandom;
        //PRIMER PASO: OBTENER CATEOGRÍAS ACORDE AL NIVEL DE COMPLEJIDAD
        for (int i = 0; i < categoria.size(); i++) {
            if (categoria.get(i).getNivelDeComplejidad() == numeroRonda) {
                categoriasSegunComplejidad.add(categoria.get(i)); //Obtengo las categorías disponibles para esta ronda
            }
        }
        //SEGUNDO PASO: DE LAS CATEGORÍAS DISPONIBLES SELECCIONAR UNA DE FORMA ALEATORIA
        Random randomGenerator = new Random();
        categoríaRandom = randomGenerator.nextInt(categoriasSegunComplejidad.size());
        //TERCER PASO: SELECCIONAR UNA PREGUNTA ALEATORIA
        preguntaRandom = randomGenerator.nextInt(5);
        preguntaAux = categoriasSegunComplejidad.get(categoríaRandom).getPreguntas().get(preguntaRandom);
        preguntaAux.setCategoria(categoriasSegunComplejidad.get(categoríaRandom).getNombre());
        return preguntaAux;
    }

    public void mostrarPreguntas(List<Categoria> test) {
        for (int i = 0; i < test.size(); i++) {
            System.out.println("COMPLEJIDAD:" + test.get(i).getNivelDeComplejidad());
            System.out.println("CATEGORÍA:" + test.get(i).getNombre());
            List<Pregunta> test2 = new ArrayList<>();
            test2 = test.get(i).getPreguntas();
            for (int j = 0; j < test2.size(); j++) {
                System.out.println(test2.get(j).getPregunta());
                System.out.println(test2.get(j).getRespuestaCorrecta());
                List<String> test3incorrectas = new ArrayList<>();
                test3incorrectas = test2.get(j).getRespuestasIncorrectas();
                for (int h = 0; h < test3incorrectas.size(); h++) {
                    System.out.println(test3incorrectas.get(h));
                }
            }
        }
    }

    public int[] establecerPremios() {
        int[] premios = new int[5];
        premios[0] = 100;
        premios[1] = 300;
        premios[2] = 500;
        premios[3] = 1000;
        premios[4] = 2000;
        return premios;
    }
    
    public void registrarPartida(String nickname, int rondasGanadas, int dineroObtenido){
        this.servicioPartida.registrarPartida(nickname, rondasGanadas, dineroObtenido);
    }

}
