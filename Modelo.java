package modelo;
import java.util.Random;

public class Modelo {
    private int numeroSecreto;
    private boolean juegoTerminado;
    private int intentosRestantes;

    public Modelo() {
        reiniciarJuego();
    }

    public void reiniciarJuego() {
        Random rand = new Random();
        numeroSecreto = rand.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        juegoTerminado = false;
        intentosRestantes = 10; // Número de intentos permitidos
    }
    public boolean verificarNumero(int numero) {
    if (numero == numeroSecreto) {
        juegoTerminado = true;
        return true;
    } else {
        return false;
    }
}


    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }
     public int decrementarIntentos() {
        if (intentosRestantes > 0) {
            intentosRestantes--;
        }
        return intentosRestantes;
    }
}
