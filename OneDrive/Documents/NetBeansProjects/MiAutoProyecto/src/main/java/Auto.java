public class Auto {
    // Atributos
    private String marca;
    private String color;
    private String tipo;
    private int modelo;
    private int cantidadPasajeros;

    // Constructor
    public Auto(String marca, String color, String tipo, int modelo, int cantidadPasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Método para mostrar la información del auto
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cantidad de Pasajeros: " + cantidadPasajeros);
    }
}
