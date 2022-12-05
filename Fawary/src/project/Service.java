package project;

public abstract class Service {
	 	Payment p;
	    public Payment setPayment (Payment p) {
	        this.p=p;
	        return p;
	    }
	    public abstract void Pay(double amount,Payment py);

}
