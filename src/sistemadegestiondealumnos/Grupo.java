
package sistemadegestiondealumnos;

public class Grupo {
    // Declaramos los atributos
    private int numeroGrupo;
    private int capacidad;
    
    // Constructor
    public Grupo(int numeroGrupo, int capacidad){
        this.numeroGrupo=numeroGrupo;
        this.capacidad=capacidad;
    }
    
    public Grupo(){
        
    }
    
    // Getters y setters
    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void agregarAlumno(Alumno alumno){
        
    }
    
    public void quitarAlumno(Alumno alumno){
        
    }
    
    
    
}
