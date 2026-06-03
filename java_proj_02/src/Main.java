import model.*;
import service.InventarioService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventarioService inventario = new InventarioService();

        int opcion;

        do {

            String nombre = "";
            String codigo = "";
            double precio = 0.0;
            int stock = 0;
            String plataforma = "";
            String genero = "";
            String clasificacion = "";
            double alturaCm = 0.0;
            String material = "";
            boolean edicionLimitada = false;
            String rareza = "";
            String tipoCarta = "";
            int cantidadPaquete = 0;

            System.out.println("\n===== PIXEL KINGDOM STORE =====");
            System.out.println("1. Agregar videojuego");
            System.out.println("2. Agregar figura");
            System.out.println("3. Agregar tarjeta");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Nombre:");
                    nombre = sc.nextLine();

                    System.out.println("Código:");
                    codigo = sc.nextLine();

                    System.out.println("Precio:");
                    precio = sc.nextDouble();

                    System.out.println("Stock:");
                    stock = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Plataforma:");
                    plataforma = sc.nextLine();

                    System.out.println("Género:");
                    genero = sc.nextLine();

                    System.out.println("Clasificación:");
                    clasificacion = sc.nextLine();

                    Videojuego v = new Videojuego(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            plataforma,
                            genero,
                            clasificacion
                    );

                    inventario.agregarProducto(v);

                    break;

                case 2:

                    System.out.println("Nombre:");
                    nombre = sc.nextLine();

                    System.out.println("Código:");
                    codigo = sc.nextLine();

                    System.out.println("Precio:");
                    precio = sc.nextDouble();

                    System.out.println("Stock:");
                    stock = sc.nextInt();

                    System.out.println("Altura (cm):");
                    alturaCm = sc.nextDouble();
                    sc.nextLine();
                    
                    System.out.println("Material:");
                    material = sc.nextLine();

                    System.out.println("Edición limitada (true/false):");
                    edicionLimitada = sc.nextBoolean();
                    sc.nextLine();

                    FiguraColeccion f = new FiguraColeccion(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            alturaCm,
                            material,
                            edicionLimitada
                    );

                    inventario.agregarProducto(f);

                    break;

                case 3:

                    System.out.println("Nombre:");
                    nombre = sc.nextLine();

                    System.out.println("Código:");
                    codigo = sc.nextLine();

                    System.out.println("Precio:");
                    precio = sc.nextDouble();

                    System.out.println("Stock:");
                    stock = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Rareza:");
                    rareza = sc.nextLine();

                    System.out.println("Tipo:");
                    tipoCarta = sc.nextLine();

                    System.out.println("Cantidad paquete:");
                    cantidadPaquete = sc.nextInt();
                    sc.nextLine();

                    TarjetaColeccion t = new TarjetaColeccion(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            rareza,
                            tipoCarta,
                            cantidadPaquete
                    );

                    inventario.agregarProducto(t);

                    break;

                case 4:

                    inventario.mostrarInventario();
                    break;

            }

        } while (opcion != 5);

        System.out.println("Sistema finalizado.");
    }
}