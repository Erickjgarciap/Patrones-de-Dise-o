/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

/**
 *
 * @author Ericko
 */
public class Texto extends Figura{
      public Texto(Object dimension,int tamaño,String Nombre,int cx,int cy){
       super(dimension,tamaño,Nombre,cx,cy);
    }
        @Override
  public void dibujar(){
       
        this.repaint();                
    }
   @Override
  public void paintComponent(Graphics g) {
      
        Graphics2D g2 = (Graphics2D)g;
        Font fuente=new Font(dimension.toString(), Font.BOLD, 15);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(fuente);
         g2.scale(tamaño, tamaño);
         g2.translate(cx, cy);
        g2.drawString(Nombre,70,20); 
       
   }
}
