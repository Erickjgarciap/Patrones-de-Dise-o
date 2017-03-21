
package decorador;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class BordeDecorador extends VentanaDecorador{
     Border blackline = BorderFactory.createLineBorder(Color.black);
    public BordeDecorador(Ventana decVentana) {
        super(decVentana);
       
    }
    @Override
    public void dibujar() {
         decoradorVentana.dibujar();
         System.out.println("con borde");
       
    }


    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con borde";
    }
    
}