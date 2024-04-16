package controlador;

import vista.VentanaPrincipal;

import javax.naming.ldap.Control;

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
}
