 
package sistemadegestiondealumnos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno implements Serializable {

    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroEstudiante;
    private ArrayList<Curso> cursosInscritos;

        private Map<Asignatura, Integer> calificaciones = new HashMap<>();
        
    public Alumno(String nombre, String apellido, int edad, int numeroEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
        this.cursosInscritos = new ArrayList<>();
    }

    public void inscribirCurso(Curso curso) {
        cursosInscritos.add(curso);
        curso.inscribirAlumno(this);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public ArrayList<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(ArrayList<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
    

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   public void registrarCalificacion(Asignatura asignatura, int calificacion) {
        asignatura.registrarCalificacion(this, calificacion);
    }
public Map<Asignatura, Integer> getCalificaciones() {
        Map<Asignatura, Integer> calificaciones = null;
        return calificaciones;

}
    
    
    
}   
    
    
    

