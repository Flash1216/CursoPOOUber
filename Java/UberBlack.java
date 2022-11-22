import java.util.Map;

class UberBlack extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    Map<String, Map<String, Integer>> seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, 
                    Map<String, Map<String, Integer>> seatsMaterial) {
            super(license, driver);
            this.typeCarAccepted = typeCarAccepted;
            this.seatsMaterial = seatsMaterial;
        }
    }
