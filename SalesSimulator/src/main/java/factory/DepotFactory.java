package factory;


import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;


// this class is the depot factory
public class DepotFactory {

    // this method will receive the properties of the depot and return the depot according to it
    public static Depot getDepot(String type) {
        if (type.equals("A")) {
            return new DepotA();
        } else if (type.equals("B")) {
            return new DepotB();
        } else if (type.equals("C")) {
            return new DepotC();
        } else {
            return null;
        }
    }

}


//    // creating first depot list
//     Depot[] depots = new Depot[50];
//         
//    // constructor
//    public Factory() {
//        this.depots = populateDepots(this.depots);
//    }
//    
//    public Depot[] populateDepots(Depot[] depots) {
//         // populating list with depots
//         for(int i=0; i < depots.length; i++) {
//             depots[i] = new Depot();
//             System.out.println(depots[i]);
//         }
//         return depots;
//     }
