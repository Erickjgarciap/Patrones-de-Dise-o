package observador;

/**
 *
 * @author Ericko
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Graficar implements Observador {
   private Sujeto suj;
   private  ArrayList<Integer>conjuntodatos;
   
  public Graficar(Sujeto s){
    suj = s; //apuntar al sujeto a mirar
    suj.registrarObservador(this);
    conjuntodatos= new ArrayList<Integer>();
  }
  @Override
  public void actualiza(Sujeto s){
    this.suj = s;
    conjuntodatos= s.getDatos();
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