public class Catedratico {
    private static int contador = 1;
    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = contador++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public void imprimirDatos() {
        System.out.println("Catedrático: " + nombre + ", Código: " + codigoCatedratico);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Profesión: " + profesion);
    }
}
