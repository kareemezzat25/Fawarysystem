package SW;

public class InternetPaymentCreator extends ServiceCreator{
    public Service createService() {
        return new InternetPayment();
    }
}
