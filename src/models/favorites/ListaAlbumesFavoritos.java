package models.favorites;

import java.util.ArrayList;

public class ListaAlbumesFavoritos extends ListaFavoritos {
    // Atributos

    // Atributo propio de Lista de Álbumes Favoritos, a implementar próximamente
    private String descripcionAlbumFavorito;

    public ListaAlbumesFavoritos(String nombreLista, ArrayList<String> itemsLista, String descripcionAlbumFavorito) {
        super(nombreLista, itemsLista);
        this.descripcionAlbumFavorito = descripcionAlbumFavorito;

    }
    // Métodos

    // Setteres y getters
    public void setDescripcionAlbumFavorito(String descripcionAlbumFavorito) {
        this.descripcionAlbumFavorito = descripcionAlbumFavorito;
    }

    public String descripcionAlbumFavorito() {
        return descripcionAlbumFavorito;
    }

    // Sobreescritura del método abstracto heredado
    @Override
    public void mostrarInformación() {
        System.out.println("Nombre de la lista de álbumes favoritos: " + getNombreLista());
        System.out.println("Descripción: " + descripcionAlbumFavorito);
        System.out.println("Albumes favoritos:");
        for (String album : getItemsLista()) {
            System.out.println("- " + album);
        }
    }
}
