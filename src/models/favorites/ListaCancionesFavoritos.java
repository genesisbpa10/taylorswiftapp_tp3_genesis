package models.favorites;

import java.util.ArrayList;

public class ListaCancionesFavoritos extends ListaFavoritos {

    // Atributos

    // Atributo propio de Lista de Canciones Favoritas, a implementar próximamente
    private String descripcionCancionFavorita;

    public ListaCancionesFavoritos(String nombreLista, ArrayList<String> itemsLista, String descripcionCancionFavorita) {
        super(nombreLista, itemsLista);
        this.descripcionCancionFavorita = descripcionCancionFavorita;
    }

    // Métodos 
        
    // Setteres y getters
    public void setDescripcionCancionFavorita(String descripcionCancionFavorita){
        this.descripcionCancionFavorita= descripcionCancionFavorita;
    }
    public String getDescripcionCancionFavorita() {
        return descripcionCancionFavorita;
    }

    //Sobreescritura del método abstracto heredado
    @Override
    public void mostrarInformación() {
        System.out.println("Nombre de la lista de canciones favoritas: " + getNombreLista());
        System.out.println("Descripción: " + descripcionCancionFavorita);
        System.out.println("Canciones favoritas:");
        for (String cancion : getItemsLista()) {
            System.out.println("- " + cancion);
        }
    }

}
