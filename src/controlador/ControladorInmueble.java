package controlador;

import modelo.Inmueble;
import vista.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorInmueble {
    private Controlador cont;
    private Inmueble inm;
    private VentanaAltaInmuebles vai;
    private VentanaBajaInmuebles vbi;
    private VentanaModificacionInmuebles vmi;


    public ControladorInmueble(Controlador cont){
        this.cont = cont;
    }

    public void altaInmuebles(){
        vbi = new VentanaBajaInmuebles();

        vai.addAceptarListener(new aceptarAltaMouseListener());
        vai.addSalirListener(new salirMouseListener());

        vbi.setVisible(true);
    }

    public void bajaInmuebles(){
        vmi = new VentanaModificacionInmuebles();

        vai.addAceptarListener(new aceptarMouseListener());
        vai.addSalirListener();

        vmi.setVisible(true);
    }

    public void modificacionInmuebles(){
        vai = new VentanaAltaInmuebles();

        vai.addAceptarListener(new aceptarMouseListener());
        vai.addSalirListener(new salirMouseListener());

        vai.setVisible(true);
    }

    public class aceptarAltaMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }