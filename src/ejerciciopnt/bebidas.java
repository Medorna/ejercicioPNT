package ejerciciopnt;

public class bebidas extends producto{
    

    public bebidas(String marca, String nombre, int precio, double capacidad) {
        super(marca, nombre, precio, capacidad);
    }
    
     @Override
    public String toString() {
    return "Nombre: "+ marca + " /// " + "Litros: " + capacidad +" /// Precio: $"+precio;
  }
}


    

