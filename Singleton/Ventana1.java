/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
/**
 *
 * @author Ericko
 */
import javax.swing.*;
import java.awt.Color;
import java.util.Arrays;
import java.util.Date;
public class Ventana1 extends JFrame {
     private Date fecha;
     private static Ventana1 instancia;
     private int numIns=0;
     private JTextArea textArea = new JTextArea();
     protected Ventana1() {
        initComponents();
        numIns ++;
        this.setSize(400,100);
        this.setTitle("La misma ventana");
        
     }
 public static Ventana1 GetInstancia(){
    if(instancia == null){
        instancia = new Ventana1();
        System.out.println("Se creo 1 instancia " );
    }
    return instancia;
    }
 public int numIns(){
      return numIns;
     }
 private void initComponents() {
     this.setVisible(true);
   //  this.getContentPane().setBackground(Color.ORANGE);
     this.setLayout(null);
     textArea.setBounds(50, 50, 50, 50);
     fecha = new Date();
     textArea.setText(""+fecha);
     add(textArea);
     
    }
}