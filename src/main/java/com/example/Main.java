package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // Creamos la biblioteca

         Biblioteca biblioteca = new Biblioteca();

         //creamos libros
        Libro libro1 = new Libro("Pecar o morir", "Carlos Ojeda","14-2-58" , 1999, true);
        Libro libro2 = new Libro("Paramos Dorados", "George Orwell", "978-0-452-28423-4", 1949, true);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7", 1967, true);


        // agregamos libros
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // creamos usuarios
        Usuario usuario1 = new Usuario(152752,"Carlos Blanco","carlos1@example.com");
        Usuario usuario2 = new Usuario(224257,"Juan Perez","juan1@example.com");

        // registrar usuarios a la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // mostrar libros disponibles antes de prestar
        biblioteca.mostrarLibrosDisponibles();

        // como prestar libros a los usuarios
         biblioteca.prestarLibro(usuario1, libro1, LocalDate.of(2025, 3, 10));
        biblioteca.prestarLibro(usuario2, libro2, LocalDate.of(2025, 3, 15));

        // mostrar préstamos activos
        biblioteca.mostrarPrestamosActivos();

        // intentando prestar un libro ya prestado
        biblioteca.prestarLibro(usuario1, libro1, LocalDate.of(2025, 3, 20));

        // Mostrar libros disponibles después de los préstamos
        biblioteca.mostrarLibrosDisponibles();

         // Devolver un libro
         biblioteca.devolverLibro(usuario1, libro1);

         // Mostrar libros disponibles y préstamos activos después de la devolución
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.mostrarPrestamosActivos();

    }

}