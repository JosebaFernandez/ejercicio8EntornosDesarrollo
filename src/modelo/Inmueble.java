package modelo;

public class Inmueble {

    private String localidad;
    private String calle;
    private String habitaciones;
    private Usuario popietario;

    public Inmueble(String localidad, String calle, String habitaciones) {
        this.localidad = localidad;
        this.calle = calle;
        this.habitaciones = habitaciones;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCalle() {
        return calle;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setPopietario(Usuario popietario) {
        this.popietario = popietario;
    }
}
