package models.favorites;

import java.util.ArrayList;
//Falta implementar el método abstracto que viene de ListaFavoritos

//Atributos de Lista de Álbumes Favoritas, si es necesario agregarles
public class ListaAlbumesFavoritos extends ListaFavoritos {

    private String descripcionAlbumFavorito;

    public ListaAlbumesFavoritos(String nombreLista, ArrayList<String> itemsLista, String descripcionAlbumFavorito) {
        super(nombreLista, itemsLista);
        this.descripcionAlbumFavorito= descripcionAlbumFavorito;
    }

    // Setteres y getters

    public void setDescripcionAlbumFavorito(String descripcionAlbumFavorito) {
        this.descripcionAlbumFavorito = descripcionAlbumFavorito;
    }

    public String descripcionAlbumFavorito() {
        return descripcionAlbumFavorito;
    }

    @Override
    public void mostrarInformación() {
        System.out.println("Nombre de la lista de álbumes favoritos: " + getNombreLista());
        System.out.println("Descripción: " + descripcionAlbumFavorito);
        System.out.println("Albumes favoritos:");
        for (String album : getItemsLista()) {
            System.out.println("- " + album);
        }
    }
    // Otros métodos

}
