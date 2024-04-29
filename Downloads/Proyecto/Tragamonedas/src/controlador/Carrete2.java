package controlador;
import vista.VistaTragamonedas;
import javax.swing.ImageIcon;
import modelo.Modelo;

public class Carrete2 extends Thread {

    private int tiempo;
    private Modelo modelo;
    private volatile boolean running = true;

    public Carrete2(int tiempo, Modelo modelo) {
        this.tiempo = tiempo;
        this.modelo = modelo;
    }

    public void stopCarrete() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            if (!modelo.estaEnJuego()) {

                modelo.detenerGiro();
                break;
            }

            // Generar número aleatorio entre 1 y 7
            int numero = (int) (Math.random() * 7 + 1);
            String figura = "C:\\Users\\Angelo\\Documents\\ProyectosNB\\Tragamonedas\\src\\Figuras\\" + numero + ".jpeg";

            ImageIcon f;

            synchronized (VistaTragamonedas.C2) {
                f = new ImageIcon(figura);
                VistaTragamonedas.C2.setIcon(f); 
            }

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
