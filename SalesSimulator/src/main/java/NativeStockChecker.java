
import depots.Depot;

public class NativeStockChecker implements TransactionLink {

    TransactionLink nextLink;
   
     @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void checker(Depot buyerDepot, Depot sellerDepot) {

        if(sellerDepot.getNativeProductStock() >= 15){
           System.out.println(sellerDepot.getDepotNumber() + " native stock validated");
           // set next link to receive same depot
           // next link will check native depot from seller
           nextLink.checker(buyerDepot, sellerDepot);       
        }
        else {
            System.out.println("invalid nat stock");
        }
        
        
    }
     
}
