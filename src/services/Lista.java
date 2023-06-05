package services;

import java.util.ArrayList;
import java.util.Scanner;

import models.favorites.ListaAlbumesFavoritos;
import models.favorites.ListaCancionesFavoritos;
import models.favorites.ListaFavoritos;

public class Lista {
    public static void crearListaFavoritos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué tipo de lista de favoritos quiere crear? (1)Para álbumes (2)Para canciones): ");
        String tipoLista = scanner.nextLine();

        System.out.print("Ingrese el nombre de la lista de favoritos: ");
        String nombreLista = scanner.nextLine();

        System.out.print("Ingrese una descripción: ");
        String descripcion = scanner.nextLine();

        ArrayList<String> itemsLista = new ArrayList<>();

        while (true) {
            System.out.print("Ingrese un item (o 'fin' para terminar): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("fin")) {
                break;
            }

            itemsLista.add(item);
        }

        ListaFavoritos listaFavoritos;

        switch (tipoLista) {
            case "1":
                listaFavoritos = new ListaAlbumesFavoritos(nombreLista, itemsLista, descripcion);
                break;
            case "2":
                listaFavoritos = new ListaCancionesFavoritos(nombreLista, itemsLista, descripcion);
                break;
            default:
                System.out.println("Tipo de lista no válido. Saliendo del programa.");
                scanner.close();
                return;
        }

        System.out.println("\nLa lista de favoritos ha sido creada:");
        listaFavoritos.mostrarInformación();

        scanner.close();

    }
}
