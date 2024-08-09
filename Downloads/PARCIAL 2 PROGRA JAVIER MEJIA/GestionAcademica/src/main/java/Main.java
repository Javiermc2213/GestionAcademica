public class Main {

    public static void main(String[] args) {
        // Crear Catedráticos
        Catedratico catedratico1 = new Catedratico("Dr. Perez", "Calle 1", "12345678", "Matemáticas");
        Catedratico catedratico2 = new Catedratico("Dra. Lopez", "Calle 2", "87654321", "Física");
        Catedratico catedratico3 = new Catedratico("Dr. Martinez", "Calle 3", "11223344", "Química");

        // Crear Cursos
        Curso curso1 = new Curso(1, "Cálculo", 2, 4, catedratico1);
        Curso curso2 = new Curso(2, "Física", 5, 3, catedratico2);
        Curso curso3 = new Curso(3, "Química", 5, 4, catedratico3);

        // Crear Alumnos
        Alumno alumno1 = new Alumno("Juan Perez", "Av. 1", "99887766", 20);
        Alumno alumno2 = new Alumno("Ana Garcia", "Av. 2", "66554433", 21);
        Alumno alumno3 = new Alumno("Luis Gomez", "Av. 3", "11225544", 22);

        // Crear Asignaciones
        Asignacion asignacion1 = new Asignacion(alumno1);
        Asignacion asignacion2 = new Asignacion(alumno2);
        Asignacion asignacion3 = new Asignacion(alumno3);

        // Asignar Cursos
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        asignacion2.addCurso(curso1);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        asignacion3.addCurso(curso1); 
        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);
    }
}

