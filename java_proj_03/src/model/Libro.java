package model;

public class Libro extends MaterialBibliografico{

    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;
    
    public Libro(String cod, String titulo, boolean disponible, boolean sePuedePrestar, String autor, String isbn,
            String editorial, int paginas) {
        super(cod, titulo, disponible, sePuedePrestar);
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    @Override
    public String mostrarInfo() {
        return "Libro [codigo=" + codigo + ", titulo=" + 
        titulo + ", autor=" + autor + ", disponible=" + disponible
                + ", isbn=" + isbn + ", sePuedePrestar=" + sePuedePrestar + 
                ", editorial=" + editorial + ", paginas="
                + paginas + "]";
    }
}