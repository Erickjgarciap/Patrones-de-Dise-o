import javax.swing.JOptionPane;
public class punto extends Datomatecomp{
    
public punto(double d1 ,double d2){
      super(d1,d2);
     sum = new suma2();
     //prod= new productoexe();
    }
public void mostrar(){
        System.out.println("(" + this.numero1 +","+ this.numero2+")");
    }

}
