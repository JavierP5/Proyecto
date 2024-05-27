
package sistemadegestiondealumnos;

import java.io.Serializable;

public class Profesor implements Serializable {
    // Declaramos los atributos
    private Long id;
    private String nombre;
    private String apellidos;
    private String especialidad;
    
    // Constructor
    public Profesor(String nombre, String apellidos, String especialidad){
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.especialidad=especialidad;
    }
    
    public Profesor(){
        
    }
       // Getters y setters
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void asignarCalificaciones(){
        
    }
    public void calcularSalario(){
        
    }
    public void asignarAsignatura(Asignatura asignatura){
        
    }

    String getApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    
    
    
    
    
}
