package vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VentanaBajaPersonas extends JFrame{
    private JPanel pPrincipal;
    private JTextField tfDni;
    private JButton bAceptar;
    private JButton bSalir;
    public VentanaBajaPersonas() {
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
}
