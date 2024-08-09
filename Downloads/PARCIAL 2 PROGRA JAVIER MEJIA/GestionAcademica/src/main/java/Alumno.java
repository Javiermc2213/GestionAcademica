public class Alumno {
    private static int contador = 1;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;

    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = contador++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Alumno: " + nombre + ", Carnet: " + carnet);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
