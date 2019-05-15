package ejerciciopnt;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class EjercicioPNT {

   
    public static void main(String[] args) {

        bebidas cocaZero = new bebidas("Coca-Zero", "Coca-Cola Zero", 20, 1.5f);
        bebidas cocaCola = new bebidas("Coca Cola", "Coca-Cola", 18, 1.5f);
        comidas frutillas = new comidas("Bleh", "Frutillas",64,1000);
        perfumeria shampoo = new perfumeria("Sedal", "Shampoo", 19, 500);
       
        List<producto> prodLst = new ArrayList<producto>();  
	
        prodLst.add(cocaZero);
	prodLst.add(cocaCola);
        prodLst.add(shampoo);
	prodLst.add(frutillas);
	
        

	for (producto p : prodLst) {
	    System.out.println(p.toString());
	}
        System.out.println("=============================");
	System.out.println("Producto mas caro: " + Collections.max(prodLst).getNombre());
	System.out.println("Producto mas barato: " + Collections.min(prodLst).getNombre());
    }
    
}
