package model;

public abstract class MaterialBibliografico {
    protected String codigo;
    protected String titulo;
    protected boolean disponible;

    public abstract boolean sePuedePrestar();
    // Se generó similar al método toString
    // Investigar sobre el método toString...
    public String toString() {
        return "MaterialBibliografico [codigo=" + codigo 
        + ", titulo=" + titulo 
        + ", disponible=" + disponible
        + ", sePuedePrestar=" + sePuedePrestar() + "] \n";
    }

    //Método para construir objetos de la clase: MaterialBibliogrfico
    public MaterialBibliografico(String cod, String titulo, boolean disponible) {
        this.codigo = cod;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}