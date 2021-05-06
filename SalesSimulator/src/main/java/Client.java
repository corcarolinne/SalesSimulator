
public class Client {
    
    
     public static void main(String[] args) {
         
         // creating first depot list
         Depot[] depotsFromA = new Depot[50];
         
         
         // populating list with depots
         for(int i=0; i < depotsFromA.length; i++) {
             depotsFromA[i] = new Depot();
             System.out.println(depotsFromA[i]);
         }
         
         // creating first company
         Company A = new Company("A", depotsFromA);
         
         // testing
         
         
         
     }
}
