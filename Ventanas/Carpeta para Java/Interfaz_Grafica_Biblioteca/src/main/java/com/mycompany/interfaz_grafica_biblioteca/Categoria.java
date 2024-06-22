/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan David
 */
package com.mycompany.interfaz_grafica_biblioteca;

public class Categoria {
    String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarInfo() {
        return "Categoria: " + nombre;
    }
}

