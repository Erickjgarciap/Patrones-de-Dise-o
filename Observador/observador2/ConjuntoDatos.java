/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Ericko
 */
//sujero observable
public class ConjuntoDatos  extends Observable{

    
    private ArrayList <Integer> datos= new ArrayList();
    private ArrayList<Observador> obs;
    private boolean band= false;
    
    public ConjuntoDatos(){
   // datos= new ArrayList();
    //obs = new ArrayList();
    
    }
    
    public boolean abstraccion(){
        if(!band){
        
        return false;
        }    
        return true;
    
    }
    public void add(Integer d){
        datos.add(d);
        this.setChanged();
        this.notifyObservers();
    }
    public void remove(int i){
        if(i>=0 && i<datos.size() && datos.size()>0){
            datos.remove(i);
           // notificar();
        this.setChanged();
        this.notifyObservers();
        }
    //imprimir
    //volver a hacer la suma
    
    }
    public ArrayList<Integer>getDatos(){
    return datos;
    }

    public void registrarObservador(Observador a){
        obs.add(a);
    }
   
    public void removerObservador(int i){
        if(obs.size()>0){
        obs.remove(i);
        }
    }
    
    
    
  


}
