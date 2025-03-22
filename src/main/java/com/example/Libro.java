package com.example;

public class Libro {
private String titulo;
private String autor;
private String isbm;
private int añoPublicado;
private boolean disponible;

public Libro(String titulo, String autor, String isbm, double añoPuclicado, boolean disponible) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbm = isbm;
    this.añoPublicado = añoPublicado;
    this.disponible = disponible;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getIsbm() {
    return isbm;
}

public void setIsbm(String isbm) {
    this.isbm = isbm;
}

public double getAñoPuclicado() {
    return añoPublicado;
}

public void setAñoPuclicado(double añoPuclicado) {
    this.añoPublicado = añoPublicado;
}

public boolean isDisponible() {
    return disponible;
}

public void setDisponible(boolean disponible) {
    this.disponible = disponible;
}

public void prestar(){
    if (disponible) {
        disponible = false;
        System.out.println(" El libro : " + titulo + " ya ha sido prestado");
}   else {
    System.out.println(" El libro : " + titulo + "no se encuentra disponible");}
}

public void devolver(){
    if (!disponible){
        disponible = true;
        System.out.println(" El libro : " + titulo + " ha sido devuelto, y esta disponible");
    } else{
        System.out.println(" El libro : " + titulo + " ya se encuentra disponible");
    }

}
public String toString() {
    return "Libro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", isbn='" + isbm + '\'' +
            ", añoPublicado=" + añoPublicado +
            ", disponible=" + disponible +
            '}';
}
}

