package decorador;

import javax.swing.*;
public class BotonAyudaDecorador extends VentanaDecorador{
    public BotonAyudaDecorador(Ventana decVentana) {
        super(decVentana);
    }

    @Override
    public void dibujar() {
             decoradorVentana.dibujar();
             System.out.println("Ventana con boton");
             
            
    }
    @Override
    public String getDesciption() {
        return decoradorVentana.getDesciption()+", con boton de ayuda";
    }
    
}