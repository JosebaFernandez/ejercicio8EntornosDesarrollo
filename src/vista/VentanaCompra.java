package vista;

import javax.swing.*;
import java.awt.event.MouseListener;

public class VentanaCompra extends JFrame{
    private JPanel panel1;
    private JComboBox cbInmuebles;
    private JComboBox cbCompraAlquiler;
    private JButton bAceptar;
    private JButton bSalir;

    public VentanaCompra() {
        setContentPane(panel1);
        setSize(400,400);
        setLocationRelativeTo(null);
    }

    public void addAceptarListener(MouseListener ml) {
        bAceptar.addMouseListener(ml);
    }
    public void addSalirListener(MouseListener ml) {
        bSalir.addMouseListener(ml);
    }

    public JComboBox getCbInmuebles() {
        return cbInmuebles;
    }

    public JComboBox getCbCompraAlquiler() {
        return cbCompraAlquiler;
    }
}
