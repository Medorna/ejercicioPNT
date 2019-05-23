package ejerciciopnt;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class EjercicioPNT {

    public static void main(String[] args) {

        Bebidas cocaZero = new Bebidas("Coca-Zero", "Coca-Cola Zero", 20, 1.5f);
        Bebidas cocaCola = new Bebidas("Coca Cola", "Coca-Cola", 18, 1.5f);
        Comidas frutillas = new Comidas("Bleh", "Frutillas", 64, 1000);
        Perfumeria shampoo = new Perfumeria("Sedal", "Shampoo", 19, 500);

        List<Producto> prodLst = new ArrayList<Producto>();

        prodLst.add(cocaZero);
        prodLst.add(cocaCola);
        prodLst.add(shampoo);
        prodLst.add(frutillas);

        for (Producto p : prodLst) {
            System.out.println(p.toString());
        }
        System.out.println("=============================");
        System.out.println("Producto mas caro: " + Collections.max(prodLst).getNombre());
        System.out.println("Producto mas barato: " + Collections.min(prodLst).getNombre());
    }
}
