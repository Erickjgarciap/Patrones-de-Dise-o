/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.awt.*;


/**
 *
 * @author Ericko
 */
public class Poligono extends Figura{

        private int poliXR[] = {75, 25, 40, 110, 125};
	//Coordenadas en y para un polígono rojo
	private int poliYR[] = {50, 90, 150, 150, 90};
        private Polygon poliR;	
    public Poligono(int dimension,int tamaño,String nombre,int cx,int cy){
       super(dimension,tamaño,nombre,cx,cy);
     
    }
    
      public void dibujar(){
      this.repaint();
      
      }
 
    @Override
    public void paint(Graphics graphics) { 
         
        super.paint( graphics ); 
        //poliR = new Polygon((int)dimension,1);
        
        poliR = new Polygon(poliXR, poliYR, (int)dimension);
        Graphics2D g = (Graphics2D) graphics; 
        g.setColor(Color.red);
        g.translate(cx,cy);
        g.scale(tamaño,tamaño);
        g.drawPolygon(poliR);
         
        g.translate(cx,cy);
       
        

        } 
    
    
}

    
    
    
   
    
    

