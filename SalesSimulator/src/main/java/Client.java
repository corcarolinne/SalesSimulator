
import depots.Depot;
import factory.DepotFactory;
import java.util.Arrays;
import java.util.Scanner;


public class Client {
 
    public static void main(String[] args) {
        
        FileAccess data = FileAccess.getInstance();
   
        // creating depot list for Company A
        Depot[] depotsFromA = new Depot[50];
        depotsFromA = populateDepots(depotsFromA, "A");
        
         // creating depot list for Company B
        Depot[] depotsFromB = new Depot[50];
        depotsFromB = populateDepots(depotsFromB, "B");
       
         // creating depot list for Company C
        Depot[] depotsFromC = new Depot[50];
        depotsFromC = populateDepots(depotsFromC, "C");
        
        
        // calling methods to write and read file
        data.writeFile(depotsFromA, depotsFromB, depotsFromC);
        //data.readFile();
        
        // initializing the chain of responsability
        TransactionLink t1 = new BuyerChecker();
        TransactionLink t2 = new SellerChecker();
        //TransactionLink t3 = new BuyerChecker();

        // set the chain of responsibility
        t1.setNextLink(t2);
        //t2.setNextLink(t3);
        
        // starting chain
        t1.checker(depotsFromA, depotsFromB);
        
        
    
     }
     
     private static Depot[] populateDepots(Depot[] depots, String companyName) {
        
        for(int i=0; i < depots.length; i++) {
             depots[i] = DepotFactory.getDepot(i, companyName);      
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
