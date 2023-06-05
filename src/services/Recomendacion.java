package services;

import java.util.ArrayList;
import java.util.Random;

import models.Album;

public class Recomendacion {
    public static void generarRecomendacion() {
        ArrayList<Album> discografia = InicializadorAlbumes.inicializarAlbumes();
        Random random = new Random();

        // Obtener un álbum aleatorio de la lista de álbumes
        Album albumRecomendado = discografia.get(random.nextInt(discografia.size()));

        // Obtener una canción aleatoria del álbum recomendado
        ArrayList<String> cancionesDelAlbum = albumRecomendado.getCancionesDelAlbum();
        String cancionRecomendada = cancionesDelAlbum.get(random.nextInt(cancionesDelAlbum.size()));

        // Mostrar la recomendación al usuario
        System.out.println("Hola, tu recomendación de hoy es:");
        System.out.println("Canción: " + cancionRecomendada);
        System.out.println("Pertenece al álbum: " + albumRecomendado.getTituloAlbum());

        // Más funcionalidad
    }
}