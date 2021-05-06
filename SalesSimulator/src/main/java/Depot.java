 import java.util.Random;
 
class Depot {
    
    // properties
    int nativeProductStock;
    int externalProductStock1;
    int externalProductStock2;
    int productPrice;
    int deliveryPrice;
    int budget;
    Random rand = new Random();

    // constructor - all these parameters are required everytime a depot is created
    // random numbers will be created for each property
    public Depot() {    
        this.nativeProductStock = rand.nextInt(51-15) + 15;
        this.externalProductStock1 = rand.nextInt(41-3) + 3;
        this.externalProductStock2 = rand.nextInt(41-3) + 3;
        this.budget = rand.nextInt(101-50) + 50;
        this.productPrice = rand.nextInt(11-1) + 1;
        this.deliveryPrice = rand.nextInt(11-1) + 1;
    }
    
    // getters and setters

    public int getNativeProductStock() {
        return nativeProductStock;
    }

    public void setNativeProductStock(int nativeProductStock) {
        this.nativeProductStock = nativeProductStock;
    }

    public int getExternalProductStock1() {
        return externalProductStock1;
    }

    public void setExternalProductStock1(int externalProductStock1) {
        this.externalProductStock1 = externalProductStock1;
    }

    public int getExternalProductStock2() {
        return externalProductStock2;
    }

    public void setExternalProductStock2(int externalProductStock2) {
        this.externalProductStock2 = externalProductStock2;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Depot{" + "nativeProductStock=" + nativeProductStock + ", externalProductStock1=" + externalProductStock1 + ", externalProductStock2=" + externalProductStock2 + ", productPrice=" + productPrice + ", deliveryPrice=" + deliveryPrice + ", budget=" + budget + '}';
    }
    
    
}
