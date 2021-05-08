package depots;
import factory.DepotFactory;
import java.util.Random;

// DepotA is a depot beloging to Company A; it extends the class Depot 
public class DepotA extends Depot {
    
    Random rand = new Random();

    public DepotA(String company, int depotNumber) {
        this.company = company;
        this.depotNumber = depotNumber;
        this.nativeProductStock = rand.nextInt(51-15) + 15;
        this.externalProductStock1 = rand.nextInt(41-3) + 3;
        this.externalProductStock2 = rand.nextInt(41-3) + 3;
        this.budget = rand.nextInt(101-50) + 50;
        this.productPrice = rand.nextInt(11-1) + 1;
        this.deliveryPrice = rand.nextInt(11-1) + 1;
    }
    
    // methods implemented to be used only in this depot
 
    @Override
    public String toString() {
        return "Depot{" + "company=" + company + ", depotNumber=" + depotNumber + ", nativeProductStock=" + nativeProductStock + ", externalProductStock1=" + externalProductStock1 + ", externalProductStock2=" + externalProductStock2 + ", productPrice=" + productPrice + ", deliveryPrice=" + deliveryPrice + ", budget=" + budget + '}';
    }
}
