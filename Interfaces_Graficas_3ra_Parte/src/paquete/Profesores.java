package paquete;

import java.util.ArrayList;

public class Profesores extends Persona{
    private String CUIL;
    private ArrayList<Asignaturas> asignaturasDadas = new ArrayList<Asignaturas>();

    public Profesores(String nombre, String dni, String CUIL, ArrayList<Asignaturas> asignaturasDadas) {
        super(nombre, dni);
        this.CUIL = CUIL;
        this.asignaturasDadas = asignaturasDadas;
    }

    public String getCUIL() {
        return CUIL;
    }
    
    public ArrayList<Asignaturas> getAsignaturasDadas() {
        return asignaturasDadas;
    }

    @Override
    public String toString() {
        return "Profesor: " + getNombre() + " - CUIL: " + CUIL + " - DNI: " + getDni();
    }
}
