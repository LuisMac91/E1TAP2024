package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VistaInicio;
import vista.VistaTragamonedas;
import modelo.Modelo;

public class Controlador implements ActionListener {
    private final Modelo modelo;
    private final VistaInicio vistaInicio;
    private VistaTragamonedas juego;
    private final Carrete1 carrete1;
    private final Carrete2 carrete2;
    private final Carrete3 carrete3;

    public Controlador(Modelo modelo, VistaInicio vistaInicio, VistaTragamonedas juego) {
        this.modelo = modelo;
        this.vistaInicio = vistaInicio;
        this.juego = juego;
        this.vistaInicio.itemsalir.addActionListener(this);
        this.vistaInicio.botonplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            abrirVentanaTragamonedas();
            }
        });

        this.carrete1 = new Carrete1(30, modelo);
        this.carrete2 = new Carrete2(30, modelo);
        this.carrete3 = new Carrete3(30, modelo);

        this.juego.btngirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                girarCarretes();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaInicio.itemsalir) {
            salir();
        }
    }

    public void abrirVentanaTragamonedas() {
        if (juego == null) {
        juego = new VistaTragamonedas();
        }
        juego.setVisible(true);
    }

    public void girarCarretes() {
        if (!carrete1.isAlive()) {
            carrete1.start();
        }
        if (!carrete2.isAlive()) {
            carrete2.start();
        }
        if (!carrete3.isAlive()) {
            carrete3.start();
        }
    }
    public void salir() {
        JOptionPane.showMessageDialog(vistaInicio, "Hasta luego!", "Saliendo...", JOptionPane.INFORMATION_MESSAGE);
        vistaInicio.dispose();
        System.exit(0);
    }
}