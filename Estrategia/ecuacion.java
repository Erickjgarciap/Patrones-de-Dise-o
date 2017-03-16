
public class ecuacion extends Datomatecomp{
        public ecuacion(double d1 ,double d2){
        super(d1,d2);
        sum = new sumaecuacion();
    }
    public void mostrar(Datomatecomp d2){
      String in=((d2.numero1>0)? "+":" ");
        System.out.println( this.numero1 +"x "+in+""+ d2.numero2);
    }
    
}
    

