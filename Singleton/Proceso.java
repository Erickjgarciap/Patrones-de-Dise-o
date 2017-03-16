package singleton;


/**
 *
 * @author Ericko
 */
public class Proceso implements Runnable{
    private String tituloF = "ventana";
    
    public Proceso(String tituloF){
        this.tituloF = tituloF;
    }
    
    @Override
    public void run() {
        ImporteConsAgua imAgua = ImporteConsAgua.GetInstancia(tituloF);
        imAgua.setVisible(true);
    }
    
}
