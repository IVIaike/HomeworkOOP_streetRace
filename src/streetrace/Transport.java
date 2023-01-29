package streetrace;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;


    public Transport(String brand,
                     String model,
                     double engineVolume) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void startMoving() {
        startMoving();
    }

    public void stopMoving() {
        stopMoving();
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

    @Override
    public String toString() {
        return "Транспортное средство, производитель: " + brand +
                ", модель: " + model + ", объем двигателя: " + engineVolume;
    }
}
