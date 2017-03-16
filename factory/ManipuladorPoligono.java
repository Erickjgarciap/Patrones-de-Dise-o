/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

//import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
/**
 *
 * @author Ericko
 */
public class ManipuladorPoligono  extends Manipulador{
    private JLabel etiqueta,etiqueta2,etiqueta3;
    private JFrame frame;
   
    private JPanel panel;
    private JTextField texto,cx,cy,dimen;
    private JButton boton1,boton2,boton3;
    
    public ManipuladorPoligono() throws InterruptedException{
        super();
        
        init();
    }
   
    @Override
    public void crearfigura(int dimension,int tamaño){
    figura = new Poligono(dimension,tamaño,"Pentagono",0,0);
    
    }
   
    @Override
    public void manipulador(int dimension,int tamaño){
   crearfigura(dimension,tamaño);
   figura.dibujar();
   
    
    }
   private void boton1_ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton1ActionPerformed

           System.out.println("estas apretando");
           int tam=Integer.parseInt(texto.getText());
           System.out.println(tam);
           figura.escalar(tam);
          
           frame.repaint();        
    }
   private void boton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("estas apretando boton2");
        int cox=Integer.parseInt(cx.getText());
        int coy=Integer.parseInt(cy.getText());
        figura.trasladar(cox, coy);
       frame.repaint();
    }
   private void boton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        System.out.println("estas apretando boton3");
        int dimens=Integer.parseInt(dimen.getText());
        figura.dimension=dimens;
        figura.repaint();

    }
   public void init(){
        
        frame=new JFrame("Frame test"); 
        frame.setSize(780, 500); 
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        etiqueta=new JLabel("Tamaño");
        etiqueta2=new JLabel("Trasladar");
        etiqueta3=new JLabel("Dimension");
        texto= new JTextField();
        cx= new JTextField("X");
        cy= new JTextField("Y");
        dimen= new JTextField();
        boton1 = new JButton();
        boton1.setText("escalar");
        boton2= new JButton();
        boton2.setText("OK");
        boton3= new JButton();
        boton3.setText("OK");
        etiqueta.setBounds(10,15, 50, 50);
        etiqueta2.setBounds(10,55, 60, 50);
        etiqueta3.setBounds(10,85, 60, 50);
        texto.setBounds(70, 30, 30, 20);
        cx.setBounds(80, 70, 30, 20);
        cy.setBounds(120, 70, 30, 20);
        dimen.setBounds(80, 100, 30, 20);
        boton1.setBounds(110, 30, 90, 20);
        boton2.setBounds(160, 70, 90, 20);
        boton3.setBounds(140, 100, 90, 20);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(550,500);
        panel.setLocation(500,0);
        panel.setBackground(Color.white);
        
        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(texto);
        panel.add(cx);
        panel.add(cy);
        panel.add(dimen);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        //figura=crearfigura(5,1);
        manipulador(1,1);
        frame.add(panel);
         frame.add(figura);
          
        frame.setVisible(true); 
        //escalar(5);
        //Thread.sleep(2000);
        //trasladar(100,0);
        //this.repaint();
      boton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                boton1_ActionPerformed(e);
            }
        });
       boton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                boton2_ActionPerformed(e);
            }
        });
         boton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                boton3_ActionPerformed(e);
            }
        });
   
   }
    
    }
    
    

