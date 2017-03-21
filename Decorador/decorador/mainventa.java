package decorador;
/**
 * Write a description of class mainventa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class mainventa extends JFrame {
    

public static void main(String[] args){
   /*
   Ventana a= new VentanaConcreta();
     a.dibujar();   
     a=new BordeDecorador(a);
     a.dibujar();
     a= new BotonAyudaDecorador(a);
     a.dibujar();
*/
   Ventana a= new BotonAyudaDecorador(new BordeDecorador(new VentanaConcreta()));
   a.dibujar();
   
    }
}
