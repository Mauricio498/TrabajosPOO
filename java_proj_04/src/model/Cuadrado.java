package model;

public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(double lado) {

        super("Cuadrado", lado, 0);

        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {

        area = dimension1 * dimension1;
    }

    @Override
    public void calcularPerimetro() {

        perimetro = dimension1 * 4;
    }
}