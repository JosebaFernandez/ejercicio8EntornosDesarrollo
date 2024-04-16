package vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VentanaAltaPersonas extends JFrame{
    private JPanel pPrincipal;
    private JTextField tfDni;
    private JTextField tfNombre;
    private JButton bAceptar;
    private JButton bSalir;

    public VentanaAltaPersonas() {
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
    }
    public void addBSalirAl(ActionListener al)
    {
        bSalir.addActionListener(al);
    }
    public void addBAceptarAl(ActionListener al)
    {
        bAceptar.addActionListener(al);
    }

    public JTextField getTfDni() {
        return tfDni;
    }

    public void setTfDni(JTextField tfDni) {
        this.tfDni = tfDni;
    }

    public JTextField getTfNombre() {
        return tfNombre;
    }

    public void setTfNombre(JTextField tfNombre) {
        this.tfNombre = tfNombre;
    }
}
