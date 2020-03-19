package ThirdChapter.examples;

public class Account {
    private long id;
    private double amount;

    public Account() {
        super();
    }

    public Account(long id) {
        super();

        this.id = id;
    }

    public Account(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void addAmount(double amount) {
        this.amount += amount;
    }

    public String createName(String newName){
        String name = newName;
        return name;
    }

}