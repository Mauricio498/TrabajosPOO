package view;
import model.Persona;

import javax.swing.JOptionPane;

public class Consola {
    public static void main(String[] args) {
        boolean errorEncontrado;
        double peso = 0;
        double altura = 0;
        String entrada = JOptionPane.showInputDialog("Escribe el nombre de la persona: ");
        String nombre = entrada.trim();
        Persona per = new Persona(nombre);
        do{
            try {
                entrada = JOptionPane.showInputDialog("Introduzca el peso de la persona: ");
                peso = Double.parseDouble(entrada);
                errorEncontrado = false;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,
                "Ha ocurrido un error: ",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                errorEncontrado = true;
            }
        } while (errorEncontrado);

        per.setPeso(peso);
        do{
            try {
                entrada = JOptionPane.showInputDialog("Introduzca la altura de la persona: ");
                altura = Double.parseDouble(entrada);
                errorEncontrado = false;
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,
                "Ha ocurrido un error: ",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                errorEncontrado = true;
            }
        } while (errorEncontrado);

        per.setAltura(altura);

        per.defineEstatus();

        System.out.println(per);//Hacer un JOptionPane para mostrar el resultado
        JOptionPane.showMessageDialog(null, per);
    }
}
