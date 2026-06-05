package model;

public class Pentagono extends FiguraGeometrica {

    public Pentagono(double lado){
        super("Pentágono", lado, 0);

        calcularArea();
        calcularPerimetro();
    }
    @Override
    public void calcularArea() {

        area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(dimension1, 2)) / 4;
    }

    @Override
    public void calcularPerimetro() {

        perimetro = 5 * dimension1;
    }

}
