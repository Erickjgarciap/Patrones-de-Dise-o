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
//el observador 

/*Imprimir*/
public class EscribirDatos  implements Observador{
    private  ArrayList<Integer>dd;
    private Sujeto suj;
    public EscribirDatos(Sujeto os){
        suj=os;
        //registrar el obsevador haciendo referencia asi mismo 
        suj.registrarObservador(this);
        dd= new ArrayList();
    }
    @Override
    public void actualiza(Sujeto s){ 
        this.suj=s;
       // dd=((ConjuntoDatos)s).getDatos();
        dd=s.getDatos();
        imprimir();
    }
    public void imprimir(){
    Iterator it = dd.iterator();
    while(it.hasNext()){
      System.out.println(" " + (Integer)it.next());
    }
    System.out.println("-------------------------");
    }
    
    }   
   
    

