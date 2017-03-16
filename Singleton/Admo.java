/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Ericko
 */
public class Admo {
    private String nombre;
    private int nousuario;
    public Admo(String nombre,int nousuario){
        this.nombre="Admo no" + nousuario++;
    }
    
    public String getnombre(){
        return nombre;
    }
    
}
