
import depots.Depot;

public class BuyerChecker implements TransactionLink {

    TransactionLink nextLink;
   
     @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void checker(Depot[] buyerDepot, Depot[] sellerDepot) {

        for(int i=0; i < buyerDepot.length; i++) {
             if(buyerDepot[i].getExternalProductStock1() <= 40){
                System.out.println("ext stock validated");
                // set next link to receive same depot
                // next link will check native depot from seller
                nextLink.checker(buyerDepot, sellerDepot);       
             }
             else {
                 System.out.println("ext stock validated");
             }
        }
        
    }
     
}

