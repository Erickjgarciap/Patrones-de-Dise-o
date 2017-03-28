/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author Ericko
 */
public interface Sujeto {
    //metodos que implementaran los sujetos 
    public void registrarObservador(Observador a);
    public void removerObservador(int i);
    public void notificar();
   public ArrayList getDatos();
    
    
}
