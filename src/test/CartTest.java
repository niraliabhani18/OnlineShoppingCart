package test;

import main.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;

public class CartTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Cart cartList = new Cart("1a",new Date(5,5,2013),new Customer("1",new Name("Tom", "Ford")));
		cartList.addOrder(new Order(1,new Product("1a","kidswear",500)));
		cartList.addOrder(new Order(2,new DiscountProduct("1b","Womenswear",500,0.5)));
		cartList.addOrder(new Order(3,new Product("2a","menswear",500)));
		cartList.addOrder(new Order(4,new DiscountProduct("3a","Cosmetics",500,0.5)));
		 //using a printWriter to generate the output to a file 
		PrintWriter out = new PrintWriter("main.Cart.txt");//creating the object of printWriter
		out.println("Outputting to a file...");
		out.println("");
		out.println("");
		out.println("==================================================================================================================");

		System.out.println("All Orders data...\n" + cartList.toString() + "\n");
		out.println("All Orders data...\n" + cartList.toString() + "\n");
		out.println("");
		out.println("");
		out.println("==================================================================================================================");
		System.out.println("List of Orders:");
		out.println("List of Orders:");
		//for (int i=0;i < cartList.size(); i++)
			for (Order track : cartList){		
			System.out.println("main.Product Code:" + track.getProduct().getProductCode());
			out.println("main.Product Code:" + track.getProduct().getProductCode());
			System.out.println("Quantity" + track.getQuantity());
			out.println("Quantity" + track.getQuantity());
			System.out.println("Quantity Cost of product" + track.getCost());
			out.println("Quantity Cost of product" + track.getCost());
		}
		
		System.out.println("====================");
		out.println("====================");
		
		System.out.println("Number of Items: " + cartList.size());
		out.println("Number of Items: " + cartList.size());
		System.out.println("Total Cost: " + cartList.getTotalCost());
		out.println("Total Cost: " + cartList.getTotalCost());
		
		out.println("");
		out.println("");
		out.println("==================================================================================================================");
		cartList.sortOrders();
		System.out.println("After sorting order: " );
		System.out.println(cartList.getTrackListings());
		out.println("After sorting order: " );
		out.println(cartList.getTrackListings());
		
		out.println("");
		out.println("");
		out.println("==================================================================================================================");
		cartList.sortOrders(Comparator
				.comparing(Order::getCost)
				    			.thenComparing(Order::getProduct,Comparator.reverseOrder()));
		System.out.println("After sorting using custom comparator");
		System.out.println(cartList.getTrackListings());
		

		out.println("After sorting using custom comparator");
		out.println(cartList.getTrackListings());
		
		out.println("");
		out.println("");
		out.println("==================================================================================================================");
        Order o1=new Order(5,new Product("3b","Grocery",500));
       System.out.print("Adding new main.Order....");
       out.print("Adding new main.Order..........");
       
        cartList.addOrder(o1);
        boolean x=cartList.containsOrder(o1);
        System.out.println("Check containsOrder method");
        out.println("Check containsOrder method");
        System.out.println("Is new order added o1 present in the list: "+ x); 
        out.println("Is new order added o1 present in the list: "+ x); 
        
        System.out.println(cartList.getTrackListings()); 
        out.println(cartList.getTrackListings()); 
      //remove a main.Order
        System.out.println("List after implementing Remove order method");
        out.println("List after implementing Remove order method");
        
        cartList.removeOrder(o1);
        System.out.println(cartList.getTrackListings()); 
        out.println(cartList.getTrackListings()); 
     
        out.println("");
		out.println("");
		out.println("==================================================================================================================");
        System.out.println("Implementing find order method for productcode 1b");
        out.println("Implementing find order method");
        Order n1=cartList.findOrder("1b");
        System.out.println(n1.toString());
        out.println(n1.toString());
		
        out.println("");
		out.println("");
		out.println("==================================================================================================================");
        System.out.println("Implementing getOrder method of cart at index 1");
        System.out.println("get order at index 1:" + cartList.getOrder(1).toString());
        out.println("get order at index 1:" + cartList.getOrder(1).toString());
        
        
        out.println("");
		out.println("");
		out.println("==================================================================================================================");
        System.out.println("Implementing increase quantity method of order at index 1");
        cartList.getOrder(1).increaseQuanity();
        System.out.println("New Quantity at index 1:"+ cartList.getOrder(1).getQuantity());
        out.println("New Quantity at index 1:" + cartList.getOrder(1).getQuantity());
        
        System.out.println("Implementing decrease quantity method of order at index 1");
        cartList.getOrder(1).decreaseQuanity();
        System.out.println("New Quantity at index 1:"+ cartList.getOrder(1).getQuantity());
        out.println("New Quantity at index 1:" + cartList.getOrder(1).getQuantity());
        
        out.close();
        
	}

}
