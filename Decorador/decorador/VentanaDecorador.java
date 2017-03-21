package decorador;
import javax.swing.JFrame;

public abstract class VentanaDecorador  implements Ventana {
    protected Ventana decoradorVentana;
    public VentanaDecorador(Ventana decVentana){
        this.decoradorVentana=decVentana;
       
    }
    
}