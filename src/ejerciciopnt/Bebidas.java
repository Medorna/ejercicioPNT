package ejerciciopnt;

public class Bebidas extends Producto {

    private float capacidad;

    public Bebidas(String marca, String nombre, int precio, float capacidad) {

        super(marca, nombre, precio);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + marca + " /// " + "Litros: " + capacidad + " /// Precio: $" + precio;
    }
}


    

