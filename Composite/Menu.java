package menu2;
import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
        int ne;
        double totalmenu=0;
        private double total;
        protected int numberOfElements;
        
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;                
	}
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
        if(menuComponent instanceof MenuItem){
                 numberOfElements++;
                 // System.out.println(""+menuComponent.getPrice());
                 total+=menuComponent.getPrice();
               
                 }       
	}
        public int getNumberOfElements(){
        return numberOfElements;
        }
        @Override
        public void totalmenu(){
          for(int x=0;x<menuComponents.size();x++) {
          totalmenu+=menuComponents.get(x).getPrice();
 
        }
        System.out.println("vdfvdvv"+totalmenu);
        }
        public double totalme(){
        return total;
        }
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
                //System.out.println("costo total del menu : $" + totalme() + "M/N");
		System.out.println("---------------------");
		Iterator <MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
                       //System.out.println("costo total del menu : $" + totalme() + "M/N");
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
                        menuComponent.printcosto();
                    }
         }
        @Override
        public void printcosto(){
        System.out.println();
        System.out.print("Costo total del menu : " +getName()+":$ " + totalme()+ " M/n");
        }
}
