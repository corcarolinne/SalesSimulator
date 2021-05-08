
import depots.Depot;


public interface TransactionLink {
    
    // methods
    void setNextLink(TransactionLink nextLink);
    void checker(Depot[] buyerDepots, Depot[] sellerDepots);
}
