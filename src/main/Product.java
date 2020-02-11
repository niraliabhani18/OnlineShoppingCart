package main;

public class Product implements Comparable<Product>{
	
//fields
private String productCode;
private String description;
private int unitPrice; //(pence)

public Product() {
	productCode="";
	description="";
	unitPrice=0;
}

public Product(String productCode,String description,int unitPrice) {
	this.productCode=productCode;
	this.description=description;
	this.unitPrice=unitPrice;
}

public String getProductCode() {
	return productCode;
}

public void setProductCode(String productCode) {
	this.productCode = productCode;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(int unitPrice) {
	this.unitPrice = unitPrice;
}

@Override
public String toString() {
    return "main.Product:[ProductCode=" + productCode + ", ProductDesc=" + description + ", UnitPrice=" + unitPrice +  "]";
} 

@Override
public int compareTo(Product other) {
		int result = this.productCode.compareTo(other.productCode);

		if (result == 0) {
		result = this.description.compareTo(other.description);

		if (result == 0) {
			result = Integer.compare(this.unitPrice, other.unitPrice);
		}
		}		
		return result;
		
	}
	@Override 
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Product other = (Product) obj;// cast to a TaxiJourney object
		return this.productCode.equals(other.productCode) && this.description.equals(other.description) && this.unitPrice==other.unitPrice;

	}
}

