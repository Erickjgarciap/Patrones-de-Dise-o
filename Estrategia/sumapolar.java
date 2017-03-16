
/**
 * Write a description of class sumapolar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumapolar implements sumar
{
     public  void sumar(Datomatecomp d,Datomatecomp d2 ){
      double aux1= d.numero1;
      double aux2= d.numero2;
      double aux3= d2.numero2;
      d.numero1=  aux1*Math.cos(Math.toRadians(d.numero2))+ d2.numero1*(Math.cos(Math.toRadians(d2.numero2)));
      d.numero2= aux1*Math.sin(Math.toRadians(d.numero2))+ Math.round(d2.numero1*(Math.sin(Math.toRadians(aux3))));
    
    }
}
