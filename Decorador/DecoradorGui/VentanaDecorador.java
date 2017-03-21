/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoradorGui;

/**
 *
 * @author Ericko
 */
public abstract class VentanaDecorador  implements Ventana {
    protected Ventana decoradorVentana;
    public VentanaDecorador(Ventana decVentana){
        this.decoradorVentana=decVentana;     
    }   
}