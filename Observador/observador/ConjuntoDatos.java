/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ericko
 */
//sujero observable
public class ConjuntoDatos  implements Sujeto{

    private ArrayList <Integer> datos;
    private ArrayList<Observador> obs;
    private boolean band= false;
    
    public ConjuntoDatos(){
    datos= new ArrayList();
    obs = new ArrayList();
    
    }
    public boolean abstraccion(){
        if(!band){
        
        return false;
        }    
        return true;
    
    }
    public void add(Integer d){
        datos.add(d);
        notificar();
    }
    public void remove(int i){
        if(i>=0 && i<datos.size() && datos.size()>0){
            datos.remove(i);
            notificar();
        }
    //imprimir
    //volver a hacer la suma
    
    }
    public ArrayList getDatos(){
    return datos;
    }
    
    @Override
    public void registrarObservador(Observador a){
        obs.add(a);
    }
    @Override
    public void removerObservador(int i){
        if(obs.size()>0){
        obs.remove(i);
        }
    }
    
    @Override
    public void notificar(){
    Iterator it = obs.iterator();
        while(it.hasNext()){
            
      Observador o =(Observador)it.next();
      o.actualiza(this);
    }
  }

}
