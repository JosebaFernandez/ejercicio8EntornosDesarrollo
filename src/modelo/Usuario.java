package modelo;

import java.util.ArrayList;

public class Usuario {
    private String dni;
    private String nombre;
    private ArrayList<Inmueble> inmuebles;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        inmuebles = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addInmueble(Inmueble i) {
        inmuebles.add(i);
    }
}
