
package dealershipproject;


public class Car implements Comparable<Car>{
    
    //Data members
    private int year;
    private String make;
    private double price; 
    private int mileage;   
    private long VIN; 
    
    public Car(){
        
    }
    
    public Car(int Year, String Make, long VinNumber) {
        year = Year; 
        make = Make;
        VIN = VinNumber; 
    }
    
    public Car(int Year, String Make, long VinNumber, double carPrice, int Mileage) {
        year = Year; 
        make = Make;
        VIN = VinNumber; 
        price = carPrice;
        mileage = Mileage; 
    }
    
    public void setPrice(double carPrice){
        price = carPrice; 
    }
    
    public double getPrice(){
        return  price; 
    }
    
    public void setMileage(int CarMileage) {
        mileage = CarMileage;
    }
    
    public void getCarInfo()
    {
        System.out.printf("A %d %s with %d miles (VIN: %d). Price: $%f\n", year, make, mileage, VIN, price); 
    }
    
    public int compareTo(Car other){
    
      
        if(make.compareTo(other.make) == 0)
            if(Integer.compare(year, other.year) == 0)
                return Integer.compare(mileage, other.mileage);
            else 
                return Integer.compare(year, other.year);
        else 
            return make.compareTo(other.make); 
        
        
    }
   
        
}
