package controlador;
import vista.VistaTragamonedas;
import javax.swing.ImageIcon;
import modelo.Modelo;

public class Carrete1 extends Thread {
    private ImageIcon figura;
    private int tiempo;
    private Modelo modelo;
    private volatile boolean running = true; 

    public Carrete1(int tiempo, Modelo modelo) {
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
            int numero = (int) (Math.random() * 7 + 1);
            String figura = "C:\\Users\\Angelo\\Documents\\ProyectosNB\\Tragamonedas\\src\\Figuras\\" + numero + ".jpeg";

            ImageIcon f;
            
            synchronized (VistaTragamonedas.C1) {
                f = new ImageIcon(figura);
                VistaTragamonedas.C1.setIcon(f); 
            }

            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
