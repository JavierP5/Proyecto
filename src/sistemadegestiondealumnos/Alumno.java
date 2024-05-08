
package sistemadegestiondealumnos;

public class Alumno {
    // Declaramos los atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String NumeroDeEstudiante;
    
    //putin
    
    // Constructor
    public Alumno(String nombre, String apellidos, int edad, String NumeroDeEstudiante){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.NumeroDeEstudiante=NumeroDeEstudiante;
    }
    
    public Alumno(){
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroDeEstudiante() {
        return NumeroDeEstudiante;
    }

    public void setNumeroDeEstudiante(String NumeroDeEstudiante) {
        this.NumeroDeEstudiante = NumeroDeEstudiante;
    }
    public void inscribirseACurso(Curso curso){
        
    }
    public void pagarMensualidad(){
        
    }
    
    
    
    
    
    
    
    
}
