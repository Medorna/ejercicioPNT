package ejerciciopnt;

public class Comidas extends Producto {

    private float peso;

    public Comidas(String marca, String nombre, int precio, float peso) {
        super(marca, nombre, precio);
        this.peso = peso;
    }

    @Override
    public String toString() {

        String unidadPeso;

        if (peso >= 1000) {
            unidadPeso = "Kilo";
        } else {
            unidadPeso = "Gramos";
        }

        return "Nombre: " + nombre + " /// " + "Precio: $" + precio + " /// " + "Unidad de venta: " + unidadPeso;
    }
}
