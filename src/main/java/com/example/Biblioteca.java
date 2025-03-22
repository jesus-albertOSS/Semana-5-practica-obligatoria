package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    // Método para registrar un usuario
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    // Método para prestar un libro a un usuario
    public void prestarLibro(Usuario usuario, Libro libro, LocalDate fechaDevolucion) {
        if (libro.isDisponible() && usuarios.contains(usuario)) {
            libro.prestar();
            Prestamo nuevoPrestamo = new Prestamo(libro, usuario, LocalDate.now(), fechaDevolucion);
            prestamos.add(nuevoPrestamo);
            usuario.prestarLibro(libro);
            System.out.println(usuario.getNombre() + " ha tomado prestado \"" + libro.getTitulo() + "\" hasta " + fechaDevolucion);
        } else {
            System.out.println("No se pudo prestar el libro: " + libro.getTitulo());
        }
    }

    // Método para devolver un libro
    public void devolverLibro(Usuario usuario, Libro libro) {
        Prestamo prestamoAEliminar = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro) && prestamo.getUsuario().equals(usuario)) {
                prestamoAEliminar = prestamo;
                break;
            }
        }

        if (prestamoAEliminar != null) {
            prestamos.remove(prestamoAEliminar);
            usuario.devolverLibro(libro);
            libro.devolver();
            System.out.println(usuario.getNombre() + " ha devuelto \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("No se encontró un préstamo activo para este libro y usuario.");
        }
    }

    // Método para mostrar los libros disponibles en la biblioteca
    public void mostrarLibrosDisponibles() { 
        System.out.println("\nLibros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }

    // Método para mostrar los préstamos activos
    public void mostrarPrestamosActivos() {
        System.out.println("\nPréstamos activos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
