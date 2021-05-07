
import depots.Depot;
import factory.DepotFactory;


public class Client {
 
     public static void main(String[] args) {
          
        // creating depot list for Company A
        Depot[] depotsFromA = new Depot[50];
        depotsFromA = populateDepots(depotsFromA, "A");
        
         // creating depot list for Company A
        Depot[] depotsFromB = new Depot[50];
        depotsFromB = populateDepots(depotsFromB, "B");
        
         // creating depot list for Company A
        Depot[] depotsFromC = new Depot[50];
        depotsFromC = populateDepots(depotsFromC, "C");
              
//         // creating companies
//         Company A = new Company("A", depotsFromA);
//         Company B = new Company("B", depotsFromB);
         
         
     }

    private static Depot[] populateDepots(Depot[] depots, String companyName) {
        
        for(int i=0; i < depots.length; i++) {
             depots[i] = DepotFactory.getDepot(i, companyName);
             System.out.println(depots[i]);
         }
         return depots;
    }
}
