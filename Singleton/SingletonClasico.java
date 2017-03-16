/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ericko
 */
public class SingletonClasico {
    
    private static SingletonClasico instancia;
    private static int numIns=0;
    protected SingletonClasico(){
        numIns++;
    
    }
 public static  SingletonClasico getInstancia(){
     if(instancia==null){
     instancia= new SingletonClasico();
     }
     System.out.println("Se creo la instancia");
     return instancia;
 }
 public int numIns(){
 return numIns;
 }
 
}
