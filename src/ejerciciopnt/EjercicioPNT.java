package ejerciciopnt;


public class EjercicioPNT {

   
    public static void main(String[] args) {
        
      
        bebidas cocaZero = new bebidas("Coca Cola", "Coca-Cola Zero", 20, 1.5);
        
        bebidas cocaCola = new bebidas("Coca Cola", "Coca-Cola", 18, 1.5);
        
        comidas frutillas = new comidas("Bleh", "Frutillas",64,1.2);
        
        perfumeria shampoo = new perfumeria("Sedal", "Shampoo", 19, 500);
        
        System.out.println(cocaZero);
        System.out.println(cocaCola);
        System.out.println(shampoo);
        System.out.println(frutillas);
        
        
    }
    
}
