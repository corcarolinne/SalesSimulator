


import singleton.FileAccess;
import chain.PriceChecker;
import chain.ExternalStockChecker;
import chain.TransactionLink;
import chain.NativeStockChecker;
import depots.Depot;
import factory.DepotFactory;
import java.util.Arrays;
import java.util.Scanner;


public class Client {

    private static TransactionLink t1 = new ExternalStockChecker();
    private static FileAccess data = FileAccess.getInstance();
    
    public static void main(String[] args) {
        
        //FileAccess data = FileAccess.getInstance();
        
        // creating depot list for Company A
        Depot[] depotsFromA = new Depot[2];
        depotsFromA = populateDepots(depotsFromA, "A");
        
         // creating depot list for Company B
        Depot[] depotsFromB = new Depot[2];
        depotsFromB = populateDepots(depotsFromB, "B");
       
         // creating depot list for Company C
        Depot[] depotsFromC = new Depot[2];
        depotsFromC = populateDepots(depotsFromC, "C");
        
        // calling methods to write and read file
        data.writeDepots(depotsFromA, depotsFromB, depotsFromC);
        //data.readFile();
        
        // initializing the chain of responsability
        //TransactionLink t1 = new ExternalStockChecker();
        TransactionLink t2 = new NativeStockChecker();
        TransactionLink t3 = new PriceChecker();

        // set the chain of responsibility
        t1.setNextLink(t2);
        t2.setNextLink(t3);
        
        // calling method to make transactions
        makeTransactions(depotsFromA, depotsFromB);
        makeTransactions(depotsFromA, depotsFromC);
        makeTransactions(depotsFromB, depotsFromC);
        
        // display user menu
        displayUserMenu();
        
        
    }
    
    private static Depot[] populateDepots(Depot[] depots, String companyName) {
        
        for(int i=0; i < depots.length; i++) {
             depots[i] = DepotFactory.getDepot(companyName, i);      
         }
         return depots; 
         
    }
    
    private static void makeTransactions(Depot[] buyersDepots, Depot[] sellerDepots) {
        
        // looping thru buyerDepots
        for(int i=0; i < buyersDepots.length; i++) {
          
            // looping thru seller depot
            for(int j=0; j < sellerDepots.length; j++) {
                // starting chain
                // initializing the chain of responsability
                t1.checker(buyersDepots[i], sellerDepots[j]);
            }
        }    
    }
    
    private static void displayUserMenu() {

        // show menu
        System.out.println("Please select an action:");
        System.out.println("1 - Show all transactions");
        System.out.println("2 - Show transactions for a company");
        System.out.println("3 - Show details for a company");
        
        // read answer
        Scanner s1 = new Scanner(System.in);
        String choice = s1.nextLine();
        
        if(choice.equals("1")) {
            
            // call method to read all transactions from file
            
            
        
        } else if(choice.equals("2")) {
            
            // display second menu
            System.out.println("1 - Show Transactions for Company A");
            System.out.println("2 - Show Transactions for Company B");
            System.out.println("3 - Show Transactions for Company C");
            
            // read answer
            Scanner s2 = new Scanner(System.in);
            String choice2 = s2.nextLine();
            
            if(choice2.equals("1")) {
            
                // call method to read transactions for company A

            } else if (choice2.equals("2")) {
                // call method to read transactions for company B
            } else if (choice2.equals("3")) {
                // call method to read transactions for company C
            } else {
                System.out.println("Please enter ");
            }
            
        } else if(choice.equals("3")) {
            // basically same as above
        }
        
    }
    
}
