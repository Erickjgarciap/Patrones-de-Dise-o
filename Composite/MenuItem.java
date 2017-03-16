package menu2;
import java.util.Iterator;

public class MenuItem extends MenuComponent {
 
	String name;
	String description;
	boolean vegetarian;
	double price;
        int ni;
        int totalmenu;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price,int ni) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
                this.ni=ni;
                
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
        }
	public double getPrice() {
		return price;
	}
	public int getNi() {
		return ni;
	}
       
	public boolean isVegetarian() {
		return vegetarian;
	}
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
        
       
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
               System.out.println("a pagar" +  getPrice()*ni);
              
	}
        public void printcosto(){
        
        
        }

}

