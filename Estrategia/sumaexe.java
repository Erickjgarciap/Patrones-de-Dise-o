
public class sumaexe implements  sumar
{
  public  void sumar(Datomatecomp d,Datomatecomp d2 ){
      double aux1= d.numero1;
      double aux2= d.numero2;
      double aux3= d2.numero1;
      if( d.numero2== d2.numero2){
        d.numero1=d.numero1+ d2.numero1;//numerador
        //d.numero2=d.numero2;
        //d.numero1=d.numero1/d.numero2;//resultado
        }
      else{
        d.numero1=(aux1*d2.numero2)+(aux3*aux2);//numerador
        d.numero2=(aux2*d2.numero2);//denomidador
       // d.numero=d.numero1/d.numero2;
        
        
        
        }
    
    
    }
}
