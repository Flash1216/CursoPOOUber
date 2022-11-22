public class Car {
    private int id;
    private int passenger;
    private String license;
    private Account driver;
    protected int passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger: " 
        + passenger);
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        if(passenger == 4) {
        this.passenger = passenger;
    } else {
        System.out.println("Necesitas asignar 4 pasajeros");
    }
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    



}
