package streetrace;

import java.util.List;

public abstract class Transport<T extends Driver> implements Competitionable {
    private final String brand;
    private final String model;
    private final double engineVolume;
//    private boolean isDiagnosticsPassed;
    private boolean passDiagnostic;
    private T driver;

    private List<Mechanics> mechanicList;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanics> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanicList = mechanicList;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract String repair();

    abstract boolean passDiagnostic();

    public boolean isPassDiagnostic() {
        return passDiagnostic;
    }

    public void setPassDiagnostic(boolean passDiagnostic) {
        this.passDiagnostic = passDiagnostic;
    }

    public boolean checkNeedService () {
        try {
            if (passDiagnostic());
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }
    public static String validateCarParameters (String value) {
        return validateString(value, "default");
    }
    public static String validateString(String value, String defaultValue) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return defaultValue;
        }
        return value;
    }
    public static double validateEngineVolume(double value) {
        if (value <= 0) {
            return 1.5;
        }
        return value;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }



    @Override
    public String toString() {
        return "Транспортное средство, производитель: " + brand +
                ", модель: " + model + ", объем двигателя: " + engineVolume + ", водитель: " + driver;
    }

}
