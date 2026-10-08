import java.util.*;
class BankAccount
{
    String accountNumber, accountHolderName;
    double balance;

    BankAccount(String n, String h, double b)
    {
        accountNumber = n;
        accountHolderName = h;
        balance = b;
    }
    void deposit(double a ){balance += a;}
    void withdraw(double a)
    {
        if(a <= balance) balance -= a;
        else System.out.println("Insufficient balance");

    }
    double checkbalance() { return balance; }
    void displayAccount()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class MainHac
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Account Number: ");
        String n = scanner.nextLine();
        System.out.println("Account Holder: ");
        String h = scanner.nextLine();
        System.out.println("Initial Balance: ");
        double b = scanner.nextDouble();

        BankAccount a = new BankAccount(n,h,b);
        System.out.println("Deposit: ");
        a.deposit(scanner.nextDouble());
        System.out.println("Withdraw: ");
        a.withdraw(scanner.nextDouble());
        a.displayAccount();

        scanner.close();
    }    
    
}