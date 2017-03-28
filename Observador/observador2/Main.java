/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador2;

import java.util.Observer;

/**
 *
 * @author Ericko
 */
public class Main {
     public static void main(String args []){
    //creas un sujeto
    ConjuntoDatos s1 = new ConjuntoDatos();
    //creamor el observaodr  graficar que implemente de la clase observer
      Observer graf= new Graficar(s1);
      //creamor el observaodr  total que implemente de la clase observer
      Observer total= new Totaliza(s1);
      //creamor el observaodr  EscribirDatos  que implemente de la clase observer
      Observer a= new EscribirDatos(s1); 
    //agregas datos, y el observer debe imprimirlos
        s1.add(10);
    //s1.deleteObserver(total);
        s1.add(20);
        s1.add(2);
        s1.add(40);
        s1.add(100);
        s1.remove(0);
  }
}
