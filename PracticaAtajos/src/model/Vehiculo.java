package model;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    private double velocidadActual;
    public Vehiculo(String patente, String marca, double velocidadActual) {
        this.patente = patente;
        this.marca = marca;
        this.velocidadActual = velocidadActual;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public abstract boolean comprobarExcesoVelocidad();
}