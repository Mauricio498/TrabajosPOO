package model;

public class Persona {
    private String nombre;
    private double peso;
    private double altura;
    private double imc;
    private String estatus;

    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String nombre, double peso, double altura){
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularImc(){
        this.imc = this.peso / (this.altura * this.altura);
    }

    public void defineEstatus(){
        calcularImc();
        if (this.imc < 18.5){
            this.estatus = "Bajo Peso";
        } else if (this.imc < 25){
            this.estatus = "Peso Normal";
        } else if (this.imc < 30){
            this.estatus = "Sobrepeso";
        } else {
            this.estatus = "Obesidad";
        }
    }

    public String getNombre() {
        return nombre;
    }
    public double getImc() {
        return imc;
    }
    public String getEstatus() {
        return estatus;
    }
    @Override
    public String toString() {
        return "Nombre=" + nombre + "\nPeso=" + peso + "\nAltura=" + altura + "\nIMC=" + String.format("%.2f", imc) + "\nEstatus=" + estatus;
    }
    
}
