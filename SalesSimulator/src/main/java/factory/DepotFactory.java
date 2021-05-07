package factory;


import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;


// this class is the depot factory
public class DepotFactory {

    // this method will receive the properties of the depot and return the depot according to it
    public static Depot getDepot(int numberOfDepot, String company) {
        if (company.equals("A")) {
            return new DepotA(numberOfDepot);
        } else if (company.equals("B")) {
            return new DepotB(numberOfDepot);
        } else if (company.equals("C")) {
            return new DepotC(numberOfDepot);
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