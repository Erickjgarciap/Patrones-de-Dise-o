
public class Mainpunto
{
    public static void main(String []x){
    
        punto punto1= new punto(0,0);
        punto punto2= new punto(0,0);
        punto1.leer();
        punto2.leer();
        punto1.mostrar();
        punto2.mostrar();
         System.out.println("Resultado de la suma es:  ");
        punto1.ejecutarsuma(punto2);
     //   System.out.println("Resultado de la multiplicacion es:  ");
       // punto1.ejecutarprod(punto2);
        punto1.mostrar();
     
    }
}
