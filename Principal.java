package vista;
import modelo.Modelo;
import controlador.Controlador;
public class Principal {
  
    public static void main(String[] args) {
      Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
    }
    
}
