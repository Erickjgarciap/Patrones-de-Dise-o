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
public class SingletonParaHilos {
    private static volatile SingletonParaHilos instance = null;
    
    private static int ni=0;
    
    private SingletonParaHilos(){
    ni++;
    
    }
     public static SingletonParaHilos getInstancia() {
        if (instance == null) {
            synchronized (SingletonParaHilos.class) {
                if (instance == null) {
                    instance = new SingletonParaHilos();
                    System.out.println("veces " + ni );
                }
            }
        }
        return instance;
    }
      public int numIns(){
 return ni;
 }
    
}
