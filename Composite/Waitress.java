package menu2;
import java.util.Iterator;

public class Waitress {
	private MenuComponent allMenus;
        
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
                
	}
  
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
        public void printcosto() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
                        double total=0;
		System.out.println("costo");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
                            
                            total+=menuComponent.getPrice();
                         // System.out.println(total);
				
			} catch (UnsupportedOperationException e) {}
		}
                System.out.println("Costo total de todo el menu: $ "+total);
	}
        
}
