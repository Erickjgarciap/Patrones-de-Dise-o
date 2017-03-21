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
import javax.swing.*;
public class VentanaConBoton extends VentanaDecorador{
    
    public VentanaConBoton(Ventana decVentana) {
        super(decVentana);
    }

    @Override
    public void dibujar() {
             
             JButton b = new JButton("boton de prueba");
             b.setVisible(true);
             b.setBounds(100,100,150,25);
             addComponent(b);
             decoradorVentana.dibujar();
             System.out.println("Dibujando un boton simple");
    }
    
    @Override
    public void addComponent(Object j){
         decoradorVentana.addComponent(j); 
    }
    
    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con boton de ayuda";
    }   
}