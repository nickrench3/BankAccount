import java.util.*;

public class BankTest {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount(100.00, "nick", "nick");
        String selection = "";
        System.out.println("Operations are: ");
        System.out.println("-   \"Deposit\" or \"+\" for Deposit");
        System.out.println("-   \"Withdraw\" or \"-\" for withdraw"); 
        System.out.println("-   \"Balance\" for balance");
        System.out.println("-   \"Quit\" or \"q\" to quit");
        System.out.print("Enter your selection: ");
        selection = scanner.nextLine();
        while(!selection.equals("q") && !selection.equals("Quit")){
            switch(selection){
                case "Deposit":
                case "+": bank.deposit();
                          System.out.println("Balance is: " + bank.checkBalance());
                          break;
                case "Withdraw":
                case "-": bank.withdraw();
                          System.out.println("Balance is: " + bank.checkBalance());
                          break;
                case "Balance": System.out.println("Balance is: " + bank.checkBalance());
                                break;                   
            }
            System.out.println();
            System.out.println("Operations are: ");
            System.out.println("-   \"Deposit\" or \"+\" for Deposit");
            System.out.println("-   \"Withdraw\" or \"-\" for withdraw"); 
            System.out.println("-   \"Balance\" for balance");
            System.out.println("-   \"Quit\" or \"q\" to quit");
            System.out.print("Enter your selection: ");
            selection = scanner.nextLine();
        }
      
    }
}