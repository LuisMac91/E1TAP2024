package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
    protected Modelo modelo;
    protected Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread hilojuego = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        manejarIntento();
                    }
                });
                hilojuego.setPriority(Thread.MIN_PRIORITY);
                hilojuego.start();
            }
        });
    }

    private void manejarIntento() {
        synchronized (modelo) { 
            System.out.println("Hilo durmiendo...Zzz");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hilo despierto.");
        }

        String entrada = vista.obtenerEntradaUsuario();
        try {
            int numero = Integer.parseInt(entrada);
            if (modelo.verificarNumero(numero)) {
                mostrarMensaje("¡Felicidades! ¡Has adivinado el numero!😊");
                modelo.reiniciarJuego();
            } else {
                mostrarMensaje("Upps numero incorrecto! Intenta de nuevo.");
                int intentosRestantes = modelo.decrementarIntentos();
                mostrarIntentosRestantes(intentosRestantes); 
                if (intentosRestantes == 0) {
                    mostrarMensaje("¡Se acabaron los intentos! El numero era " + modelo.getNumeroSecreto());
                    modelo.reiniciarJuego();
                }
            }
        } catch (NumberFormatException ex) {
            mostrarMensaje("Por favor, introduce un numero valido.");
        }
        limpiarCampo();
    }

    private void mostrarMensaje(final String mensaje) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vista.mostrarMensaje(mensaje);
            }
        });
    }

    private void limpiarCampo() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vista.limpiarCampo();
            }
        });
    }
    private void mostrarIntentosRestantes(final int intentosRestantes) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vista.mostrarIntentosRestantes(intentosRestantes);
            }
        });
    }
}
