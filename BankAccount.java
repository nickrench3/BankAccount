import java.util.*;

public class BankAccount{
    private String firstName;
    private String lastName;
    private int accountNumber;
    private String password;
    private String userName;
    private double balance;
    Scanner scanner = new Scanner(System.in);
    
    public BankAccount(double balance, String password, String userName) {
        this.balance = balance;
        this.password = password;
        this.userName = userName;
    }
    
    public BankAccount(String firstName, String lastName, int accountNumber, 
        double balance, String password, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
        this.userName = userName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double deposit() {
        double deposit;
        System.out.print("Enter deposit amount: ");
        deposit = scanner.nextDouble();
        this.balance = this.balance + deposit;
        return this.balance;
    }
    
    public boolean isOverDraft() {
        if(this.balance > 0) 
            return true;
        else
            return false;
    }
   
    public double withdraw() {
        double withdraw;
        System.out.print("Enter withdraw amount: ");
        withdraw = scanner.nextDouble();
        while(withdraw > this.balance){
            System.out.print("Invalid amount please re enter: ");
            withdraw = scanner.nextDouble();
        }
        this.balance = this.balance - withdraw;
        return this.balance;
    }
   
    public double checkBalance() {
        return this.balance;
    }
    
}

