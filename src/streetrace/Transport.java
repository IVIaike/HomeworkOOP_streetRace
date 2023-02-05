package streetrace;

public abstract class Transport<T extends Driver> implements Competitionable {
    private final String brand;
    private final String model;
    private final double engineVolume;
//    private boolean isDiagnosticsPassed;
    private boolean isDiagnosticPassed;
    private T driver;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.driver = driver;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    abstract boolean passDiagnostic () throws TransportTypeException;

    public boolean isDiagnosticPassed() {
        return isDiagnosticPassed;
    }

    public void setDiagnosticPassed(boolean diagnosticPassed) {
        isDiagnosticPassed = diagnosticPassed;
    }
    //    abstract boolean passDiagnostics ();

//    public boolean isDiagnosticsPassed() {
//        return isDiagnosticsPassed;
//    }
//    public void checkTransport (){
//
//    }

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
