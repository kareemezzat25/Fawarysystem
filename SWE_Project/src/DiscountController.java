import java.util.Vector;

public class DiscountController {
	Vector<Services> discountedServices = new Vector<Services>();
	int discountPercentage = 0;
	static DiscountController discountController = null;
	

	// Singleton Design Pattern Method
	public static DiscountController getInstance() {
		if(discountController == null) {
			discountController = new DiscountController();
		}
		return discountController;
	}
	
	
	
	// Setters Methods
	public void addDiscountedService(Services service) {
		discountedServices.add(service);
	}
	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public void removeFromDiscounted(Services service) {
		discountedServices.remove(service);
	}
	
	// Getters Methods
	public Vector<Services> getDiscountedServices() {
		return discountedServices;
	}
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	public boolean isDiscounted(Services service) {
		return discountedServices.contains(service);
	}
	
	
}
