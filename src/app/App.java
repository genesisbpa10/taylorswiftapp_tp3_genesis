package app;

import java.util.Scanner;
import services.Discografia;
import services.Recomendacion;
import services.Lista;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenidx!");
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Hola, " + nombreUsuario + "! ¿En qué puedo ayudarte?");
        System.out.println("1) Recorrido por la discografía de Taylor Swift");
        System.out.println("2) Recomendación de alguna canción aleatoria");
        System.out.println("3) Crear una lista de álbumes o canciones favoritos");

        System.out.print("Ingresa el número de la opción que deseas: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Lógica para el recorrido por la discografía de Taylor Swift
                Discografia.recorrerDiscografia();
                break;
            case 2:
                // Lógica para la recomendación de algún álbum aleatorio
                Recomendacion.generarRecomendacion();
                break;
            case 3:
                // Lógica para crear una lista de álbumes o canciones favoritos
                Lista.crearListaFavoritos();
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingresa un número válido.");
                break;
        }

        scanner.close();
    }

}
