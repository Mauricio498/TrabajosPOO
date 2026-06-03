package service;

import model.MaterialBibliografico;
import model.Prestamo;
import model.Alumno;

import java.util.ArrayList;

public class BibliotecaService {
    private ArrayList<MaterialBibliografico> materiales = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void registrarAlumno(Alumno alumno) {

        alumnos.add(alumno);

    }
    
    public void realizarPrestamo(Prestamo prestamo) {

        prestamos.add(prestamo);

    }

     public void agregarMaterial(MaterialBibliografico material) {

        materiales.add(material);
        
    }

    public void mostrarInventario() {

        System.out.println("\n===== INVENTARIO DE MATERIALES BIBLIOGRÁFICOS =====");

        for (MaterialBibliografico m : materiales) {

            m.mostrarInfo();

            System.out.println("----------------------");

        }

    }

    public void mostrarPrestamos() {

        System.out.println("\n===== PRÉSTAMOS REGISTRADOS =====");

        for (Prestamo p : prestamos) {

            p.mostrarInfo();

            System.out.println("----------------------");

        }

    }

    public void mostrarAlumnos() {

        System.out.println("\n===== ALUMNOS REGISTRADOS =====");

        for (Alumno a : alumnos) {

            a.MostrarDatos();

            System.out.println("----------------------");

        }

    }

    public void devolverMaterial(Prestamo prestamo) {

        prestamo.registrarDevolucion();

    }

    public MaterialBibliografico buscarMaterial(String codigo) {

        for (MaterialBibliografico m : materiales) {

            if (m.codigo.equals(codigo)) {

                return m;

            }

        }

        return null;

    }
    
}
