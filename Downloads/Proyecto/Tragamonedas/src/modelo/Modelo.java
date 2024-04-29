package modelo;
public class Modelo {
    protected boolean juegoActivo;
    protected boolean carretesGirando; 

    public Modelo() {
        this.juegoActivo = false; 
        this.carretesGirando = false; 
    }

    public synchronized void iniciarJuego() {
        this.juegoActivo = true; 
        this.carretesGirando = true; 
        notifyAll(); 
    }

    public synchronized void detenerJuego() {
        this.juegoActivo = false; 
        this.carretesGirando = false; 
    }

    public synchronized boolean estaEnJuego() {
        return juegoActivo; 
    }

    public synchronized boolean estanCarretesGirando() {
        return carretesGirando; 
    }

    public synchronized void esperarGiro() throws InterruptedException {
        if (!carretesGirando) {
            wait(); 
        }
    }

    public synchronized void detenerGiro() {
        this.carretesGirando = false; 
    }

    public synchronized void reiniciarGiro() {
        this.carretesGirando = true;
        notifyAll(); 
    }
}
