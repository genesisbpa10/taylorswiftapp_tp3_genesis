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

        // Agregamos una pausa para que el usuario pueda leer la información antes de volver al menú principal
        scanner.nextLine();
        System.out.print("Presiona Enter para volver al menú principal...");

        // Cerramos el scanner
        scanner.close();
    }
}