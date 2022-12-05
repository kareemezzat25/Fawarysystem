public class ServiceCreator {
	
	public Service createService(Services serviceType) {
		Service service = null;
		
		switch (serviceType) {
			case MOBILE_RECHARGE:{
				service = new MobileRecharge();
			}
			
			case INTERNET_PAYMENT:{
				service = new InternetPayment();
			}
			
			case LANDLINE:{
				service = new Landline();
			}
			
			case DONATIONS:{
				service = new Donations();
			}
		}
		
		return service;
	}
}