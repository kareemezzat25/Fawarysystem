package project;

public class QuarterReceipt implements Receipt {
    private String name;

    public void makeReceipt() {
        this.name="Quarter Receipt";
        System.out.println(name);
    }

}