package main;

public class DiscountProduct extends Product{
	private double discountRate;//rate should be between 0 and 1.0,with 0.1 being 10% discount and 0.2 being 20% discount,etc.
	
	public DiscountProduct(){
		super();
		discountRate=0.0;   
	}
	public DiscountProduct(String productCode, String description,int unitPrice,double discountRate) {
		super(productCode,description,unitPrice);
		this.discountRate=discountRate;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	@Override
	public int getUnitPrice() {
		int discount=(int) (super.getUnitPrice()* discountRate);
		return super.getUnitPrice()-discount;
	}
	
	@Override
	public String toString() {
	    return "main.DiscountProduct:[ProductCode=" + getProductCode() + ", ProductDesc=" + getDescription() + ", UnitPrice=" + getUnitPrice() +  ", DiscountRate=" + getDiscountRate() + "]";
	} 
	@Override 
	public boolean equals(Object obj) {
		if (! super.equals(obj)) return false;
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		DiscountProduct other = (DiscountProduct) obj;// cast to a TaxiJourney object
		return this.discountRate==other.discountRate;

	}
	}
