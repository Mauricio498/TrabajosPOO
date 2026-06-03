import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejemplo de instancia de objtos
        Persona p01 = new Persona("Juan", 17);
        //Cómo ingreso un dato pero del teclado usan la clase Scanner
        Scanner lector=new Scanner(System.in); //Preparando para leer de teclado

        System.out.println("¿Cuanto pesa la persona?");
        
        p01.setPeso(lector.nextDouble()); //Uso del método Set

        p01.setEstatura(1.70);
        p01.calcularImc();
        //Le puedo cambiar el nombre Juan
        //p01.nombre("Miguel"); //Principio de ENCAPSULAMIENTO
        System.out.println("Nombre:"+p01.getNombre());
        System.out.println("Edad:"+p01.getEdad());
        System.out.println("Peso:"+p01.getPeso());
        System.out.println("Eestatura:"+p01.getEstatura());
        System.out.println("IMC:"+p01.getImc());
       
      


    }
}
