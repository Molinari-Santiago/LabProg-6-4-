package paquete;
import java.util.ArrayList;

public class Curso {
    private String nombre; 
    private ArrayList<Asignaturas> asignaturas = new ArrayList<Asignaturas>();
     
     public Curso(String nombre, ArrayList<Asignaturas> asignaturas) {
         this.nombre = nombre;
         this.asignaturas = asignaturas;
     }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        return nombre + " - Asignaturas: " + asignaturas.size();
    }
	}


