/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;
import java.util.Iterator;
/**
 *
 * @author VickaRamirez
 */
public class DinerMenuIterator implements Iterador {
  MenuItem[] items;
  int position = 0;
  int salto=1;
 
  public DinerMenuIterator(MenuItem[] items){
    this.items = items;
  }
  @Override
  public Object next(){
      
    MenuItem menuItem = items[position];
    position = position;
    leap();
    return menuItem;
  }
  @Override
    public boolean hasNext(){
    if(position >= items.length || items[position] == null){
      return false;
    }else{
      return true;
    }
  }
  //@Override
    public void remove(){
  }
    public void leap(){
      position += salto;
	}
  @Override
  public void salto(int salto){
    this.salto=salto;
  }
}

   
    



//HACER UNA INTERFACE ITERADOR Y METODS NETX HASNEXT Y FIJAR POSICION O PRIMERO