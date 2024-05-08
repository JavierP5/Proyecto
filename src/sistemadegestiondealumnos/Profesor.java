
package sistemadegestiondealumnos;

public class Profesor {
    // Declaramos los atributos
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
    
    
    
    
    
}
