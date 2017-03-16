
/**
 * Write a description of class Mainfraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mainfraccion
{ public static void main(String []x){
        fraccion punto1= new fraccion(2,4);
        fraccion punto2= new fraccion(1,4);
       // punto1.leer();
       // punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
       System.out.println("Resultado de la suma es:  ");
       punto1.ejecutarsuma(punto2);
        punto1.mostrar();
       // System.out.println("Resultado de la multiplicacion es:  ");
        //punto1.ejecutarprod(punto2);
       //punto1.mostrar();
    }
}
