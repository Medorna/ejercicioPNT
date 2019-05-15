package ejerciciopnt;

public class bebidas extends producto{
    
    private float capacidad;
    
    public bebidas(String marca, String nombre, int precio, float capacidad) {
        
        super(marca, nombre, precio);
        this.capacidad = capacidad;
        
    }
    
     @Override
    public String toString() {
    return "Nombre: "+ marca + " /// " + "Litros: " + capacidad +" /// Precio: $"+precio;
  }
}


    

