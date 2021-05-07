
import depots.Depot;
import factory.DepotFactory;


public class Client {
    
    
     public static void main(String[] args) {
         
         // creating one depot for A
          Depot depotFromA = DepotFactory.getDepot("A");
          System.out.println(depotFromA);
          
          
         
//         // creating factory instance
//        Factory factory = new Factory();
//                 
//        // creating first depot list
//         Depot[] depotsFromA = new Depot[50];
//         depotsFromA = factory.populateDepots(depotsFromA);
//         
//         // creating second depot list
//         Depot[] depotsFromB = new Depot[50];
//         depotsFromB = factory.populateDepots(depotsFromB);
//         
//         // creating third depot list
//         //Depot[] depotsFromC = new Depot[50];
//         
//         // creating companies
//         Company A = new Company("A", depotsFromA);
//         Company B = new Company("B", depotsFromB);
         
         
     }
}
