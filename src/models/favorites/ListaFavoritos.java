package models.favorites;

import java.util.ArrayList;

public abstract class ListaFavoritos {

    // Atributos
    protected String nombreLista;
    protected ArrayList<String> itemsLista;

    // Métodos constructores
    public ListaFavoritos() {

    }

    public ListaFavoritos(String nombreLista, ArrayList<String> itemsLista) {
        this.nombreLista = nombreLista;
        this.itemsLista = new ArrayList<String>(itemsLista);
    }

    // Setters y getters
    public void setNombreListA(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    protected void setItemsLista(ArrayList<String> itemsLista) {
        this.itemsLista = itemsLista;
    }

    protected ArrayList<String> getItemsLista() {
        return itemsLista;
    }

    // Otros métodos para utilizar próximamente

    public void agregarItemLista(String itemFavorito) {
        itemsLista.add(itemFavorito);
    }

    public void eliminarItemLista(String itemFavorito) {
        itemsLista.remove(itemFavorito);
    }

    // Métodos abtsractos
    public abstract void mostrarInformación();

}
