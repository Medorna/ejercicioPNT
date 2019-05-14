package ejerciciopnt;


public class comidas extends producto {
    
    public comidas(String marca, String nombre, int precio, double capacidad) {
        super(marca, nombre, precio, capacidad);
    }
    
    @Override
    public String toString() {
    return "Nombre: "+ nombre+ " /// "+ "Precio: $"+precio+" /// "+"Unidad de venta: kilo";
  }
    
}
