
public class CashPayment implements Payment {
    private double amount;

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount=amount;

    }

    @Override
    public void paymentDetails() {
        System.out.println("amount of payment"+amount);

    }
}