public class Persona {
    //Propiedades o atributos
    private String nombre; 
    private int edad;
    private double peso;
    private double estatura;
    private double imc;

    //Método constructor, usando dos parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Los métodos set permiten especificar el valor de la propiedad
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    //Los métodos get permiten obtenr el valor que tiene la propiedad
    public double getPeso() {
        return peso;
    }

    //Este es un método concreto que tiene una funcionalidad determinada
    public void calcularImc(){
        //Método no retorna, solo calcula
        this.imc = this.peso/(this.estatura*this.estatura);
    }
    public double getImc() {
        return imc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    

    



    
}
