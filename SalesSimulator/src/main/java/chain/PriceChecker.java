package chain;


import chain.TransactionLink;
import depots.Depot;
import depots.DepotA;
import depots.DepotB;
import depots.DepotC;
import singleton.FileAccess;

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
            
            // subtracting total cost from buyer's budget
            buyerDepot.setBudget(buyerDepot.getBudget() - totalCost);
            
            // adding depot bought to buyer's external stock
            buyerDepot.setExternalProductStock1(buyerDepot.getExternalProductStock1() + 1);
            
            // subtracting native product stock from seller's stock
            sellerDepot.setNativeProductStock(sellerDepot.getNativeProductStock() - 1);
            
            // writing on file
            String buyer = "Depot " + buyerDepot.getCompany() + buyerDepot.getDepotNumber();
            String seller = "Depot " +  sellerDepot.getCompany() + sellerDepot.getDepotNumber();
            
            FileAccess data = FileAccess.getInstance();
            
            // to test
            //System.out.println(buyer + " bought from " + seller);
            
            // calling methods to write transactions on file
            data.writeTransactions(buyer + " bought from " + seller);

        // if budget is not enough
        } else {
            //"purchased NOT authorized";
        }   
            
    }

}