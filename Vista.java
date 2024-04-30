package vista;

/**
 *
 * @author Angelo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vista {
    private JFrame ventana;
    private JTextField campoTexto;
    public JButton boton;
    private JLabel resultadoLabel;
    private JLabel intentosLabel;
    private int intentosRestantes;

    public Vista() {
        ventana = new JFrame("Adivina el número");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 250);
        ventana.setLayout(new BorderLayout());

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel panelEntrada = new JPanel(new GridLayout(2, 1, 0, 10));
        JLabel labelInstruccion = new JLabel("Adivina el número entre 1 y 100:");
        panelEntrada.add(labelInstruccion);

        campoTexto = new JTextField();
        campoTexto.setHorizontalAlignment(JTextField.CENTER);
        panelEntrada.add(campoTexto);

        panelPrincipal.add(panelEntrada, BorderLayout.NORTH);

        JPanel panelBoton = new JPanel();
        boton = new JButton("Adivinar");
        panelBoton.add(boton);
        panelPrincipal.add(panelBoton, BorderLayout.CENTER);

        JPanel panelResultados = new JPanel(new GridLayout(2, 1, 0, 10));
        resultadoLabel = new JLabel("", SwingConstants.CENTER);
        panelResultados.add(resultadoLabel);

        intentosRestantes = 10; // Puedes ajustar la cantidad de intentos
        intentosLabel = new JLabel("Intentos restantes: " + intentosRestantes, SwingConstants.CENTER);
        panelResultados.add(intentosLabel);

        panelPrincipal.add(panelResultados, BorderLayout.SOUTH);

        ventana.add(panelPrincipal, BorderLayout.CENTER);
        ventana.setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje);
    }

    public String obtenerEntradaUsuario() {
        return campoTexto.getText();
    }

    public void limpiarCampo() {
        campoTexto.setText("");
    }


    public void habilitarBoton() {
        boton.setEnabled(true);
    }

    public void mostrarResultado(String mensaje) {
        resultadoLabel.setText(mensaje);
    }

    public void actualizarIntentosRestantes() {
        intentosRestantes--;
        intentosLabel.setText("Intentos restantes: " + intentosRestantes);
    }
       public void mostrarIntentosRestantes(int intentosRestantes) {
        intentosLabel.setText("Intentos restantes: " + intentosRestantes);
    }
}