/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ericko
 */
public class Totaliza implements Observador {
    private  ArrayList<Integer>conjuntodatos;
    private Sujeto suj;
    private int acumulado=0;
    public  Totaliza(Sujeto os){
        suj=os;
        //registrar el obsevador haciendo referencia asi mismo 
        suj.registrarObservador(this);
        conjuntodatos= new ArrayList<Integer>();
    }
    

    @Override
    public void actualiza(Sujeto s) {
      suj=s;
      conjuntodatos= s.getDatos();
       totaliza();
    }
    public void totaliza(){
        
    Iterator it = conjuntodatos.iterator();
    while(it.hasNext()){
      acumulado+=(Integer)it.next();
    }
    System.out.println("Acumulado : " + acumulado);
    acumulado=0;
    System.out.println("-------------------------");
    
    }
    
    
}
