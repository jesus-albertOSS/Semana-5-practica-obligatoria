package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        // Creamos la biblioteca

         Biblioteca biblioteca = new Biblioteca();

         //creamos libros
        Libro libro1 = new Libro("La casa Azul", "Martin figueroa","13-2-98" , 1979, true);
        Libro libro2 = new Libro("La casa amarilla", "Luis perez", "56-06-743", 1849, true);
        Libro libro3 = new Libro("La casa roja", "Alex Cardenas", "4-4-7", 1767, true);


        // agregamos libros
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // creamos usuarios
        Usuario usuario1 = new Usuario(152752,"Jesus Osuna","usajesuscash@gmail.com");
        Usuario usuario2 = new Usuario(224257,"Alex Carnedas","alex@gmail.com");

        // registrar usuarios a la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        // mostrar libros disponibles antes de prestar
        biblioteca.mostrarLibrosDisponibles();

        // como prestar libros a los usuarios
         biblioteca.prestarLibro(usuario1, libro1, LocalDate.of(2025, 4, 13));
        biblioteca.prestarLibro(usuario2, libro2, LocalDate.of(2025, 4, 9));

        // mostrar préstamos activos
        biblioteca.mostrarPrestamosActivos();

        // intentando prestar un libro ya prestado
        biblioteca.prestarLibro(usuario1, libro1, LocalDate.of(2025, 4, 23));

        // Mostrar libros disponibles después de los préstamos
        biblioteca.mostrarLibrosDisponibles();

         // Devolver un libro
         biblioteca.devolverLibro(usuario1, libro1);

         // Mostrar libros disponibles y préstamos activos después de la devolución
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.mostrarPrestamosActivos();

    }

}