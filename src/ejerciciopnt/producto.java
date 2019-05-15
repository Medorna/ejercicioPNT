package ejerciciopnt;

//super clase Producto. 
public class producto implements Comparable<producto> {
    
    protected int precio;
    protected String marca;
    protected String nombre;
    
    
    public producto (String marca, String nombre, int precio){
        
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        

    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    @Override
    public int compareTo(producto t) {
        if (t.getPrecio() < this.getPrecio())
            return 1;
	else if(t.getPrecio() > this.getPrecio())
            return -1;
	else
    	    return 0;
    }

}

