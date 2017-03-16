/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

//import static factory.Manipulador.figura;
import javax.swing.JComponent;

/**
 *
 * @author Ericko
 */
public abstract class Figura extends JComponent {
    int cx;
    int cy;
   Object dimension;
    int tamaño;
    String Nombre;
    public Figura(Object dimension,int tamaño,String Nombre,int cx,int cy){
        this.dimension=dimension;
        this.tamaño=tamaño;
        this.Nombre=Nombre;
        this.cx=cx;
        this.cy=cy;
    }
    public int gettamaño(){
    return this.tamaño;
    }
    public void settamaño(int x){
       this.tamaño=x;
    }
    public Object getdimension(){
        return this.dimension;
    }
    public void setdimension(Object x){
        this.dimension=x;    
    }
    public void setx(int x){
        this.cx=x;
    
    }
    public void sety(int y){
        this.cy=y;
    }
    public void escalar(int x){
      this.settamaño(x);
       System.out.println(this.gettamaño()+" ");
    }
     public void trasladar(int cx,int cy){
         this.setx(cx);
         this.sety(cy);
     
     }
    public void dibujar(){

        
      
      }
    
    

   
   
   
    
    
}
