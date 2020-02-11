package main;

public class Customer {

	private String customerId;
	private Name customerName;
	
	public Customer() {
		this.customerId="";
		customerName=new Name();
	}
	public Customer(String customerId,Name name){
		this.customerId=customerId;
		this.customerName=name;
		}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Name getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}
	
	}
