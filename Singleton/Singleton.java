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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    private static int ni=0;
    public static void main(String[] args) {
        
       
       
        // TODO code application logic here
       // SingletonClasico a = new SingletonClasico();
   SingletonClasico instancia= new SingletonClasico();  
   System.out.println("Nunero de instancias creadas " + instancia.numIns());
   SingletonClasico instancia0= SingletonClasico.getInstancia();
        System.out.println("Nunero de instancias creadas " + instancia0.numIns());
        System.out.println("Intento de instancia " + ni++);
        
    
    }
    
}
