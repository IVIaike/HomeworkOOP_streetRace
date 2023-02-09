package streetrace;

import java.util.List;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapacity;
    private boolean passDiagnostic;


    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LoadCapacity loadCapacity,
                 DriverC driver,
                 List<Mechanics> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль марки " + getBrand() + " остановился");
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getLoadCapacity());
    }

    @Override
    public String repair() {
        return "Замена гидравлической жидкости в тормозной системе";
    }

    @Override
    public boolean passDiagnostic() {
        return true;
    }

    public boolean isPassDiagnostic() {
        return passDiagnostic;
    }

    public void setPassDiagnostic(boolean passDiagnostic) {
        this.passDiagnostic = passDiagnostic;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestTimeLap() {
        int minTimeLap = 145;
        int maxTimeLap = 343;
        int bestTimeLap = (int) (minTimeLap + ((maxTimeLap - minTimeLap)*Math.random()));
        System.out.println("Лучшее время круга для грузового автомобиля составляет: " + bestTimeLap + " секунд.");
    }

    @Override
    public void maximumSpeed() {
        int minMovingSpeed = 82;
        int maxMovingSpeed = 186;
        int maximumSpeed = (int) (minMovingSpeed + ((maxMovingSpeed - minMovingSpeed)*Math.random()));
        System.out.println("Максимальная скорость на треке для грузового автомобиля составляет: " + maximumSpeed + " километров в час.");
    }
}
