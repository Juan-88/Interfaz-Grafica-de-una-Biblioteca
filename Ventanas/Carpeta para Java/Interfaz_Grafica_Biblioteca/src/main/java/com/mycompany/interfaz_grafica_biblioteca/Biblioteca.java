/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Juan David 
 */
package com.mycompany.interfaz_grafica_biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;
    ArrayList<Usuario> usuarios;
    ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public String mostrarLibros() {
        StringBuilder infoLibros = new StringBuilder();
        for (Libro libro : libros) {
            infoLibros.append(libro.mostrarInfo()).append("\n");
        }
        return infoLibros.length() > 0 ? infoLibros.toString() : "No hay libros registrados";
    }

    public Libro buscarLibro(String id) {
        for (Libro libro : libros) {
            if (libro.getId().equals(id)) {
                return libro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(idUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}

