package controlador;

import modelo.Usuario;
import vista.VentanaAltaPersonas;
import vista.VentanaBajaPersonas;
import vista.VentanaModificarPersonas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ControladorUsuario {
    private Controlador cont;
    private Usuario usu;
    private VentanaAltaPersonas vap;
    private VentanaBajaPersonas vbp;
    private VentanaModificarPersonas vmp;

    public ControladorUsuario(Controlador cont){
        this.cont = cont;
        vap = new VentanaAltaPersonas();
        vap.addBAceptarAl(new BAceptarAAl());
        vap.addBSalirAl(new BSalirAAl());
        vbp = new VentanaBajaPersonas();
        vbp.addBAceptarAl(new BAceptarBAl());
        vbp.addBSalirAl(new BSalirBAl());
        vmp = new VentanaModificarPersonas();
        vmp.addBAceptarAl(new BAceptarMAl());
        vmp.addBSalirAl(new BSalirMAl());
        vmp.addTfDniFL(new TfDniMFl());

    }
    public class BAceptarAAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public class BAceptarBAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }
    public class BAceptarMAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    public class TfDniMFl implements FocusListener {
        
        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

        }
    }
    public class BSalirAAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Eliminar la ventana y seguir en la principal
            vap.dispose();
        }
    }
    public class BSalirBAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Eliminar la ventana y seguir en la principal
            vbp.dispose();
        }
    }
    public class BSalirMAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Eliminar la ventana y seguir en la principal
            vmp.dispose();
        }
    }


}
