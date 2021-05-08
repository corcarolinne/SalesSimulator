import depots.Depot;

public class ExternalStockChecker implements TransactionLink {

    TransactionLink nextLink;
   
     @Override
    public void setNextLink(TransactionLink nextLink) {
        this.nextLink = nextLink;
    }

    @Override
    public void checker(Depot buyerDepot, Depot sellerDepot) {

        if(buyerDepot.getExternalProductStock1() <= 40){
           System.out.println(buyerDepot.getDepotNumber()+ " external stock validated");
           // set next link to receive same depot
           // next link will check native depot from seller
           nextLink.checker(buyerDepot, sellerDepot);       
        }
        else {
            System.out.println("ext stock validated");
        }
        
    }
     
}