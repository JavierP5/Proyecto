 
package sistemadegestiondealumnos;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {
    private Long id;
    private String nombre;
    private String codigo;
    private String nivel;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Alumno> alumnosInscritos;

    public Curso(String nombre, String codigo, String nivel) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nivel = nivel;
        this.asignaturas = new ArrayList<>();
        this.alumnosInscritos = new ArrayList<>();
    }
    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void inscribirAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }

    public void asignarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }


}