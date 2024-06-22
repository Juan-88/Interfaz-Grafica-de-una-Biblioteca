/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan David
 */
package com.mycompany.interfaz_grafica_biblioteca;

public class Prestamo {
    Libro libro;
    Usuario usuario;
    String fechaPrestamo;
    String fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo, String fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String mostrarInfo() {
        return "Prestamo\nLibro: " + libro.mostrarInfo() + "\nUsuario: " + usuario.mostrarInfo() + "\nFecha prestamo: " + fechaPrestamo + "\nFecha devolucion: " + fechaDevolucion;
    }
}
