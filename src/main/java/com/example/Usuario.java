package com.example;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private List<Libro> listaPrestamos;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.listaPrestamos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Libro> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Libro> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }


    public void prestarLibro(Libro libro){
        if(libro.isDisponible()){
            libro.prestar();
            listaPrestamos.add(libro);
            System.out.println( nombre + "tomo el libro prestado"  + libro.getTitulo());
        } else {
            System.out.println("El libro está prestado : " + libro.getTitulo() + "\" no disponible. ");
        }
    }
    
    public void devolverLibro(Libro libro ){
        if (listaPrestamos.contains(libro)){
            libro.devolver();
            listaPrestamos.remove(libro);
            System.out.println(nombre +" Ha devuelto el libro" + libro.getTitulo());
        } else{
            System.out.println(nombre + "no tiene prestado el libro " + libro.getTitulo());
        }
    }

    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", librosPrestados=" + listaPrestamos.size() +
                '}';
    }
}

