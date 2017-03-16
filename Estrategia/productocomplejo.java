
/**
 * Write a description of class productocomplejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class productocomplejo implements producto{
    public  void producto(Datomatecomp d,Datomatecomp d2){
       double aux=d.numero1;
    d.numero1 =(d.numero1*d2.numero1)-(d.numero2*d2.numero2);
    d2.numero2 =((aux*d2.numero2)+d.numero2*d2.numero1);
    }
}
