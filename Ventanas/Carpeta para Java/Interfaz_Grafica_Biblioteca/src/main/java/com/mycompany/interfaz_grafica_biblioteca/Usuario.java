/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan David
 */
package com.mycompany.interfaz_grafica_biblioteca;

public class Usuario {
    String nombre;
    String apellido;
    String idUsuario;

    public Usuario(String nombre, String apellido, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String mostrarInfo() {
        return "Usuario: " + nombre + " " + apellido + "\nId: " + idUsuario;
    }
}
