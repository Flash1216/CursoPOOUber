import java.util.ArrayList;
import java.util.Map;


class UberVan extends Car{
     Map<String, Map<String, Integer>> typeCarAccepted;
     ArrayList<String> seatsMaterial; 

    public UberVan(String license, Account driver) {
            super(license, driver);
    }

    // public UberVan2(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
    //                 ArrayList<String> seatsMaterial) {
    //         super(license, driver);
    //         this.typeCarAccepted = typeCarAccepted;
    //         this.seatsMaterial = seatsMaterial;
    // }

      
    public void setPassenger(int passengers) {
        if(passengers == 6){
            this.passengers = passengers;
        }else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
    
    }
