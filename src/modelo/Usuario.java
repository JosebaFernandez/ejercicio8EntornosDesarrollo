package modelo;

import java.util.ArrayList;

public class Usuario {
    private String dni;
    private String nombre;

    public Usuario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
