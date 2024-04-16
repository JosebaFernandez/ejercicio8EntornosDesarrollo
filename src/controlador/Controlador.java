package controlador;

import vista.*;

import javax.naming.ldap.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private ControladorUsuario cu;
    private ControladorInmueble ci;
    private VentanaPrincipal vp;


    public Controlador(){
        // Creacion de Controladores y Ventanas
        cu = new ControladorUsuario(this);
        ci = new ControladorInmueble(this);
        vp = new VentanaPrincipal();





    }

    public void usoVentanaPrincipal() {
        vp.addMiAltaIAl(new alAInmuebles());
        vp.addMiAltaPAl(new alAPersonas());
        vp.addMiBajaIAl(new alBInmuebles());
        vp.addMiBajaPAl(new alBPersonas());
        vp.addMiModificacionIAl(new alMInmuebles());
        vp.addMiModificacionPAl(new alMPersonas());

        vp.setVisible(true);
    }

    public class alAInmuebles implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class alAPersonas implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class alBInmuebles implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


    public class alBPersonas implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class alMInmuebles implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class alMPersonas implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
