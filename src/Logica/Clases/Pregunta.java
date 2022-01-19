/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Clases;

import java.util.List;

/*
 *
 * @author Admin
 */
public class Pregunta extends Categoria {
    private String pregunta, respuestaCorrecta, categoria;
    private List<String> respuestasIncorrectas;

    public Pregunta(String pregunta, String respuestaCorrecta, List<String> respuestasIncorrectas) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestasIncorrectas = respuestasIncorrectas;
    }

    public Pregunta() {
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public List<String> getRespuestasIncorrectas() {
        return respuestasIncorrectas;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setRespuestasIncorrectas(List<String> respuestasIncorrectas) {
        this.respuestasIncorrectas = respuestasIncorrectas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
