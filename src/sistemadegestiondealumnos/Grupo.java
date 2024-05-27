
package sistemadegestiondealumnos;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupo implements Serializable {
    private Long id;
    private int capacidad;
    private int numeroGrupo;
    private ArrayList<Alumno> alumnosInscritos;

    public Grupo(int capacidad, int numeroGrupo) {
        this.capacidad = capacidad;
        this.numeroGrupo = numeroGrupo;
        this.alumnosInscritos = new ArrayList<>();
    }
     // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public ArrayList<Alumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(ArrayList<Alumno> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }
     public void eliminarAlumno(Alumno alumno) {
        alumnosInscritos.remove(alumno);
    }
         public void inscribirAlumno(Alumno alumno) {
        alumnosInscritos.add(alumno);
    }
     
}   