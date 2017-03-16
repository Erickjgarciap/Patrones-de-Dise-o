import java.util.Scanner;
public class FuncionSCT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce un ángulo de (0...360°): ");
            a = num.nextDouble();
            anguloCal(a);
        } catch (Exception e) {
            System.out.println("ERROR: Datos incorrectos.");
        }
    }
    static void anguloCal(double a){
        //Primer punto, pasa "a" a radianes.
        double b = Math.toRadians(a);
        System.out.println("Seno de " + a + " es: " + Math.sin(b) );
        System.out.println("Coseno de " + a + " es: " + Math.cos(b) );
        System.out.println("Tangente de " + a + " es: " + Math.tan(b) );
    }
}