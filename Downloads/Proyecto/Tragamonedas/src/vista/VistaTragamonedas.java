package vista;
import modelo.Modelo;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Angelo
 */
public class VistaTragamonedas extends JFrame {

    public Modelo modelo;

    /**
     * Creates new form Tragamonedas
     */
    public VistaTragamonedas() {
        ImageIcon icono = new ImageIcon("C:\\Users\\Angelo\\Documents\\ProyectosNB\\Tragamonedas\\src\\Imagenes\\ico.png");
        setIconImage(icono.getImage());
        setSize(500,600);
        setTitle("7777");
        setLayout(null); 
        setVisible(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelruleta = new javax.swing.JPanel();
        etcasino = new javax.swing.JLabel();
        btngirar = new javax.swing.JButton();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        fondoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelruleta.setBackground(new java.awt.Color(0, 0, 0));
        panelruleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etcasino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etcasino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casino.jpeg"))); // NOI18N
        panelruleta.add(etcasino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 325, -1));

        btngirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/start.jpeg"))); // NOI18N
        panelruleta.add(btngirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 140, 52));

        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Figuras/campana.jpeg"))); // NOI18N
        panelruleta.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, 80));

        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Figuras/campana.jpeg"))); // NOI18N
        panelruleta.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 90, 70));

        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Figuras/campana.jpeg"))); // NOI18N
        panelruleta.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 80, 70));

        fondoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrete.jpeg"))); // NOI18N
        panelruleta.add(fondoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 390, 170));

        getContentPane().add(panelruleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel C1;
    public static javax.swing.JLabel C2;
    public static javax.swing.JLabel C3;
    public javax.swing.JButton btngirar;
    private javax.swing.JLabel etcasino;
    private javax.swing.JLabel fondoc;
    private javax.swing.JPanel panelruleta;
    // End of variables declaration//GEN-END:variables
}