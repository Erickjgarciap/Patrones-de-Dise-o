/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ericko
 */
public abstract class Manipulador  extends JFrame{
    protected  Figura figura;
     private JButton boton1,boton2;
    public Manipulador(){
        init2();
    }
    public  void manipulador(int dimension,int manipulador){
    
    
    }

    public void init2(){
        boton1 = new JButton();
        boton1.setText("Texto");
        boton2= new JButton();
        boton2.setText("Figura");
        this.setLayout(null);
        this.setSize(780, 500); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boton1.setBounds(10, 30, 90, 20);
        boton2.setBounds(250, 70, 90, 20);
        this.setVisible(true);
        this.add(boton1);
        this.add(boton2);
          boton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    boton1_ActionPerformed(e);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Manipulador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       boton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    boton2_ActionPerformed(e);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Manipulador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
   public void crearfigura(int dimension,int tamaño){
    
    }
   
    private void boton1_ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {//GEN-FIRST:event_jButton1ActionPerformed
      ManipuladorTexto s = new ManipuladorTexto();
           
    }
   private void boton2_ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {//GEN-FIRST:event_jButton1ActionPerformed
         ManipuladorPoligono f = new ManipuladorPoligono();
    }
}

