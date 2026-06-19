package view;
import model.Persona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class FormularioPersona extends JFrame {
    private JTextField txtNombre, txtPeso, txtAltura;
    private JButton btnCalcular;
    
    //Constructor de la clase FormularioPersona
    public FormularioPersona() {
        //Configuración de la ventana
        setTitle("Datos de la persona para IMC");//Título de la ventana
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cuando se cierre la ventana cierra la aplicación
        setLocationRelativeTo(null);//Centrar la ventana en la pantalla
        setResizable(false);//No permitir redimensionar la ventana

        //Definir tipo diseño BorderLayout
        setLayout(new BorderLayout(10,10));
        //Se agrega un panel para los componentes del Formulario
        JPanel panelCaptura = new JPanel(new GridLayout(4,2,5,5));
        panelCaptura.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelCaptura.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCaptura.add(txtNombre);

        panelCaptura.add(new JLabel("Peso:"));
        txtPeso = new JTextField();
        panelCaptura.add(txtPeso);

        panelCaptura.add(new JLabel("Altura:"));
        txtAltura = new JTextField();
        panelCaptura.add(txtAltura);

        btnCalcular = new JButton("Calcular IMC");

        panelCaptura.add(new Label(""));
        panelCaptura.add(btnCalcular);

        add(panelCaptura, BorderLayout.NORTH);

        btnCalcular.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    if (txtNombre.getText().trim().isEmpty() || txtPeso.getText().trim().isEmpty() || txtAltura.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }else {
                        try {
                            String nombre = txtNombre.getText();
                            double peso = Double.parseDouble(txtPeso.getText());
                            double altura = Double.parseDouble(txtAltura.getText());

                            Persona persona = new Persona(nombre, peso, altura);
                            persona.defineEstatus();

                            JOptionPane.showMessageDialog(null, persona.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Peso y Altura deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormularioPersona().setVisible(true);
        });
    }

}