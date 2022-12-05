public class QuarterReceipt implements Receipt {
    private String name;

    @Override
    public void makeReceipt() {
        this.name="Quarter Receipt";
        System.out.println(name);
    }

}
