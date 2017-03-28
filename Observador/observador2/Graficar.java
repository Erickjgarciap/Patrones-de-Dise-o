package observador2;

/**
 *
 * @author Ericko
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class Graficar implements Observer {
   private  ArrayList<Integer>conjuntodatos;
   private ConjuntoDatos a;
  public Graficar(ConjuntoDatos s){
    a = s; //apuntar al sujeto a mirar
    a.addObserver(this);
    conjuntodatos= new ArrayList<Integer>();
  }
  @Override
    public void update(Observable o, Object arg) { 
      a=(ConjuntoDatos)o;  
      conjuntodatos=a.getDatos();
      graficar(); 
    }
  public void graficar(){
    Iterator it = conjuntodatos.iterator();
    System.out.println("Gráfica");
    while(it.hasNext()){
      int dato = (Integer)it.next();
      
      System.out.print(" " + dato + " : ");
      for(int i = 0; i < dato; i++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("-------------------------");
  }

   
}