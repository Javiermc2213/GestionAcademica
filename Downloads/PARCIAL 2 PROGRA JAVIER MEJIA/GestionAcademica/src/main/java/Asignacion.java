import java.util.ArrayList;

public class Asignacion {
    private Alumno alumno;
    private ArrayList<Curso> cursos;

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
            curso.setAlumnosAsignados(curso.getAlumnosAsignados() + 1);
            System.out.println("Curso " + curso.getTitulo() + " asignado al alumno " + alumno.getNombre());
        } else {
            System.out.println("No hay espacio en el curso " + curso.getTitulo());
        }
    }
}
