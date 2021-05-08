
import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;

public class PriceChecker implements TransactionLink {

    TransactionLink nextLink;
   
     @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void checker(Depot[] buyerDepot, Depot[] sellerDepot) {
        
        // looping thru buyer depot
        for(int i=0; i < buyerDepot.length; i++) {
            
            // looping thru seller depot
            for(int j=0; j < sellerDepot.length; j++) {
                // saving total cost
                int totalCost = sellerDepot[j].getProductPrice() + sellerDepot[j].getDeliveryPrice();
            
                // comparing cost and budget
                if(totalCost <= buyerDepot[i].getBudget()){

                // printing
                String buyer = "Company:A: Depot:" + buyerDepot[i].getDepotNumber();
                String seller = "Company:B Depot:" + sellerDepot[j].getDepotNumber();
                System.out.println(buyer + " bought from " + seller);
          
                // go to next link
                //nextLink.checker(buyerDepot, sellerDepot);
                
                // if budget is not enough
                } else {
                    System.out.println("purchased NOT authorized");
                }
            
            }
               
        }
    }

}