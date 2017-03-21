package decorador;

import javax.swing.*;
import java.awt.Component;
import javax.swing.border.Border;
import java.awt.*;
public class VentanaConcreta implements Ventana{ 
 
    public void dibujar(){
    System.out.println("dibujando ventana concreta");      
    }
    @Override
    public String getDesciption() {
        return "Ventana Simple";
    }
}