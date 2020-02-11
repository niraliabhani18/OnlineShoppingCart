package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Order>{

	private String cartId;
	Customer customer;
	Date date;
	List <Order> orderList;
	
	public Cart() {
		this.cartId="";
		customer=new Customer();
		date=new Date();
		orderList= new ArrayList<>();
	}
	
	public Cart(String cartId,Date date, Customer customer) {
		this.cartId=cartId;
		this.date=date;
		this.customer=customer;
		orderList= new ArrayList<Order>();
	}
	
	
	public String getCartId() {
		return cartId;
	}


	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
	/**Returns a string containing the list of orders data. */
    @Override
    public String toString() {
        return "CartList:[CartID=" + getCartId() + ", OrderList=" + orderList + "]";
    }
    public String getTrackListings() {
    	String s = "CartList: " + this.cartId + "\n";
        
        for (int i = 0; i < orderList.size(); i++) {
            s = s + (i+1) + "\t" + orderList.get(i).toString() + "\n";
            System.out.println("");
         
        }
        return s;       
    }
	public void addOrder(Order o) {
		orderList.add(o);
	}

	public void removeOrder(Order o) {
		orderList.remove(o);
		       
	}
	public int size() {
		return orderList.size();
	}
	public boolean containsOrder(Order o) {
		//using for-each loop
    	boolean exists = false;

    	for (Order order : orderList) {
    		if (order.equals(o)) {
    			exists = true;
    		}
    	}

    	return exists;

	}
	
	/** Returns the song at index i.
     * @return The song at index i, provided &le; i &lt; 
     * number of songs. Otherwise returns null.*/
    public Order findOrder(String productCode) {
    	
    	for (Order o :orderList) {
           if(o.getProduct().getProductCode().equalsIgnoreCase(productCode)) {
            	return o;
            }
    	}
           Order o= null;  // o is out of range
         return o;
    }
   
    public int getTotalCost() {
    	int i=0;
    	for (Order o :orderList) {
             i=o.getCost()+i;
    	}
    	return i;
    	
    }
    public Order getOrder(int pos) {
		return orderList.get(pos);
	}
	 public void sortOrders() {
		 orderList.sort(Comparator.naturalOrder());
	 }
	
	 public void sortOrders(Comparator<Order> comparator) {
	    	orderList.sort(comparator); 
	    	
	}
	 
	@Override
	public Iterator<Order> iterator() {
		// TODO Auto-generated method stub
		return orderList.iterator();
	}


}
