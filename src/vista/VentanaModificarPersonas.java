package vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

public class VentanaModificarPersonas extends JFrame{
    private JPanel pPrincipal;
    private JTextField tfDni;
    private JTextField tfNombre;
    private JButton bAceptar;
    private JButton bSalir;
    public VentanaModificarPersonas() {
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
    }

    public JTextField getTfDni() {
        return tfDni;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public void addBSalirAl(ActionListener al)
    {
        bSalir.addActionListener(al);
    }
    public void addBAceptarAl(ActionListener al)
    {
        bAceptar.addActionListener(al);
    }
}
