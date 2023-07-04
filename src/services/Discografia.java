package services;

import java.util.ArrayList;
import java.util.Scanner;
import models.Album;

public class Discografia {

    public static void recorrerDiscografia() {
        System.out.println("Hola, escogiste recorrer la discografía de Taylor. ¡Excelente opción!");
        ArrayList<Album> discografia = InicializadorAlbumes.inicializarAlbumes();

        Scanner scanner = new Scanner(System.in);
        boolean finalizar = false;
        int index = 0;

        try {
            while (!finalizar && index < discografia.size()) {
                Album album = discografia.get(index);
                System.out.println("Título del álbum: " + album.getTituloAlbum());
                System.out.println("Año de lanzamiento: " + album.getAnioLanzamiento());
                System.out.println("Canciones:");

                ArrayList<String> canciones = album.getCancionesDelAlbum();
                for (String cancion : canciones) {
                    System.out.println("- " + cancion);
                }

                System.out.println("--------------------");

                if (index < discografia.size() - 1) {
                    System.out.print("¿Deseas continuar con el siguiente álbum? (S/N): ");
                    String opcion = scanner.nextLine();
                    if (opcion.equalsIgnoreCase("N")) {
                        finalizar = true;
                    }
                } else {
                    System.out.println("Has alcanzado el final de la discografía.");
                    finalizar = true;
                }

                index++;
            }
        } catch (Exception e) {
            // Manejo de la excepción
            System.out.println("Ocurrió un error al recorrer la discografía: " + e.getMessage());
        } finally {
            scanner.close();
            System.exit(0); // Finaliza la aplicación
        }
    }
}