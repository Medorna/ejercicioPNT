package ejerciciopnt;

//super clase Producto. 
public class Producto implements Comparable<Producto> {

    protected int precio;
    protected String marca;
    protected String nombre;

    public Producto(String marca, String nombre, int precio) {

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
    public int compareTo(Producto t) {
        if (t.getPrecio() < this.getPrecio()) {
            return 1;
        } else if (t.getPrecio() > this.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }
}
