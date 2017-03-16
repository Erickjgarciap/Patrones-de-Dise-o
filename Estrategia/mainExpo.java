
/**
 * Write a description of class mainExpo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainExpo
{
   public static void main(String [] x){
      Exponente punto1= new Exponente(2,5);
        Exponente punto2= new Exponente(2,2);
       // punto1.leer();
       // punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
       // System.out.println("Resultado de la suma es:  ");
        //punto1.ejecutarsuma(punto2);
        //punto1.mostrar(punto2,"");
        System.out.println("Resultado de la multiplicacion es:  ");
        punto1.ejecutarprod(punto2);
       punto1.mostrar();
    }
}
