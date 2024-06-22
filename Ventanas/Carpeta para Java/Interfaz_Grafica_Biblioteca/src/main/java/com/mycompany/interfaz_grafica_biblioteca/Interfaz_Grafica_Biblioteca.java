
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * autor Juan David
 */
package com.mycompany.interfaz_grafica_biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Interfaz_Grafica_Biblioteca extends JFrame {
    JTextField entryTitulo, entryIdLibro, entryAutorNombre, entryAutorApellido, entryCategoria;
    JTextField entryUsuarioNombre, entryUsuarioApellido, entryIdUsuario;
    JTextField entryIdPrestamoLibro, entryIdPrestamoUsuario, entryFechaPrestamo, entryFechaDevolucion;
    Biblioteca biblioteca;

    public Interfaz_Grafica_Biblioteca() {
        biblioteca = new Biblioteca();
        setTitle("Sistema de Gestión Biblioteca");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblRegistrarLibro = new JLabel("Registrar libro");
        lblRegistrarLibro.setBounds(10, 10, 200, 20);
        add(lblRegistrarLibro);

        JLabel lblTitulo = new JLabel("Titulo");
        lblTitulo.setBounds(10, 40, 100, 20);
        add(lblTitulo);

        entryTitulo = new JTextField();
        entryTitulo.setBounds(120, 40, 200, 20);
        add(entryTitulo);

        JLabel lblIdLibro = new JLabel("ID");
        lblIdLibro.setBounds(10, 70, 100, 20);
        add(lblIdLibro);

        entryIdLibro = new JTextField();
        entryIdLibro.setBounds(120, 70, 200, 20);
        add(entryIdLibro);

        JLabel lblAutorNombre = new JLabel("Autor Nombre");
        lblAutorNombre.setBounds(10, 100, 100, 20);
        add(lblAutorNombre);

        entryAutorNombre = new JTextField();
        entryAutorNombre.setBounds(120, 100, 200, 20);
        add(entryAutorNombre);

        JLabel lblAutorApellido = new JLabel("Autor Apellido");
        lblAutorApellido.setBounds(10, 130, 100, 20);
        add(lblAutorApellido);

        entryAutorApellido = new JTextField();
        entryAutorApellido.setBounds(120, 130, 200, 20);
        add(entryAutorApellido);

        JLabel lblCategoria = new JLabel("Categoria");
        lblCategoria.setBounds(10, 160, 100, 20);
        add(lblCategoria);

        entryCategoria = new JTextField();
        entryCategoria.setBounds(120, 160, 200, 20);
        add(entryCategoria);

        JButton btnRegistrarLibro = new JButton("Registrar Libro");
        btnRegistrarLibro.setBounds(10, 190, 150, 30);
        btnRegistrarLibro.addActionListener((ActionEvent e) -> {
            registrarLibro();
        });
        add(btnRegistrarLibro);

        JLabel lblRegistrarUsuario = new JLabel("Registrar Usuario");
        lblRegistrarUsuario.setBounds(10, 230, 200, 20);
        add(lblRegistrarUsuario);

        JLabel lblUsuarioNombre = new JLabel("Nombre");
        lblUsuarioNombre.setBounds(10, 260, 100, 20);
        add(lblUsuarioNombre);

        entryUsuarioNombre = new JTextField();
        entryUsuarioNombre.setBounds(120, 260, 200, 20);
        add(entryUsuarioNombre);

        JLabel lblUsuarioApellido = new JLabel("Apellido");
        lblUsuarioApellido.setBounds(10, 290, 100, 20);
        add(lblUsuarioApellido);

        entryUsuarioApellido = new JTextField();
        entryUsuarioApellido.setBounds(120, 290, 200, 20);
        add(entryUsuarioApellido);

        JLabel lblIdUsuario = new JLabel("ID Usuario");
        lblIdUsuario.setBounds(10, 320, 100, 20);
        add(lblIdUsuario);

        entryIdUsuario = new JTextField();
        entryIdUsuario.setBounds(120, 320, 200, 20);
        add(entryIdUsuario);

        JButton btnRegistrarUsuario = new JButton("Registrar Usuario");
        btnRegistrarUsuario.setBounds(10, 350, 150, 30);
        btnRegistrarUsuario.addActionListener((ActionEvent e) -> {
            registrarUsuario();
        });
        add(btnRegistrarUsuario);

        JLabel lblRegistrarPrestamo = new JLabel("Registrar Prestamo");
        lblRegistrarPrestamo.setBounds(10, 390, 200, 20);
        add(lblRegistrarPrestamo);

        JLabel lblIdPrestamoLibro = new JLabel("ID Libro");
        lblIdPrestamoLibro.setBounds(10, 420, 100, 20);
        add(lblIdPrestamoLibro);

        entryIdPrestamoLibro = new JTextField();
        entryIdPrestamoLibro.setBounds(120, 420, 200, 20);
        add(entryIdPrestamoLibro);

        JLabel lblIdPrestamoUsuario = new JLabel("ID Usuario");
        lblIdPrestamoUsuario.setBounds(10, 450, 100, 20);
        add(lblIdPrestamoUsuario);

        entryIdPrestamoUsuario = new JTextField();
        entryIdPrestamoUsuario.setBounds(120, 450, 200, 20);
        add(entryIdPrestamoUsuario);

        JLabel lblFechaPrestamo = new JLabel("Fecha Prestamo");
        lblFechaPrestamo.setBounds(10, 480, 100, 20);
        add(lblFechaPrestamo);

        entryFechaPrestamo = new JTextField();
        entryFechaPrestamo.setBounds(120, 480, 200, 20);
        add(entryFechaPrestamo);

        JLabel lblFechaDevolucion = new JLabel("Fecha Devolucion");
        lblFechaDevolucion.setBounds(10, 510, 100, 20);
        add(lblFechaDevolucion);

        entryFechaDevolucion = new JTextField();
        entryFechaDevolucion.setBounds(120, 510, 200, 20);
        add(entryFechaDevolucion);

        JButton btnRealizarPrestamo = new JButton("Registrar Prestamo");
        btnRealizarPrestamo.setBounds(10, 540, 150, 30);
        btnRealizarPrestamo.addActionListener((ActionEvent e) -> {
            realizarPrestamo();
        });
        add(btnRealizarPrestamo);

        JButton btnMostrarLibros = new JButton("Mostrar Libros");
        btnMostrarLibros.setBounds(200, 540, 150, 30);
        btnMostrarLibros.addActionListener((ActionEvent e) -> {
            mostrarLibros();
        });
        add(btnMostrarLibros);
    }

    private void registrarLibro() {
        Autor autor = new Autor(entryAutorNombre.getText(), entryAutorApellido.getText());
        Categoria categoria = new Categoria(entryCategoria.getText());
        Libro libro = new Libro(entryTitulo.getText(), entryIdLibro.getText(), autor, categoria);
        biblioteca.registrarLibro(libro);
        JOptionPane.showMessageDialog(this, "Libro registrado con éxito");
    }

    private void registrarUsuario() {
        Usuario usuario = new Usuario(entryUsuarioNombre.getText(), entryUsuarioApellido.getText(), entryIdUsuario.getText());
        biblioteca.registrarUsuario(usuario);
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito");
    }

    private void realizarPrestamo() {
        String idLibro = entryIdPrestamoLibro.getText();
        String idUsuario = entryIdPrestamoUsuario.getText();
        String fechaPrestamo = entryFechaPrestamo.getText();
        String fechaDevolucion = entryFechaDevolucion.getText();

        Libro libro = biblioteca.buscarLibro(idLibro);
        Usuario usuario = biblioteca.buscarUsuario(idUsuario);

        if (libro != null && usuario != null) {
            Prestamo prestamo = new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
            biblioteca.realizarPrestamo(prestamo);
            JOptionPane.showMessageDialog(this, "Préstamo realizado con éxito");
        } else {
            JOptionPane.showMessageDialog(this, "Error: No se encontró el libro o el usuario");
        }
    }

    private void mostrarLibros() {
        String infoLibros = biblioteca.mostrarLibros();
        JOptionPane.showMessageDialog(this, infoLibros);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interfaz_Grafica_Biblioteca().setVisible(true);
        });
    }
}

