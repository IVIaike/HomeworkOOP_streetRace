package streetrace;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Лада", "Веста", 1.6);
        Car car2 = new Car("Audi", "A3", 2.0);
        Car car3 = new Car("Subaru", "Impreza XV", 2.0);
        Car car4 = new Car("Dodge", "Caliber SE", 2.5);

        Truck truck1 = new Truck("Volvo", "Freightliner", 2.5);
        Truck truck2 = new Truck("Mercedes Benz", "Cosmo", 3.0);
        Truck truck3 = new Truck("Renault", "Skyliner", 2.7);
        Truck truck4 = new Truck("MAN", "Model 5", 3.2);

        Bus bus1 = new Bus("Mercedes Benz", "Allegro", 3.5);
        Bus bus2 = new Bus("Ikarus", "Ikar", 2.5);
        Bus bus3 = new Bus("Львив", "Львив 3", 2.2);
        Bus bus4 = new Bus("Ssang Yuong", "Flying pigeon", 3.0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
    }
}