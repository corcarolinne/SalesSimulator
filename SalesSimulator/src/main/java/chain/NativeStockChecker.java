package chain;


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
           // System.out.println("Depot " + sellerDepot.getCompany() + sellerDepot.getDepotNumber() + " native stock validated");
           // next link will check native depot from seller
           nextLink.checker(buyerDepot, sellerDepot);       
        }
        else {
            System.out.println("Not enough Native Stock on Seller. Purchased not authorized.");
        }
        
        
    }
     
}
