package ejerciciopnt;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class EjercicioPNT {

   
    public static void main(String[] args) {

        bebidas cocaZero = new bebidas("Coca Cola", "Coca-Cola Zero", 20, 1.5);
        bebidas cocaCola = new bebidas("Coca Cola", "Coca-Cola", 18, 1.5);
        comidas frutillas = new comidas("Bleh", "Frutillas",64,1.2);
        perfumeria shampoo = new perfumeria("Sedal", "Shampoo", 19, 500);
       
        List<producto> prodLst = new ArrayList<producto>();  // poliphic
	prodLst.add(cocaZero);
	prodLst.add(cocaCola);
	prodLst.add(frutillas);
	prodLst.add(shampoo);

	Collections.sort(prodLst);

	for (producto p : prodLst) {
	    System.out.println("Producto: " + p.toString());
	}
	System.out.println("Producto mas caro: " + Collections.max(prodLst).getNombre());
	System.out.println("Producto mas barato: " + Collections.min(prodLst).getNombre());
    }
    
}
