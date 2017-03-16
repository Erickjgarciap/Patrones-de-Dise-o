
/**
 * Write a description of class MainPolar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainPolar
{
    public static void main(String [] x){
     polar punto1= new polar(2,45);
        polar punto2= new polar(10,30);
       // punto1.leer();
       // punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
       // System.out.println("Resultado de la suma es:  ");
        punto1.ejecutarsuma(punto2);
        punto1.mostrar(punto2,"");
        //System.out.println("Resultado de la multiplicacion es:  ");
        //punto1.ejecutarprod(punto2);
       ///punto1.mostrar(punto2);
    }
}
