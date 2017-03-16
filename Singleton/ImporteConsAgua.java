package singleton;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ericko
 */
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Arrays;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import singleton.Ventana1;

public class ImporteConsAgua extends JFrame implements ActionListener{
    
  private  static ImporteConsAgua instancia;
  private JLabel eConsumo;
  private JTextArea dConsumos;
  private JTextField dConsumo;
  private JLabel eImporte;
  private JButton aceptar;   
  private JTextField inContrato;
  private JButton cancelar;
  private String aux="";
  private String num="";
  private JRadioButton zona[]={new JRadioButton("Zona A"), new JRadioButton("Zona B"),new JRadioButton("Zona C"),new JRadioButton("Zona D") };
  private float incremento = 0; 

  private ImporteConsAgua(String n){
  super(n);
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(900, 300); 

  Container pan = getContentPane();

  pan.setBackground(Color.white);

  JPanel zonas=new JPanel();

  JPanel titulo = new JPanel();

  JPanel datos  = new JPanel();

  JPanel total  = new JPanel();

  zonas.setLayout(new GridLayout(0,1));

  ButtonGroup gZonas = new ButtonGroup();

  AdmoZona   admoZona =new AdmoZona();

  for(int b=0;b<zona.length;b++)

  {  gZonas.add(zona[b]);

     zonas.add(zona[b]);

     //zona[b].addActionListener(this);

     zona[b].addItemListener(admoZona);

     

  }    

  zona[0].setSelected(true);

  JLabel contrato;

  JLabel eConsumo;

  contrato = new JLabel("Número contrato    :");

  eConsumo = new JLabel("Consumo(Mts.Cub):");

  dConsumo= new JTextField(8);

  eImporte= new JLabel("importe: ");

  aceptar= new JButton("Aceptar");

  inContrato= new JTextField(8);

   //cancelar= new JButton("Cancelar");     

  aceptar.addActionListener(this);  

  //cancelar.addActionListener(this);

  titulo.add(new JLabel("Cálculo del importe de Consumo de Agua "));

  datos.add(contrato);

  datos.add(inContrato);

  datos.add(eConsumo);

  datos.add(dConsumo); 

  datos.add(aceptar);

  //add(cancelar);

  total.add(eImporte);

  add(titulo,BorderLayout.NORTH);

  add(datos);

  add(zonas,BorderLayout.EAST);

  add(total,BorderLayout.SOUTH);

  setVisible(true);   

  setDefaultCloseOperation(EXIT_ON_CLOSE); 

} 
  public static ImporteConsAgua GetInstancia(String n){
    if(instancia == null){
       instancia = new ImporteConsAgua(n);
       System.out.println("Se creo 1 instancia " );
    }
    return instancia;
    }

private class AdmoZona implements ItemListener {
  public void itemStateChanged(ItemEvent ev) {

      //boolean selected = (ev.getStateChange( ) == ItemEvent.SELECTED);

      JRadioButton botSel = (JRadioButton)ev.getItemSelectable( );

      incremento(botSel);   

      }

} 

 @Override 

 public void actionPerformed(ActionEvent evento){

     if(evento.getSource() instanceof JButton){

      JButton prueba= (JButton) evento.getSource();

     if(prueba.getText().equals("Aceptar") || prueba.getText().equals("Borrar")){

     if(evento.getActionCommand().equals("Aceptar")){

    aceptar.setText("Borrar");

    String entrada= dConsumo.getText();

    double importe=0;

    try{

    double consumo= Double.parseDouble(dConsumo.getText());

    if(consumo<=20)

      importe=40*(1+incremento);

    else

      importe= 40+ (consumo-40)*(2+incremento);   

    NumberFormat num= NumberFormat.getInstance();

    num.setMaximumFractionDigits(2);

    num.setRoundingMode(RoundingMode.DOWN);

    eImporte.setText("Importe a pagar: $ "+num.format(importe)+ " inc "+incremento);   

   }catch(NumberFormatException e){}

 }else{

     aceptar.setText("Aceptar");

     eImporte.setText("Importe a pagar: $ ");

     dConsumo.setText("");

     inContrato.setText("");

     aux="";

     num="";

     }      

     }

     }   

      if(evento.getSource() instanceof JRadioButton)

      {

         incremento((JRadioButton) evento.getSource());             

      }  

 

 }

 private void incremento(JRadioButton bs )

 { 

   if(bs==zona[0])

         incremento= 0;

      else if(bs==zona[1])

          incremento =0.05f;

      else if(bs==zona[2])

          incremento= 0.08f;

      else if(bs==zona[3])

          incremento= 0.10f;
 }  
 /*
 public static void main(String []x){
     ImporteConsAgua a= new ImporteConsAgua();
     
 
 }
*/
}
