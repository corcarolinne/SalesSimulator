
import depots.Depot;
import factory.DepotFactory;
import java.util.Arrays;
import java.util.Scanner;


public class Client {
 
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
        data.writeFile(depotsFromA, depotsFromB, depotsFromC);
        //data.readFile();
        
        // initializing the chain of responsability
        TransactionLink t1 = new ExternalStockChecker();
        TransactionLink t2 = new NativeStockChecker();
        TransactionLink t3 = new PriceChecker();

        // set the chain of responsibility
        t1.setNextLink(t2);
        t2.setNextLink(t3);
        //t3.setNextLink(t2);
        
        // starting chain
        t1.checker(depotsFromA, depotsFromB);
        
        
    
     }
     
     private static Depot[] populateDepots(Depot[] depots, String companyName) {
        
        for(int i=0; i < depots.length; i++) {
             depots[i] = DepotFactory.getDepot(companyName, i);      
         }
         return depots; 
         
    }
     
//     private static void checkExternalProductStock(Depot[] buyers) {
//        
//        for(int i=0; i < buyers.length; i++) {
//             if(buyers[i].getExternalProductStock1() <= 40){
//                 checkBuyerNativeStock(Depot[]);
//             }
//                 
//        }
//         
//    }

    
}
