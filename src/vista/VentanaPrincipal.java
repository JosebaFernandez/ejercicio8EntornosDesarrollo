package vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel pPrincipal;
    private JMenu mPropietario;
    private JMenu mInmueble;
    private JButton bSalir;
    private JMenuItem miAltaI;
    private JMenuItem miBajaI;
    private JMenuItem miModificacionI;
    private JMenuItem miAlquilar;
    private JMenuItem miComprar;
    private JMenuItem miAltaP;
    private JMenuItem miBajaP;
    private JMenuItem miModificacionP;

    public VentanaPrincipal() {
        setContentPane(pPrincipal);
        setSize(500,500);
        setLocationRelativeTo(null);
    }
    public void addBSalirAl(ActionListener al)
    {
        bSalir.addActionListener(al);
    }
    public void addMiAltaPAl(ActionListener al)
    {
        miAltaP.addActionListener(al);
    }
    public void addMiBajaPAl(ActionListener al)
    {
        miBajaP.addActionListener(al);
    }
    public void addMiModificacionPAl(ActionListener al)
    {
        miModificacionP.addActionListener(al);
    }
    public void addMiAltaIAl(ActionListener al)
    {
        miAltaI.addActionListener(al);
    }
    public void addMiBajaIAl(ActionListener al)
    {
        miBajaI.addActionListener(al);
    }
    public void addMiModificacionIAl(ActionListener al)
    {
        miModificacionI.addActionListener(al);
    }
}
