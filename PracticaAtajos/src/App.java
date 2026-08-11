import java.util.ArrayList;
import java.util.List;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("ABC-123", "Ferrari", 140)); // Excede (140 > 120) -> Correcto
        vehiculos.add(new Moto("XYZ-987", "Yamaha", 95)); // No excede (95 < 110) -> Correcto
        vehiculos.add(new Camion("MNO-555", "Volvo", 70));// Va lento (70), ¡pero el sistema dirá que tiene exceso!
        System.out.println("=== REVISIÓN DE RADAR DE VELOCIDAD ===");
        for (Vehiculo v : vehiculos) {
        // El polimorfismo ejecutará el método correspondiente a cada clase hija
            if (v.comprobarExcesoVelocidad()) {
            System.out.println(" ALERTA: " + v.getClass().getSimpleName() + " [" + v.getPatente() + "] excede el límite. Vel: " + v.getVelocidadActual() + " km/h");
            } else {
            System.out.println("✅ OK: " + v.getClass().getSimpleName() + " [" + v.getPatente() + "] velocidad bajo control.");
            }
        }
    }
}
