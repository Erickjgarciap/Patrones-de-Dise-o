
public class complejo extends Datomatecomp{
     public complejo(double d1 ,double d2){
        super(d1,d2);
        sum = new suma2();
        prod= new productocomplejo();
    }
    public void mostrar(Datomatecomp d2){
        String im=((d2.numero2>0)? "+":" ");
        System.out.println( this.numero1 +""+im+""+ d2.numero2+"i");
    }
    
}
