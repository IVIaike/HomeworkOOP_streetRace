package streetrace;

public class Mechanics {
    private String name;
    private final String company;

    public Mechanics(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void makeMaintenance () {
        System.out.println("Это транспортное средство обслуживает " + toString());
    }

    public void repairTransport () {
        System.out.println("Это транспортное средство отремонтировал " + toString());
    }

    @Override
    public String toString() {
        return "Механик имя:" + name +
                ", из компании: " + company;
    }
}
