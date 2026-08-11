package model;

public class Auto extends Vehiculo {

    public Auto(String patente, String marca, double velocidadActual) {
        super(patente, marca, velocidadActual);
    }

    @Override
    public boolean comprobarExcesoVelocidad() {
        return getVelocidadActual() > 120;
    }
}
