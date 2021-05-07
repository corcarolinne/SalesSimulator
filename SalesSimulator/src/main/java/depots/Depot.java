package depots;

// abstract class
public abstract class Depot {
    
    // commom attributes for all depots
    int nativeProductStock;
    int externalProductStock1;
    int externalProductStock2;
    int productPrice;
    int deliveryPrice;
    int budget;
    
    
    // getters and setters - commom for all depots
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
}
