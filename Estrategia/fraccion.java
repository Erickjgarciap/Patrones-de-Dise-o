
public class fraccion extends Datomatecomp
{
   public fraccion(double d1 ,double d2){
        super(d1,d2);
        sum = new sumaexe();
        prod= new productoexe();
    }
    public void mostrar(){
        //String im=((d2.numero2>0)? "+":" ");
        System.out.println(this.numero1 +" / " + this.numero2);
        //System.out.println(d2.numero2);
    }
    public void mostrar(Datomatecomp d2,String a){
        //String im=((d2.numero2>0)? "+":" ");
        System.out.println(this.numero1 + "/ " + d2.numero2);
      
    }
}
