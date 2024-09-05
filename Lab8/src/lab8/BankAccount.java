package lab8;

public class BankAccount {

    private int id;
    private String name;
    private double amount;

    public BankAccount(int accountID, String accountHolder, double amount) {
        this.id = accountID;
        this.name = accountHolder;
        this.amount = amount;
    }

    public void depodite(double amount) {
        this.amount = this.amount + amount;
        System.out.println("Your Current Cash : " + this.amount);
    }

    public void withDraw(double amount) {
        if (amount <= this.amount) {
            this.amount = this.amount - amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Your Current Cash is : " + this.amount);
        } else {
            System.out.println("Sorry , You Have No Enough Cash ..!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }
}
