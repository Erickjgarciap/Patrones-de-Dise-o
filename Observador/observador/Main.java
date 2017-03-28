/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;
/**
 *
 * @author Ericko
 */
public class Main {
     public static void main(String args []){
    //creas un sujeto
    ConjuntoDatos s1 = new ConjuntoDatos();
    //crear un(os) observador(es) y lo suscribes a ese sujeto
    Observador o1 = new EscribirDatos(s1);
    //crear un objeto para sacar el total acumulador de los valores de entrada
    Observador to1= new Totaliza(s1);
    //scar un objeto para graficar
    Observador graf= new Graficar(s1);
    
    //agregas datos, y el observer debe imprimirlos
    s1.add(10);
    s1.removerObservador(2);
    s1.add(2);
    s1.add(40);
    s1.add(100);
    s1.remove(0);
  }
}
