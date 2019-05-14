package ejerciciopnt;

public class perfumeria extends producto{
    
    public perfumeria(String marca, String nombre, int precio, double capacidad) {
        super(marca, nombre, precio, capacidad);
    }
    
    @Override
    public String toString() {
    return "Nombre: "+ nombre +" "+ marca + " /// " + "Contenido: " + capacidad +"ml /// Precio: $"+precio;
  }
}
