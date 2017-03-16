
/**
 * Write a description of class Maincomplejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maincomplejo
{
  public static void main(String []x){
    complejo punto1= new complejo(0,0);
    complejo punto2= new complejo(0,0);
        punto1.leer();
        punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
       // System.out.println("Resultado de la suma es:  ");
       punto1.ejecutarsuma(punto2);
        //System.out.println("Resultado de la multiplicacion es:  ");
        //punto1.ejecutarprod(punto2);
        punto1.mostrar(punto2);
    }
}
