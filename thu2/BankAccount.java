package thu2;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Không thể nạp số âm.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Không thể rút số âm.");
        } else if (amount > balance) {
            System.out.println("Số dư không đủ.");
        } else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Tùng", 500000);
        BankAccount a2 = new BankAccount("Hà", 300000);

        a1.withdraw(600000); // vượt quá
        a2.deposit(-100); // sai

        a1.deposit(200000);
        a1.withdraw(100000);

        System.out.println(a1.getOwnerName() + " - Số dư: " + a1.getBalance());
        System.out.println(a2.getOwnerName() + " - Số dư: " + a2.getBalance());

        // Không thể truy cập a1.balance vì nó là private
        // a1.balance = 1000000; // ❌ lỗi biên dịch
    }
}
