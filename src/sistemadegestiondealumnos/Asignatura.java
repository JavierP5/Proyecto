
package sistemadegestiondealumnos;

public class Asignatura {
    // Declaramos los atributos
    private String nombre;
    private String codigo;
    private int creditos;
    
    // Constructor
    public Asignatura(String nombre, String codigo, int creditos){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
    }
    
    public Asignatura(){
        
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
