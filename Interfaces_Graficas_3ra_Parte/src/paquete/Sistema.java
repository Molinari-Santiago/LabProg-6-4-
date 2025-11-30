package paquete;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Persona> Registro = new ArrayList<Persona>();
    
    public void CrearCurso(String nombre, ArrayList<Asignaturas> asignaturas) {
        Curso c = new Curso(nombre, asignaturas);
        cursos.add(c);
    }
    
    public void EliminarCurso(Curso c) {
        cursos.remove(c);
    }
    
    public Iterator<Curso> getcursos() {
        return this.cursos.iterator();
    }
    
    public void CrearAsignatura(Curso c, String nombre) {
        Asignaturas a = new Asignaturas(nombre);
        c.getAsignaturas().add(a);
    }
    
    public void EliminarAsignatura(Curso c, Asignaturas a) {
        c.getAsignaturas().remove(a);
    }
    
    public String getAsignaturas(Curso c) {
        return c.toString();
    }
    
    public void AgregarAlumno(Estudiantes e) {
        Registro.add(e);
    }
    
    public void AgregarProfesor(Profesores p) {
        Registro.add(p);
    }
    
    public void EliminarAlumno(Estudiantes e) {
        Registro.remove(e);
    }
    
    public void EliminarProfesor(Profesores p) {
        Registro.remove(p);
    }
    
    public String MostrarProfesores(Profesores p) {
        return p.toString();
    }
    
    public String MostrarAlumnos(Estudiantes e) {
        return e.toString();
    }
    
    public Iterator<Estudiantes> getEstudiantes() {
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        for (Persona persona : Registro) {
            if (persona instanceof Estudiantes) {
                estudiantes.add((Estudiantes) persona);
            }
        }
        return estudiantes.iterator();
    }
    
    public Iterator<Profesores> getProfesores() {
        ArrayList<Profesores> profesores = new ArrayList<>();
        for (Persona persona : Registro) {
            if (persona instanceof Profesores) {
                profesores.add((Profesores) persona);
            }
        }
        return profesores.iterator();
    }
    
    public Iterator<Persona> getTodasLasPersonas() {
        return Registro.iterator();
    }
}
