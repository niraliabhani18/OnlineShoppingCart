package main;

public class Order implements Comparable<Order>{

	private int quantity;
	private Product product;
	
	public Order() {
		this.quantity=0;
		product=new Product();
	}
	public Order(int quantity, Product product) {
		this.quantity=quantity;
		this.product=product;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void increaseQuanity() {
		this.quantity=this.quantity + 1;
	}
	public void decreaseQuanity() {
		this.quantity=this.quantity - 1;
	}
	public int getCost() {
		int cost= product.getUnitPrice() * this.quantity;
		return cost;
	}
	@Override
	public String toString() {
        return this.getClass().getName() + "[" +product + "Quantity=" + quantity +  "]";
    } 
	
	@Override
	public int compareTo(Order other) {
		int result = this.product.compareTo(other.product);
		if (result == 0) {
				result = Integer.compare(this.quantity, other.quantity);
			}
		return result;
	}
	@Override 
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Order other = (Order) obj;// cast to a TaxiJourney object
		return this.product.equals(other.product) && this.quantity==other.quantity;

	}
}
