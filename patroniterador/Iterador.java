/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;
import java.util.Iterator;
/**
 *
 * @author Ericko
 */
public interface Iterador {
    public boolean hasNext();
    public Object next();
    //public void iterador(int vi, int vf);
    public void salto(int salto);
}
