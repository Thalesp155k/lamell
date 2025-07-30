
package lamell;

import lamelltelas.TelaPrincipal;


public class Lamell {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
    
}
