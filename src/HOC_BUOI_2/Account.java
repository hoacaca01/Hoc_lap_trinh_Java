package HOC_BUOI_2;

public class Account {
    int id;
    String name;
    int balance;
    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    void display() {
        System.out.println("STK:" + id +", TEN TK:" + name +", SO DU:" + balance);
    }
    private void deposit(int amount) {
        this.balance += amount;
        System.out.println("So du trong tai khoan la:"+ this.balance);
    }
    private void withdraw(int amount) {
        if(amount<= this.balance) {
            this.balance -= amount;
            System.out.println("so du con lai trong tai khoan:" + this.balance);
        }else {
            System.out.println("so du trong tai khoan khong du");
        }

    }
    public static void main(String[] args) {
        Account tk1 = new Account(10,"XUAN HOA");
        Account tk2 = new Account(101,"NGOC NGHIA", 10000);
        tk1.display();
        tk2.display();
        tk1.deposit(5000);
        tk2.withdraw(1000);
    }
}
