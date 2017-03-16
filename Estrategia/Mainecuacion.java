
/**
 * Write a description of class Mainecuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mainecuacion
{
   public static void main(String []x){
    ecuacion punto1= new ecuacion(0,0);
    ecuacion punto2= new ecuacion(0,0);
        punto1.leer();
        punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
       System.out.println("Resultado de la suma es:  ");
      punto1.ejecutarsuma(punto2);
       punto1.mostrar(punto2);
      
       
    }
}
