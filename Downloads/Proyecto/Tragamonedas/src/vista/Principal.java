package vista;

import controlador.Controlador;
import modelo.Modelo;

/**
 * Ventana Inicial del tragamonedas
 *
 * @author Angelo
 */
public class Principal extends Thread {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        VistaInicio inicio = new VistaInicio();
        VistaTragamonedas juego = new VistaTragamonedas();
        Controlador controlador = new Controlador(modelo, inicio, juego);
        juego.setVisible(false);
        inicio.setVisible(true);
    }
}