package rental;
import rental.vehicle.Vehicle;
import java.util.*;


public class AndFilter implements VehicleFilter {

   private List<VehicleFilter> theFilters;

   /** creates an InterFilter with no filter */
   public AndFilter() {
      this.theFilters= new ArrayList<VehicleFilter>();
   }

   /**
    * adds a new filter
    * 
    * @param f the added filter
    */
   public void addFilter(VehicleFilter f) {
      this.theFilters.add(f);
   }

   /**
    * Accept the vehicle if each of its filters accepts it
    * 
    * @see VehicleFilter#accept(Vehicle)
    */
   public boolean accept(Vehicle v) {
      for(VehicleFilter filters : this.theFilters){
         if (!filters.accept(v))
          return false;
       }
      return true;
   }
}
