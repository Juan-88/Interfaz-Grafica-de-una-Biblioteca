/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan David
 */
package com.mycompany.interfaz_grafica_biblioteca;

public class Libro {
    String titulo;
    String id;
    Autor autor;
    Categoria categoria;


    public Libro(String titulo, String id, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String mostrarInfo() {
        return "Titulo: " + titulo + "\nId: " + id + "\nAutor: " + autor.mostrarInfo() + "\nCategoria: " + categoria.mostrarInfo();
    }
}
