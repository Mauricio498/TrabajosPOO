package model;

public class Moto extends Vehiculo {

    public Moto(String patente, String marca, double velocidadActual) {
        super(patente, marca, velocidadActual);
    }

    @Override
    public boolean comprobarExcesoVelocidad() {
        return getVelocidadActual() > 110;
    }

}
