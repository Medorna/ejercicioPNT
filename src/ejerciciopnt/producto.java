package ejerciciopnt;

//super clase Producto. 
public class producto implements Comparable<producto> {
    
    protected int precio;
    protected String marca;
    protected String nombre;
    protected double capacidad;
    
    public producto (String marca, String nombre, int precio, double capacidad){
        
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        

    }
    
    //??????????????????? wtf... ? 
    @Override
    public int compareTo(producto t) {
        return 1;
    }
}

