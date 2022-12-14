
package dealershipproject;

import java.util.ArrayList;
import java.util.Collections;

public class Dealership {
    
    private ArrayList<Car> parkingLot = new ArrayList<>(); 
    private double markup; 

    public void setMarkup(double markup) {
        this.markup = markup;
    }
   
    public void addCar(Car newCar){
        parkingLot.add(newCar); 
    }
    
    public void applyMarkup()
    {
        double adjustedPrice; 
        for(Car c: parkingLot)
        {
            adjustedPrice = c.getPrice() +  c.getPrice() * markup; 
            c.setPrice(adjustedPrice);
        }
            
    }
    
    public void listInventory()
    {
        Collections.sort(parkingLot);
        
        System.out.println("--------------------------------");
        for(Car c: parkingLot)
            c.getCarInfo();
    }
}
