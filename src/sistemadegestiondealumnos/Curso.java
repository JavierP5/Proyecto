
package sistemadegestiondealumnos;

public class Curso {
    // Declaramos los atributos
    private String nombre;
    private String codigo;
    private String nivel;
    
    // Constructor
    public Curso(String nombre, String codigo, String nivel){
        this.nombre=nombre;
        this.codigo=codigo;
        this.nivel=nivel;
    }
    
    public Curso(){
        
    }
 
    // Getters y setters
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
    public void agregarAsignatura(Asignatura asignatura){
        
    }
    public void inscribirAlumno(Alumno alumno){
        
    }
    
}
