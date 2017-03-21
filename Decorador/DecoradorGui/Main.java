/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoradorGui;

/**
 *
 * @author Ericko
 */
public class Main {
       
public static void main(String[] args){
    
    //-----------ventana concreta sin nada------------------------/////
   // Ventana a= new VentanaConcreta();
    // a.dibujar();
    
    //----------ventana con boton pasandole una ventana concreta--------//
    //Ventana vb = new VentanaConBoton(new VentanaConcreta());
  // vb.dibujar();
    
    //----------ventana concreta con borde-------------------------------///
     // Ventana vborde= new VentanaConBorde(new VentanaConcreta());   
      //vborde.dibujar();
      
    //-----------ventana conreta con borde y con boton----------///
    Ventana todoslosdecoradores = new VentanaConBoton(new VentanaConBorde(new VentanaConcreta()));
    todoslosdecoradores.dibujar();
      
    
    }
}
