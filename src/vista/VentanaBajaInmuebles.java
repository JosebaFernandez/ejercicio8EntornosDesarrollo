package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class VentanaBajaInmuebles extends JFrame{
    private JPanel panel1;
    private JComboBox cbDatos;
    private JButton bBorrar;
    private JButton bSalir;

    public VentanaBajaInmuebles() {
        setContentPane(panel1);
        setSize(400,400);
        setLocationRelativeTo(null);
    }

    public void addBorrarListener(MouseListener ml) {
        bBorrar.addMouseListener(ml);
    }

    public void addSalirListener(MouseListener ml) {
        bSalir.addMouseListener(ml);
    }

    public JComboBox getCbDatos() {
        return cbDatos;
    }
}
