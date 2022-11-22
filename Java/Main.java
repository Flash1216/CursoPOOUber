public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola");

//        Car car = new Car("AMQ123", new Account("Juanito Perez", "AND-123"));
//        car.passenger = 4;
//        car.printDataCar();

//        Car car2 = new Car("QWE12354", new Account("Juan Sanchez", "QWE-435"));
//        car2.passenger = 3;
//        car2.printDataCar();


        UberX uberx = new UberX("POI0987", new Account("Alan Mejía", "APON782",
                          null, null), "Chevrolet", "Sonic");
        uberx.setPassenger(4);
        uberx.printDataCar();


        UberVan uberVan = new UberVan("FGH1232", new Account("Alan Mejía", "APON782",
        null, null));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }
}
