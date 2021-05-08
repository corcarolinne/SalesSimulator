


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
    
    public static void main(String[] args) {
        
        FileAccess data = FileAccess.getInstance();
        
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
    
}
