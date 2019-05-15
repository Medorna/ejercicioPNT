package ejerciciopnt;
import java.lang.Math;

public class perfumeria extends producto{
    
    private float capacidad;
     
    public perfumeria(String marca, String nombre, int precio, float capacidad) {
        super(marca, nombre, precio);
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        
        String unidadMedida;
        
        if(capacidad >= 1000){   
            unidadMedida = "Litros";
        }
        else{   
            unidadMedida = "ml";   
        }
        return "Nombre: " + nombre + " " + marca + " /// " + "Contenido: " + Math.round(capacidad)+ unidadMedida+ " /// Precio: $" + precio;
    }
}
