package service;

import model.*;

import java.util.ArrayList;

public class BibliotecaService {
    private ArrayList<MaterialBibliografico> materiales;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Alumno> alumnos;

    public BibliotecaService() {
        this.materiales = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void registrarAlumno(Alumno alumno) {

        alumnos.add(alumno);

    }
    
    public void realizarPrestamo(Prestamo prestamo) {

        prestamo.registrarPrestamo();
        prestamos.add(prestamo);

    }

     public void agregarMaterial(MaterialBibliografico material) {

        materiales.add(material);
        
    }

    public void mostrarMateriales() {

        for (MaterialBibliografico material : materiales) {
           //En esta sección se comprueba el Polimorfismo
           // instanceof compara que tipo de instancia es el objeto
           if (material instanceof Libro) 
                System.out.println((Libro)material); // Casting de un objeto
           else if(material instanceof Revista)
                System.out.println((Revista)material);
           else
                System.out.println((Tesis)material);

            System.out.println("------------------");
        }
    }

    public void mostrarPrestamos() {

        System.out.println("\n===== PRÉSTAMOS REGISTRADOS =====");

        for (Prestamo p : prestamos) {

            p.toString();

            System.out.println("----------------------");

        }

    }

    public void mostrarAlumnos() {

        System.out.println("\n===== ALUMNOS REGISTRADOS =====");

        for (Alumno a : alumnos) {

            a.toString();

            System.out.println("----------------------");

        }

    }

    public void devolverMaterial(Prestamo prestamo) {

        prestamo.registrarDevolucion();

    }
    
    public ArrayList<MaterialBibliografico> getMateriales() {
        return materiales;
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}
