package model;

public class Tesis extends MaterialBibliografico {

    private String autor;
    private String carrera;
    private String universidad;
    private int anio;


    public Tesis(String codigo,String titulo, boolean disponible, String autor, String carrera, String universidad, int anio) {

        super(codigo, titulo, disponible);
        this.autor = autor;
        this.carrera = carrera;
        this.universidad = universidad;
        this.anio = anio;
    }

    @Override
    public boolean sePuedePrestar() {
        return false;
    }

    @Override
    public String toString() {
        return "Tesis [autor=" + autor + ", carrera=" + carrera + ", universidad=" + universidad + ", anio=" + anio
                + "]";
    }


}