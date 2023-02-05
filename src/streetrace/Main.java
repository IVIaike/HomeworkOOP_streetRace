package streetrace;

public class Main {
    public static void main(String[] args) {

        DriverB driverB1 = new DriverB("B1st", true, 3);
        DriverB driverB2 = new DriverB("B2nd", true, 3);
        DriverB driverB3 = new DriverB("B3rd", true, 3);
        DriverB driverB4 = new DriverB("B4th", true, 3);

        DriverC driverC1 = new DriverC("C1st", true, 5);
        DriverC driverC2 = new DriverC("C2nd", true, 5);
        DriverC driverC3 = new DriverC("C3rd", true, 5);
        DriverC driverC4 = new DriverC("C4th", true, 5);

        DriverD driverD1 = new DriverD("D1st", true, 6);
        DriverD driverD2 = new DriverD("D2nd", true, 6);
        DriverD driverD3 = new DriverD("D3rd", true, 6);
        DriverD driverD4 = new DriverD("D4th", true, 6);

        Car car1 = new Car("Лада", "Веста", 1.6, BodyType.SEDAN, new DriverB("B1st", true, 3));
        Car car2 = new Car("Audi", "A3", 2.0, BodyType.HATCHBACK, driverB2);
        Car car3 = new Car("Subaru", "Impreza XV", 2.0, BodyType.HATCHBACK, driverB3);
        Car car4 = new Car("Dodge", "Caliber SE", 2.0, BodyType.SUV, driverB4);

        Truck truck1 = new Truck("Volvo", "Freightliner", 2.5, LoadCapacity.N1, driverC1);
        Truck truck2 = new Truck("Mercedes Benz", "Cosmo", 3.0, LoadCapacity.N2,driverC2);
        Truck truck3 = new Truck("Renault", "Skyliner", 2.7, LoadCapacity.N2, driverC3);
        Truck truck4 = new Truck("MAN", "Model 5", 3.2, LoadCapacity.N3, driverC4);

        Bus bus1 = new Bus("Mercedes Benz", "Allegro", 3.5, Size.SMALL, driverD1);
        Bus bus2 = new Bus("Ikarus", "Ikar", 2.5, Size.BIG, driverD2);
        Bus bus3 = new Bus("Львив", "Львив 3", 2.2, Size.MIDDLE, driverD3);
        Bus bus4 = new Bus("Ssang Yuong", "Flying pigeon", 3.0, Size.VERYBIG, driverD4);

        printInfo(car1);
        car1.printType();
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);

        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(bus4);
        bus4.printType();

       printInfo(truck1);
       printInfo(truck2);
       printInfo(truck3);
       printInfo(truck4);
       truck4.printType();

        System.out.println(car3);
        System.out.println(truck2);
        System.out.println(bus4);

        checkTransport(car3);
        checkTransport(truck2);
        checkTransport(bus4);

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " статус прохождения технического обслуживания " + transport.isDiagnosticPassed() + " и будет участвовать в заезде");
    }

    public static void checkTransport (Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.passDiagnostic()) {
                try {
                    transport.getBrand();
                } catch (TransportTypeException e){
                    throw new RuntimeException("Еще одно исключение типа");
                }finally {
                    System.out.println("Завершено");
                }
            }
        }
        System.out.println("Транспортное средство прошло диагностику");
    }

}