package model;

public class Camion extends Vehiculo {

    public Camion(String patente, String marca, double velocidadActual) {
        super(patente, marca, velocidadActual);
    }

    @Override
    public boolean comprobarExcesoVelocidad() {
        return getVelocidadActual() < 90;
    }

}
