 
package sistemadegestiondealumnos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Asignatura implements Serializable {
    private Long id;
    private String nombre;
    private String codigo;
    private int creditos;
    private Profesor profesor;
    private Map<Alumno, Integer> calificaciones;

    public Asignatura(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificaciones = new HashMap<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void registrarCalificacion(Alumno alumno, int calificacion) {
        calificaciones.put(alumno, calificacion);
    }

    public int obtenerCalificacion(Alumno alumno) {
        return calificaciones.getOrDefault(alumno, -1);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Map<Alumno, Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<Alumno, Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    void registrarCalificaciones(Alumno alumno1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

