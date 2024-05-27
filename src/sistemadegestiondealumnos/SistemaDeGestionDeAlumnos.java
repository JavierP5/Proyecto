
package sistemadegestiondealumnos;

public class SistemaDeGestionDeAlumnos {

    public static void main(String[] args) {
  // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Juan", "Perez", 20, 1001);
        Alumno alumno2 = new Alumno("Maria", "Gomez", 22, 1002);
        
        // Crear algunos profesores
        Profesor profesor1 = new Profesor("Pedro", "Lopez", "Matemáticas");
        Profesor profesor2 = new Profesor("Ana", "Martinez", "Historia");
        
        // Crear algunos cursos
        Curso curso1 = new Curso("Matemáticas Avanzadas", "MAT101", "Avanzado");
        Curso curso2 = new Curso("Historia del Mundo", "HIS201", "Intermedio");
        
        // Crear algunas asignaturas
        Asignatura asignatura1 = new Asignatura("Álgebra Lineal", "ALG101", 4);
        Asignatura asignatura2 = new Asignatura("Edad Media", "EDM202", 3);
        
        // Crear algunos grupos
        Grupo grupo1 = new Grupo(30, 1);
        Grupo grupo2 = new Grupo(25, 1);
        
        // Inscribir alumnos en cursos
        alumno1.inscribirCurso(curso1);
        alumno2.inscribirCurso(curso2);
        
        // Asignar profesores a asignaturas
        asignatura1.asignarProfesor(profesor1);
        asignatura2.asignarProfesor(profesor2);
        
        // Registrar calificaciones
        asignatura1.registrarCalificaciones(alumno1, 90);
        asignatura1.registrarCalificaciones(alumno2, 85);
        
        // Mostrar información de alumnos inscritos en un curso
        System.out.println("Alumnos inscritos en el curso " + curso1.getNombre() + ":");
        for (Alumno alumno : curso1.getAlumnosInscritos()) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
        
        // Mostrar información de profesores asignados a una asignatura
        System.out.println("Profesor asignado a la asignatura " + asignatura1.getNombre() + ":");
        Profesor profesorAsignatura1 = asignatura1.getProfesor();
        System.out.println(profesorAsignatura1.getNombre() + " " + profesorAsignatura1.getApellido());
        
        // Mostrar calificaciones de un alumno en una asignatura
        System.out.println("Calificaciones de " + alumno1.getNombre() + " en la asignatura " + asignatura1.getNombre() + ":");
        System.out.println(asignatura1.obtenerCalificacion(alumno1));
    }
    }
    

