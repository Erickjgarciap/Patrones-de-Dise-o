import javax.swing.JOptionPane;

public abstract class Datomatecomp{
    protected double  numero1;
    protected double numero2; 
    protected sumar sum;
    protected producto prod;
public Datomatecomp(double numero1,double numero2){
    this.numero1=numero1;
    this.numero2=numero2;
    }
public void leer(){
   
 numero1 = Double.parseDouble( JOptionPane.showInputDialog(null,"Introduzca x","Suma",JOptionPane.QUESTION_MESSAGE) );
 numero2 = Double.parseDouble( JOptionPane.showInputDialog(null,"Introduzca y","Suma",JOptionPane.QUESTION_MESSAGE) );
  
     }
public void mostrar(){
    System.out.println("Mostrando");
    System.out.println("dato X " + numero1);
    System.out.println("dato Y " + numero2);


}
public void ejecutarsuma(Datomatecomp a){
    sum.sumar(this,a);
}
  public void ejecutarprod(Datomatecomp a){
    prod.producto(this,a);
}
}
