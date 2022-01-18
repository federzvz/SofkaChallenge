/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Clases;

/**
 *
 * @author Admin
 */
public class Categoria {
    private String nombre;
    private int nivelDeComplejidad;

    public Categoria(String nombre, int nivelDeComplejidad) {
        this.nombre = nombre;
        this.nivelDeComplejidad = nivelDeComplejidad;
    }

    public Categoria() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelDeComplejidad() {
        return nivelDeComplejidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelDeComplejidad(int nivelDeComplejidad) {
        this.nivelDeComplejidad = nivelDeComplejidad;
    }
}
