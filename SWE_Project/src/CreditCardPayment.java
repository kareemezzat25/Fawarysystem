public class CreditCardPayment implements Payment{
    private String creditcardnum;
    private double wallet;
    private double amount;

    public void setWallet(double wallet){
        this.wallet=wallet;
    }
    public double payfromWallet(double amount){
        double x;
        x=wallet-amount;
        return x;
    }
    public void setCreditCardPayment(double amount,String creditcardnum) {
        this.amount=amount;
        this.creditcardnum=creditcardnum;
    }
    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount=amount;

    }

    @Override

    public void paymentDetails () {
        System.out.println("the payment amount="+this.amount);
        System.out.println("by the card="+this.creditcardnum);

    }

}

