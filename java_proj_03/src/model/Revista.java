package model;

public class Revista extends MaterialBibliografico {
    private String edicion;
    private int mesPub;
    private String categoria;

    //Constructor de la Clase
    public Revista(String cod, String titulo, boolean disponible, String edicion, int mesPub,
            String categoria) {
        super(cod, titulo, disponible); //Construcotor de la clase padre
        this.edicion = edicion;
        this.mesPub = mesPub;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", edicion=" + edicion + ", disponible="
                + disponible + ", mesPub=" + mesPub + ", categoria=" + categoria + "]";
    }
    
    @Override
    public boolean sePuedePrestar() {
        // Si se puede prestar
        return true;
    }

}