package model;

public abstract class FiguraGeometrica {

    protected String nombre;

    protected double dimension1;

    protected double dimension2;

    protected double area;

    protected double perimetro;

    public FiguraGeometrica(String nombre, double dimension1, double dimension2) {

        this.nombre = nombre;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public void mostrarInfo() {

        System.out.println("\n========================");
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("========================");
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}