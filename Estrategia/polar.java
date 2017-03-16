
public class polar extends Datomatecomp{
   public polar(double d1 ,double d2){
        super(d1,d2);
        sum = new sumapolar();
        prod= new productopolar();
    }
   public void ejecutarsuma(Datomatecomp b){
    sum.sumar(this,b);
    }
   public void ejecutarprod(Datomatecomp a){
    prod.producto(this,a);
    }
   public void mostrar(){
        //String im=((d2.numero2>0)? "+":" ");
        System.out.println( this.numero1 +"< angulo de "+ this.numero2+"°");
     }
     public void mostrar(Datomatecomp d2,String a){
        String im=((d2.numero2>0)? "+":" ");
        System.out.println( this.numero1 + im + d2.numero2+"i");
     }
    
}
