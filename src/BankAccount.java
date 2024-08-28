public class BankAccount{
    private double balance;

    public BankAccount( double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }else{
            System.out.println("not enough cash stranger...");
        }
    }
    public void withdrawe(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.println("not enough cash stranger...");
        }
    }

    public void displayBalance(){
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args){
        BankAccount account = new BankAccount(2000);
        account.withdrawe(2000);
        account.displayBalance();

    }
}

