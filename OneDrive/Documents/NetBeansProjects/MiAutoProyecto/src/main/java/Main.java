public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto miAuto = new Auto("Toyota", "Rojo", "Sedán", 2021, 5);

        // Mostrar la información del auto
        miAuto.mostrarInfo();

        // Cambiar algunos atributos usando los setters
        miAuto.setColor("Azul");
        miAuto.setModelo(2022);

        // Mostrar la información actualizada del auto
        System.out.println("\nInformación actualizada del auto:");
        miAuto.mostrarInfo();
    }
}
