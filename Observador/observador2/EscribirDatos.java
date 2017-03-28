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
//el observador 

/*Imprimir*/
public class EscribirDatos implements Observer{
    private  ArrayList<Integer>dd = new ArrayList();
    private Sujeto suj;
    private ConjuntoDatos a;
    public EscribirDatos(ConjuntoDatos ob){
       this.a=ob;
       a.addObserver(this);
    }
     @Override
    public void update(Observable o, Object arg) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       a=(ConjuntoDatos)o;  
       dd=a.getDatos();
       imprimir(); 

    }
    public void imprimir(){
    Iterator it = dd.iterator();
    while(it.hasNext()){
      System.out.println(" " + (Integer)it.next());
    }
    System.out.println("-------------------------");
    }

   
    
    }   
   
    

