package app;

import java.util.Scanner;
import services.Discografia;
import services.Recomendacion;
import services.Lista;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.print("¡Bienvenido a la aplicación de Taylor Swift! Por favor, introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("¡Hola, " + nombreUsuario + "!");

        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Recorrer la discografía");
            System.out.println("2. Crear una lista de favoritos");
            System.out.println("3. Generar una recomendación");
            System.out.println("4. Salir");
            System.out.print("Ingresa la opción de tu preferencia: ");
            
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    Discografia.recorrerDiscografia(); // Llama al método para recorrer la discografía
                    break;
                case "2":
                    Lista.crearListaFavoritos(); // Llama al método para crear una lista de favoritos
                    break;
                case "3":
                    Recomendacion.generarRecomendacion(); // Llama al método para generar una recomendación
                    break;
                case "4":
                    System.out.println("\n¡Hasta luego, " + nombreUsuario + "!"); // Mensaje de despedida al usuario
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }

        } while (!opcion.equals("4"));

        scanner.close(); // Cierra el Scanner al salir del bucle
    }
}