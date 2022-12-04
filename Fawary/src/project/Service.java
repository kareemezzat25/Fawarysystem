package SW;

public abstract class Service {
    Payment p;
    public Payment setPayment (Payment p) {
        this.p=p;
        return p;
    }
    public void Pay(double amount){
        p.setAmount(amount);
        p.paymentDetails();
    }

}

