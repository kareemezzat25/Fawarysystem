package project;

public class CashPayment implements Payment {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount=amount;

    }

    public void paymentDetails() {
        System.out.println("amount of payment"+amount);

    }
}


