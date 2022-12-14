
package dealershipproject;


public class DealershipProject {


    public static void main(String[] args) {
        
        Car c1 = new Car(2010, "Honda", 65322134); 
        Car c2 = new Car(2012, "BMW", 66123214);
        Car c3 = new Car(2020, "Toyota", 633314);
        Car c4 = new Car(1999, "Honda", 421464); 
        Car c5 = new Car(1999, "Honda", 6621145); 
        
        Car c6 = new Car();
        Car c7 = new Car(2016, "Mazda", 778454, 12000, 25000); 
        
        
        c1.setMileage(60000);
        c2.setMileage(30000);
        c3.setMileage(2000);
        c4.setMileage(200000);
        c5.setMileage(100000);
        
        c1.setPrice(6000);
        c2.setPrice(4000);
        c3.setPrice(15000);
        c4.setPrice(25000);
        c5.setPrice(6522.99);
        
        Dealership allStar = new Dealership();
        allStar.addCar(c1);
        allStar.addCar(c2);
        allStar.addCar(c3);
        allStar.addCar(c4);
        allStar.addCar(c5);
        //allStar.addCar(c6);
        allStar.addCar(c7);
        
        allStar.listInventory();
        
        allStar.setMarkup(.2);
        allStar.applyMarkup();
        allStar.listInventory();
        
        allStar.setMarkup(0);
        allStar.applyMarkup();
         
        allStar.setMarkup(.05);
        allStar.applyMarkup();
        allStar.listInventory();
      

    }
    
}
