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
        
        preguntaAux.setPregunta("¿Cuál de los siguientes equipos cuenta con más Libertadores?");
        respuestasIncorrectas.add("Peñarol");
        respuestasIncorrectas.add("Boca");
        respuestasIncorrectas.add("River");
        respuestaCorrecta = "Independiente";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);

        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuál de los siguientes equipos posee más UEFA Champions League?");
        respuestasIncorrectas.add("Milan");
        respuestasIncorrectas.add("Bayern Münche");
        respuestasIncorrectas.add("Liverpool");
        respuestaCorrecta = "Real Madrid";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);

        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Qué selección ganó el mundial de Brasil 2014?");
        respuestasIncorrectas.add("Francia");
        respuestasIncorrectas.add("España");
        respuestasIncorrectas.add("Bélgica");
        respuestaCorrecta = "Alemania";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);

        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable

        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        categoriaAux = new Categoria(); //Reseteamos la instancia auxiliar
        preguntas = new ArrayList<>();
        categoriaAux.setNombre("Conocimiento General I"); 
        categoriaAux.setNivelDeComplejidad(1);
        
        preguntaAux.setPregunta("¿Cada cuántos años tenemos un año bisiesto?");
        respuestasIncorrectas.add("Cada 2 años");
        respuestasIncorrectas.add("Cada 3 años");
        respuestasIncorrectas.add("Cada 6 años");
        respuestaCorrecta = "Cada 4 años";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Quién fue Cleopatra?");
        respuestasIncorrectas.add("Una gladiadora de la antigua Roma");
        respuestasIncorrectas.add("Primera reina de Inglaterra");
        respuestasIncorrectas.add("Fué una leyenda de la mitología Egipcia");
        respuestaCorrecta = "Última faraona de Egipto";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cómo se llama al sonido que produce la oveja?");
        respuestasIncorrectas.add("maullar");
        respuestasIncorrectas.add("ladrar");
        respuestasIncorrectas.add("beee");
        respuestaCorrecta = "balido";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuáles son los colores primarios?");
        respuestasIncorrectas.add("rojo, azul y verde");
        respuestasIncorrectas.add("rojo, amarillo y verde");
        respuestasIncorrectas.add("rojo, verde y naranja");
        respuestaCorrecta = "rojo, azul y amarillo";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuál es el hueso más largo del ser humano?");
        respuestasIncorrectas.add("Rótula");
        respuestasIncorrectas.add("Tibia");
        respuestasIncorrectas.add("Peroné");
        respuestaCorrecta = "Fémur";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        categoriaAux = new Categoria(); //Reseteamos la instancia auxiliar
        preguntas = new ArrayList<>();
        categoriaAux.setNombre("Conocimiento General II"); 
        categoriaAux.setNivelDeComplejidad(2);
        
        preguntaAux.setPregunta("¿Qué significa que dos palabras sean sinónimos?");
        respuestasIncorrectas.add("Cuando dos palabras se leen igual de atrás para adelante");
        respuestasIncorrectas.add("Cuando ambas palabras tienen las mismas sílabas");
        respuestasIncorrectas.add("Cuando ambas palabras tienen el mismo largo");
        respuestaCorrecta = "Que ambas palabras significan lo mismo, pero se escribe diferente";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuánto suman los ángulos de un triángulo?");
        respuestasIncorrectas.add("190");
        respuestasIncorrectas.add("185");
        respuestasIncorrectas.add("360");
        respuestaCorrecta = "180";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuántos kilos son una tonelada?");
        respuestasIncorrectas.add("10000");
        respuestasIncorrectas.add("100");
        respuestasIncorrectas.add("100000");
        respuestaCorrecta = "1000";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuánto suman los ángulos de un cuadrado?");
        respuestasIncorrectas.add("380");
        respuestasIncorrectas.add("350");
        respuestasIncorrectas.add("180");
        respuestaCorrecta = "360";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Quién escribió La Odisea?");
        respuestasIncorrectas.add("Este poema de 24 cantos fue escrito por Copernico");
        respuestasIncorrectas.add("Este poema de 24 cantos fue escrito por Spartaco");
        respuestasIncorrectas.add("Este poema de 24 cantos fue escrito por Cervantes");
        respuestaCorrecta = "Este poema de 24 cantos fue escrito por Homero";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        categoriaAux = new Categoria(); //Reseteamos la instancia auxiliar
        preguntas = new ArrayList<>();
        categoriaAux.setNombre("Conocimiento General III"); 
        categoriaAux.setNivelDeComplejidad(3);
        
        preguntaAux.setPregunta("¿Cuáles son los tipos de sabores primarios?");
        respuestasIncorrectas.add("dulce, ácido y salado.");
        respuestasIncorrectas.add("dulce, amargo y ácido");
        respuestasIncorrectas.add("dulce, amargo, ácido, salado y viscoso");
        respuestaCorrecta = "dulce, amargo, ácido, salado y umami";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuál es el río más largo del mundo?");
        respuestasIncorrectas.add("Mississippi");
        respuestasIncorrectas.add("Yangtse");
        respuestasIncorrectas.add("Nilo");
        respuestaCorrecta = "Amazonas";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cómo se llama la Reina del Reino Unido?");
        respuestasIncorrectas.add("Isabel III");
        respuestasIncorrectas.add("Isabel IV");
        respuestasIncorrectas.add("Isabel I");
        respuestaCorrecta = "Isabel II";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Qué cantidad de huesos hay en el cuerpo humano?");
        respuestasIncorrectas.add("200");
        respuestasIncorrectas.add("300");
        respuestasIncorrectas.add("306");
        respuestaCorrecta = "206";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuándo acabó la II Guerra Mundial?");
        respuestasIncorrectas.add("1940");
        respuestasIncorrectas.add("1943");
        respuestasIncorrectas.add("1939");
        respuestaCorrecta = "1945";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        categoriaAux = new Categoria(); //Reseteamos la instancia auxiliar
        preguntas = new ArrayList<>();
        categoriaAux.setNombre("Conocimiento General IV"); 
        categoriaAux.setNivelDeComplejidad(4);
        
        preguntaAux.setPregunta("¿Qué producto cultiva más Guatemala?");
        respuestasIncorrectas.add("Trigo");
        respuestasIncorrectas.add("Arroz");
        respuestasIncorrectas.add("Maíz");
        respuestaCorrecta = "Café";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Qué año llegó Cristóbal Colón a América?");
        respuestasIncorrectas.add("1455");
        respuestasIncorrectas.add("1469");
        respuestasIncorrectas.add("1490");
        respuestaCorrecta = "1492";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿En qué lugar del cuerpo se produce la insulina?");
        respuestasIncorrectas.add("Hígado");
        respuestasIncorrectas.add("Riñones");
        respuestasIncorrectas.add("Cerebro");
        respuestaCorrecta = "Páncreas";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuál fue el primer metal que empleó el hombre?");
        respuestasIncorrectas.add("Acero");
        respuestasIncorrectas.add("Bronce");
        respuestasIncorrectas.add("Aluminio");
        respuestaCorrecta = "Cobre";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cual es el metal más caro del mundo?");
        respuestasIncorrectas.add("Oro");
        respuestasIncorrectas.add("Platino");
        respuestasIncorrectas.add("Metal Galvanizado");
        respuestaCorrecta = "Rodio";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        categoriaAux = new Categoria(); //Reseteamos la instancia auxiliar
        preguntas = new ArrayList<>();
        categoriaAux.setNombre("Química"); 
        categoriaAux.setNivelDeComplejidad(5);
        
        preguntaAux.setPregunta("¿Cuál es el elemento químico con menor peso atómico?");
        respuestasIncorrectas.add("Helio");
        respuestasIncorrectas.add("Fosfato");
        respuestasIncorrectas.add("Gas propano");
        respuestaCorrecta = "Hidrógeno";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿El hielo es más denso o menos denso que el agua líquida?");
        respuestasIncorrectas.add("Es mas denso, por eso flota");
        respuestasIncorrectas.add("Tienen misma densidad, por eso flota");
        respuestasIncorrectas.add("La densidad es un invento de la sociedad");
        respuestaCorrecta = "Es menos denso, por eso flota";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cuál es el símbolo químico de la Plata?");
        respuestasIncorrectas.add("Pl");
        respuestasIncorrectas.add("P");
        respuestasIncorrectas.add("Au");
        respuestaCorrecta = "Ag";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Cómo se llaman los átomos que poseen carga positiva?");
        respuestasIncorrectas.add("Aniones");
        respuestasIncorrectas.add("Protones");
        respuestasIncorrectas.add("Positrones");
        respuestaCorrecta = "Cationes";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        
        preguntaAux.setPregunta("¿Qué partículas subatómicas tienen una masa aproximada de 1?");
        respuestasIncorrectas.add("Solo los protones");
        respuestasIncorrectas.add("Solo los neutrones");
        respuestasIncorrectas.add("Los quarks");
        respuestaCorrecta = "Protones y neutrones";
        preguntaAux.setRespuestaCorrecta(respuestaCorrecta);
        preguntaAux.setRespuestasIncorrectas(respuestasIncorrectas);
        preguntas.add(preguntaAux);
        
        preguntaAux = new Pregunta(); //Reseteamos la variable
        respuestasIncorrectas = new ArrayList<>(); //Reseteamos la variable
        categoriaAux.setPreguntas(preguntas); //Añadimos las preguntas creadas a la categoría
        categorias.add(categoriaAux); //Añadimos la categoría con sus respectivas preguntas a una lista del mismo tipo
        
        
        return categorias;
    }
}
