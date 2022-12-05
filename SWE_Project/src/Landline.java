public class Landline extends Service {
    Receipt receipt;
    
    public void setReceipt(Receipts receiptType, double amount) {
    	switch (receiptType) {
	    	case QUARTER:{
	    		receipt = new QuarterReceipt();
	    	}
	    	case MONTHLY:{
	    		receipt = new MonthlyReceipt();
	    	}
    	}
    	Pay(amount, p);
    }
    
    public Payment setPayment(PaymentMethods paymentMethod){
    	
    	switch(paymentMethod) {
	    	case CREDIT_CARD:{
	    		p = setPayment(new CreditCardPayment());
	    	}
	    	case CASH:{
	    		p = setPayment(new CashPayment());
	    	}
    	}
        return p;
    }
    public void Pay(double amount,Payment p){
        p.setAmount(amount);
        p.paymentDetails();
    }


}
