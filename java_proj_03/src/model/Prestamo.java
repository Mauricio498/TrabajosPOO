package model;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Alumno alumno;
    private MaterialBibliografico material;

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Alumno alumno, MaterialBibliografico material) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.material = material;
    }

    public void registrarPrestamo() {
        if (material.sePuedePrestar()) {
            material.setDisponible(false);
            System.out.println("Préstamo registrado exitosamente.");
        } else {
            System.out.println("El material no está disponible para préstamo.");
        }
    }

    public void registrarDevolucion() {
        material.setDisponible(true);
        System.out.println("Devolución registrada exitosamente.");
    }

    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", alumno="
                + alumno.toString() + ", material=" + material.toString() + "]";
    }

}
