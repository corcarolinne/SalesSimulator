
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
    public void checker(Depot buyerDepot, Depot sellerDepot) {
        
        // saving total cost
        int totalCost = sellerDepot.getProductPrice() + sellerDepot.getDeliveryPrice();

        // comparing cost and budget
        if(totalCost <= buyerDepot.getBudget()){

        // printing
        String buyer = "Company:A: Depot:" + buyerDepot.getDepotNumber();
        String seller = "Company:B Depot:" + sellerDepot.getDepotNumber();
        System.out.println(buyer + " bought from " + seller);

        // go to next link
        //nextLink.checker(buyerDepot, sellerDepot);

        // if budget is not enough
        } else {
            System.out.println("purchased NOT authorized");
        }
            
    }

}