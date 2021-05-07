
import depots.Depot;
import factory.DepotFactory;
import java.util.Arrays;


public class Client {
 
    public static void main(String[] args) {
        
        FileAccess data = FileAccess.getInstance();
   
        // creating depot list for Company A
        Depot[] depotsFromA = new Depot[50];
        depotsFromA = populateDepots(depotsFromA, "A");
        
         // creating depot list for Company A
        Depot[] depotsFromB = new Depot[50];
        depotsFromB = populateDepots(depotsFromB, "B");
        //data.writeFile(depotsFromB);
        //data.readFile();
        
         // creating depot list for Company A
        Depot[] depotsFromC = new Depot[50];
        depotsFromC = populateDepots(depotsFromC, "C");
        //data.writeFile(depotsFromC);
        //data.readFile();
        
        // calling methods to write and read file
        data.writeFile(depotsFromA, depotsFromB, depotsFromC);
        data.readFile();
    
     }
     
     private static Depot[] populateDepots(Depot[] depots, String companyName) {
        
        for(int i=0; i < depots.length; i++) {
             depots[i] = DepotFactory.getDepot(i, companyName);      
         }
         return depots; 
         
    }

    
}
