package paquete;

public class Estudiantes extends Persona{
    private String NLegajo;
    
    public Estudiantes(String nombre, String dni, String NLegajo) {
        super(nombre, dni);
        this.NLegajo = NLegajo;
    }

    public String getNLegajo() {
        return NLegajo;
    }

    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " - Legajo: " + NLegajo + " - DNI: " + getDni();
    }    
}
