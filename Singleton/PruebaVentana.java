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
import java.util.logging.Level;
import java.util.logging.Logger;
public class PruebaVentana extends JFrame {
    private Admo a;
    private int contusuarios;
    private Ventana1 ventana;
    private int numerodeusuarios;
    private JTextField texto;
    private ImporteConsAgua agua;
    private JButton jButton1;
    private JButton jButton2;
    public PruebaVentana(){
        try {
            initComponents();        } catch (Exception ex) {
            Logger.getLogger(PruebaVentana.class.getName()).log(Level.SEVERE, null, ex);

        }
        this.setVisible(true);
    }
    private void initComponents()throws Exception{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLUE);
        this.setLayout(null);
        setSize(300,300);
        
        texto = new JTextField("");
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton1.setBounds(90,50,130,50);
        texto.setBounds(90,0,100,50);
        jButton2.setBounds(90,110,150,60);
        jButton1.setText("Crear Admin");
        jButton2.setText("Crear Usuario");
        add(jButton1);
        add(jButton2);
        add(texto);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    jButton1_ActionPerformed(e);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PruebaVentana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    }
    private void jButton1_ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {
        agua=ImporteConsAgua.GetInstancia(texto.getText()) ;
        //agua.setTitle(texto.getText());
        agua.setVisible(true);
               // System.out.println(ventana.numIns());

        Proceso p = new Proceso("Importe consumo de agua 1");
        Proceso p2 = new Proceso("Importe consumo de agua 2");
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p2);
        
        t1.start();
        t1.sleep(3000);
        t2.start();
        t2.sleep(3000); 
        t3.start();
        t3.sleep(3000); 

               
   
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
               agua = ImporteConsAgua.GetInstancia(texto.getText()) ;
               //agua.setVisible(true);
             // System.out.println(ventana.numIns());
        
        }
    
    
    
    }
   
