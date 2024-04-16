package vista;

import javax.swing.*;
import java.awt.event.MouseListener;

public class VentanaAltaInmuebles extends JFrame{
    private JPanel panel1;
    private JTextField tfLocalidad;
    private JTextField tfCalle;
    private JTextField tfHabitaciones;
    private JButton bAceptar;
    private JButton bSalir;

    public VentanaAltaInmuebles() {
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

    public JTextField getTfLocalidad() {
        return tfLocalidad;
    }

    public JTextField getTfCalle() {
        return tfCalle;
    }

    public JTextField getTfHabitaciones() {
        return tfHabitaciones;
    }
}
