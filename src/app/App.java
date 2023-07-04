package app;

import java.util.Scanner;
import services.Discografia;
import services.Recomendacion;
import services.Lista;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.print("¡Bienvenido a la aplicación de Taylor Swift! Por favor, introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("¡Hola, " + nombreUsuario + "!");

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Recorrer la discografía");
            System.out.println("2. Crear una lista de favoritos");
            System.out.println("3. Generar una recomendación");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            String opcionStr = scanner.nextLine();

            try {
                opcion = Integer.parseInt(opcionStr);
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    Discografia.recorrerDiscografia();
                    break;
                case 2:
                    Lista.crearListaFavoritos();
                    break;
                case 3:
                    Recomendacion.generarRecomendacion();
                    break;
                case 4:
                    System.out.println("\n¡Hasta luego, " + nombreUsuario + "!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}