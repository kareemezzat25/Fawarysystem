
public class Discount extends Provider {
	int discountPercentage ;
	double  price;
	public double valcDiscount (double price , int discountPercentage) {
		amount = ( discountPercentage * price )/100;
		return amount ;
	}
}
