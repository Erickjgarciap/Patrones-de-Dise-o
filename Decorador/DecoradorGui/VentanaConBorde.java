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
import java.awt.Color;
import java.awt.FlowLayout;

public class VentanaConBorde extends VentanaDecorador{
    public VentanaConBorde(Ventana decVentana) {
        super(decVentana);
    }
    
    @Override
    public void addComponent(Object j){
             decoradorVentana.addComponent(j);
    }
    
    @Override
    public void dibujar() {
         JPanel borde=new JPanel(new FlowLayout());
         borde.setVisible(true);
         borde.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 10));
         borde.add(new JLabel("Ventana con Borde"));
         addComponent(borde);
         decoradorVentana.dibujar();
         System.out.println("Ventana con borde");
    }

    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con borde";
    }
}
