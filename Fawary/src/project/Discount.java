package project;

public class Discount extends Provider {
	int discountPercentage ;
	double  price;
	
	/*public double calcDiscount (double price , int discountPercentage) {
		amount = ( discountPercentage * price )/100;
		return amount ;
	}*/
	public double calcDiscount (String servicetype , int discountPercentage)
	{
	if(servicetype.equals("Mobile recharger"))
	{
		this.price=100;
		amount = ( discountPercentage * price )/100;
		return amount ;
	}
	else if(servicetype.equals("Internet payment"))
	{
		this.price=120;
		amount = ( discountPercentage * price )/100;
		return amount ;
		
	}
	return amount;
	}
}


