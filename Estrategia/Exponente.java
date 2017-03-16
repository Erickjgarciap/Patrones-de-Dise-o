 

/**
 *
 * @author Alejandro
 */
public class Exponente extends Datomatecomp{
    
     public Exponente(double d1 ,double d2){
        super(d1,d2);
        prod = new ProductoExp();
    }
     public void ejecutarprod(Datomatecomp a){
    prod.producto(this,a);
    }

    public void mostrar() {
        System.out.println(numero1+"^"+numero2);
    }
    
    
    
    
}
