package models;

import java.util.ArrayList;

public class Album {
    // Atributos
    private String tituloAlbum;
    private int anioLanzamiento;
    private ArrayList<String> cancionesDelAlbum;

    // Métodos constructores
    public Album() {

    }

    public Album(String tituloAlbum, int anioLanzamiento, ArrayList<String> cancionesDelAlbum) {
        this.tituloAlbum = tituloAlbum;
        this.anioLanzamiento = anioLanzamiento;
        this.cancionesDelAlbum = cancionesDelAlbum;

    }

    // Setters y Getters

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setCancionesDelAlbum(ArrayList<String> cancionesDelAlbum) {
        this.cancionesDelAlbum = cancionesDelAlbum;
    }

    public ArrayList<String> getCancionesDelAlbum() {
        return cancionesDelAlbum;
    }

    // Otros métodos
}
