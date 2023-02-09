package streetrace;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List <Mechanics> mechanicsList = new LinkedList<>();

        Mechanics mechanic1 = new Mechanics("Андрей Иванов", "Сверли и забивай");
        Mechanics mechanic2 = new Mechanics("Сидор Петров", "Сверли и забивай");
        Mechanics mechanic3 = new Mechanics("Иван Бугров", "Сверли и забивай");
        Mechanics mechanic4 = new Mechanics("Федот Толстов", "Сверли и забивай");

        mechanicsList.add(mechanic1);
        mechanicsList.add(mechanic2);
        mechanicsList.add(mechanic3);
        mechanicsList.add(mechanic4);

        List <Transport> transportList = new ArrayList<>();

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


        Car car1 = new Car("Лада", "Веста", 1.6, BodyType.SEDAN, new DriverB("B1st", true, 3), (List<Mechanics>) mechanic1);
        Car car2 = new Car("Audi", "A3", 2.0, BodyType.HATCHBACK, driverB2, (List<Mechanics>) mechanic2);
        Car car3 = new Car("Subaru", "Impreza XV", 2.0, BodyType.HATCHBACK, driverB3, (List<Mechanics>) mechanic3);
        Car car4 = new Car("Dodge", "Caliber SE", 2.0, BodyType.SUV, driverB4, (List<Mechanics>) mechanic4);

        Truck truck1 = new Truck("Volvo", "Freightliner", 2.5, LoadCapacity.N1, driverC1,(List<Mechanics>) mechanic1);
        Truck truck2 = new Truck("Mercedes Benz", "Cosmo", 3.0, LoadCapacity.N2, driverC2,(List<Mechanics>) mechanic2);
        Truck truck3 = new Truck("Renault", "Skyliner", 2.7, LoadCapacity.N2, driverC3,(List<Mechanics>) mechanic3);
        Truck truck4 = new Truck("MAN", "Model 5", 3.2, LoadCapacity.N3, driverC4,(List<Mechanics>) mechanic4);

        Bus bus1 = new Bus("Mercedes Benz", "Allegro", 3.5, Size.SMALL, driverD1,(List<Mechanics>) mechanic1);
        Bus bus2 = new Bus("Ikarus", "Ikar", 2.5, Size.BIG, driverD2, (List<Mechanics>) mechanic2);
        Bus bus3 = new Bus("Львив", "Львив 3", 2.2, Size.MIDDLE, driverD3,(List<Mechanics>) mechanic3);
        Bus bus4 = new Bus("Ssang Yuong", "Flying pigeon", 3.0, Size.VERYBIG, driverD4,(List<Mechanics>) mechanic4);

        transportList.add(car1);
        transportList.add(car2);
        transportList.add(car3);
        transportList.add(car4);
        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(truck3);
        transportList.add(truck4);
        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(bus3);
        transportList.add(bus4);

        Transport transport1FromCollection = transportList.get(0);
        Transport transport2FromCollection = transportList.get(1);
        Transport transport5FromCollection = transportList.get(4);
        Transport transport6FromCollection = transportList.get(5);
        Transport transport9FromCollection = transportList.get(8);
        Transport transport10FromCollection = transportList.get(9);

        System.out.println(transport1FromCollection);
        System.out.println(transport2FromCollection);
        System.out.println(transport5FromCollection);
        System.out.println(transport6FromCollection);
        System.out.println(transport9FromCollection);
        System.out.println(transport10FromCollection);




//        printInfo(car1);
//        car1.printType();
//        printInfo(car2);
//        printInfo(car3);
//        printInfo(car4);

//        printInfo(truck1);
//        printInfo(truck2);
//        printInfo(truck3);
//        printInfo(truck4);
//        truck4.printType();

//        System.out.println(car3);
//        System.out.println(truck2);
//        System.out.println(bus4);

//        printInfo(bus1);
//        printInfo(bus2);
//        printInfo(bus3);
//        printInfo(bus4);
//        bus4.printType();

//        checkTransport(car2);
//        checkTransport(truck3);
 //       checkTransport(bus1);

    }

    public static void printInfo(Transport<?> transport) {
    System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " статус прохождения технического обслуживания " + transport.passDiagnostic() + " и будет участвовать в заезде");
    }

    public static void checkTransport(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (transport.passDiagnostic()) {
                    System.out.println("Транспортное средство: " + transport.getBrand() + " прошло диагностику.");
                }
            } catch (TransportTypeException e) {
                throw new RuntimeException("Автобусы диагностику проходить не должны");
            } finally {
                System.out.println("Завершено");
            }
        }
    }

}
