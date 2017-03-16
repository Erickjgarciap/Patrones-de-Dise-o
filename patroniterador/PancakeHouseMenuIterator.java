/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Ericko
 */
public class PancakeHouseMenuIterator implements Iterador{
  int position = 0;
  int salto=1;
  ArrayList l;
  public PancakeHouseMenuIterator(ArrayList l){
    this.l = l;
  }
 @Override
    public boolean hasNext() {
        return position<l.size() ;
    }
   @Override
    public Object next() {
    if( !hasNext()) throw new NoSuchElementException("No more items");
    Object  list = l.get(position);
    leap();
    return list;
    }
  
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
