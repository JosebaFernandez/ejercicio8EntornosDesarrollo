package controlador;

import modelo.Usuario;
import vista.VentanaAltaPersonas;
import vista.VentanaBajaPersonas;
import vista.VentanaModificarPersonas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControladorUsuario {
    private Map<String,Usuario> usuarios;
    private VentanaAltaPersonas vap;
    private VentanaBajaPersonas vbp;
    private VentanaModificarPersonas vmp;

    public ControladorUsuario(Controlador cont){
        vap = new VentanaAltaPersonas();
        vap.addBAceptarAl(new BAceptarAAl());
        vap.addBSalirAl(new BSalirAAl());
        vbp = new VentanaBajaPersonas();
        vbp.addBAceptarAl(new BAceptarBAl());
        vbp.addBSalirAl(new BSalirBAl());
        vmp = new VentanaModificarPersonas();
        vmp.addBAceptarAl(new BAceptarMAl());
        vmp.addBSalirAl(new BSalirMAl());
        usuarios = new HashMap<>();

    }
    public class BAceptarAAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!vap.getTfDni().getText().isEmpty() && !vap.getTfNombre().getText().isEmpty()){
                usuarios.put(vap.getTfDni().getText(),new Usuario(vap.getTfDni().getText(),vap.getTfNombre().getText()));
            }
        }
    }
    public class BAceptarBAl implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!vbp.getTfDni().getText().isEmpty()) {
                usuarios.remove(vbp.getTfDni().getText());
            }
        }
    }
    public class BAceptarMAl implements ActionListener S{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!vmp.getTfNombre().getText().isEmpty() && !vmp.getTfDni().getText().isEmpty()) {
                vmp.getTfNombre().setText("");
                vmp.getTfDni().setText("");
                JOptionPane.showMessageDialog(null,"Usuario modificado con écito.");
            }
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
