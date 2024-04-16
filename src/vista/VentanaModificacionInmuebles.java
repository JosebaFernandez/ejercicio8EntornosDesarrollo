package vista;

import javax.swing.*;
import java.awt.event.MouseListener;

public class VentanaModificacionInmuebles extends JFrame{
    private JPanel panel1;
    private JComboBox cbInmuebles;
    private JTextField tfDato;
    private JButton bModificar;
    private JButton bSalir;

    public VentanaModificacionInmuebles() {
        setContentPane(panel1);
        setSize(400,400);
        setLocationRelativeTo(null);
    }

    public void addSalirListener(MouseListener ml) {
        bSalir.addMouseListener(ml);
    }
    public void addModificarrListener(MouseListener ml) {
        bSalir.addMouseListener(ml);
    }
}
