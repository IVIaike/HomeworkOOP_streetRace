package streetrace;

public class Car extends Transport<DriverB> {
    private BodyType bodyType;
    private boolean isDiagnosticPassed;

    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль марки " + getBrand() + " остановился");
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getBodyType());
    }

    @Override
    boolean passDiagnostic() {
        return this.isDiagnosticPassed;
    }

    @Override
    public boolean isDiagnosticPassed() {
        return isDiagnosticPassed;
    }

    public void setDiagnosticPassed(boolean diagnosticPassed) {
        isDiagnosticPassed = diagnosticPassed;
    }
    //    @Override
//    boolean passDiagnostics() {
//        return this.isDiagnosticsPassed;
//    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void bestTimeLap() {
        int minTimeLap = 125;
        int maxTimeLap = 293;
        int bestTimeLap = (int) (minTimeLap + ((maxTimeLap - minTimeLap)*Math.random()));
        System.out.println("Лучшее время круга автомобиля составляет: " + bestTimeLap + " секунд.");
    }

    @Override
    public void maximumSpeed() {
        int minMovingSpeed = 98;
        int maxMovingSpeed = 234;
        int maximumSpeed = (int) (minMovingSpeed + ((maxMovingSpeed - minMovingSpeed)*Math.random()));
        System.out.println("Максимальная скорость на треке для автомобиля составляет: " + maximumSpeed + " километров в час.");
    }
}
