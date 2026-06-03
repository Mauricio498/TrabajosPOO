package model;

public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrimestre;
    private String correo;

    public Alumno(String matricula, String nombre, String carrera, int cuatrimestre, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.correo = correo;
    }

    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", carrera=" + carrera + ", cuatrimestre="
                + cuatrimestre + ", correo=" + correo + "]";
    }
    
    public void solicitarPrestamo(MaterialBibliografico material) {
        if (material.sePuedePrestar()) {
            material.setDisponible(false);
            System.out.println("Préstamo solicitado exitosamente.");
        } else {
            System.out.println("El material no está disponible para préstamo.");
        }
    }
}
