/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ericko
 */
public class Totaliza implements Observer {
    private  ArrayList<Integer>conjuntodatos;
    private int acumulado=0;
     private ConjuntoDatos a;
    public  Totaliza(ConjuntoDatos os){
        a=os;
        //registrar el obsevador haciendo referencia asi mismo 
       a.addObserver(this);
        conjuntodatos= new ArrayList<Integer>();
    }
      @Override
    public void update(Observable o, Object arg) {
        a=(ConjuntoDatos)o;  
       conjuntodatos=a.getDatos();
       totaliza(); 
    }
    
    public void totaliza(){
        
    Iterator it = conjuntodatos.iterator();
    while(it.hasNext()){
      acumulado+=(Integer)it.next();
    }
    System.out.println("Acumulado : " + acumulado);
    acumulado=0;
    System.out.println("-------------------------");
    
    }

  
    
    
}
