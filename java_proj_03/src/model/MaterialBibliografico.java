package model;

public class MaterialBibliografico {
    protected String codigo;
    protected String titulo;
    protected boolean disponible;
    protected boolean sePuedePrestar;

    public boolean sePuedePrestar(boolean puede){
        sePuedePrestar = puede;
        return sePuedePrestar;
    }

    // Se generó similar al método toString
    // Investigar sobre el método toString...
    public String mostrarInfo() {
        return "MaterialBibliografico [codigo=" + codigo 
        + ", titulo=" + titulo 
        + ", disponible=" + disponible
        + ", sePuedePrestar=" + sePuedePrestar + "] \n";
    }

    //Método para construir objetos de la clase: MaterialBibliogrfico
    public MaterialBibliografico(String cod, String titulo, boolean disponible, 
        boolean sePuedePrestar) {

        this.codigo = cod;
        this.titulo = titulo;
        this.disponible = disponible;
        this.sePuedePrestar = sePuedePrestar;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean isSePuedePrestar() {
        return sePuedePrestar;
    }

    public void setSePuedePrestar(boolean sePuedePrestar) {
        this.sePuedePrestar = sePuedePrestar;
    }

}