
import java.util.ArrayList;
import java.util.List;


public class Company {
    
    // properties - creating an array with 50 spaces for depots
    String name;
    Depot[] depots = new Depot[50];
    
    // constructor - company needs name and list of depots when it's created
    public Company(String name, Depot[] depots){
        this.name = name;
        this.depots = depots;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Depot[] getDepots() {
        return depots;
    }
    public void setDepots(Depot[] depots) {
        this.depots = depots;
    }

    @Override
    public String toString() {
        return "Company{" + "depots=" + depots + '}';
    }
    
}
