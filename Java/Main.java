public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola");

        Car car = new Car("AMQ123", new Account("Juanito Perez", "AND-123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE12354", new Account("Juan Sanchez", "QWE-435"));
        car2.passenger = 3;
        car2.printDataCar();

    }
}
