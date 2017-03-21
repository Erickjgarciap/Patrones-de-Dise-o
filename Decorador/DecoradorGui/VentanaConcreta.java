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
import java.awt.Component;
public class VentanaConcreta extends JFrame implements Ventana{ 
    
    @Override
    public void dibujar(){
        //this.setLayout(null);
        this.setVisible(true);
        this.setSize(340, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ventana sin nada de nada");
        System.out.println("Dibujando una ventana Simple");  
    }
    
    @Override
    public void addComponent(Object j){
       this.getContentPane().add((Component)j);
    }
    
    @Override
    public String getDesciption() {
        return "Ventana Simple";
    }
}
