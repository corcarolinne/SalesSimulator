package chain;


import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;


public interface TransactionLink {
    
    // methods
    void setNextLink(TransactionLink nextLink);
    void checker(Depot buyerDepot, Depot sellerDepot);
    
}
