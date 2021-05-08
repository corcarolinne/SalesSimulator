
import depots.Depot;

public class SellerChecker implements TransactionLink {

    TransactionLink nextLink;
   
     @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void checker(Depot[] buyerDepot, Depot[] sellerDepot) {

        for(int i=0; i < sellerDepot.length; i++) {
             if(sellerDepot[i].getNativeProductStock() >= 15){
                System.out.println("native stock validated");
                // set next link to receive same depot
                // next link will check native depot from seller
                //nextLink.checker(buyerDepot);       
             }
             else {
                 System.out.println("invalid nat stock");
             }
        }
        
    }
     
}

