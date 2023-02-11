package streetrace;

import java.util.ArrayList;

public class Bus extends Transport<DriverD>{

    private Size size;

    public Bus(String brand,
               String model,
               double engineVolume,
               Size size,
               DriverD driver,
               ArrayList<Mechanics> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.size = size;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус марки " + getBrand() + " остановился");
    }

    @Override
    public void printType() {
        if (getSize() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        System.out.println(getSize());
    }

    @Override
    public String repair() {
        return "Замена рулевой рейки";
    }

    @Override
    boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void bestTimeLap() {
        int minTimeLap = 156;
        int maxTimeLap = 367;
        int bestTimeLap = (int) (minTimeLap + ((maxTimeLap - minTimeLap)*Math.random()));
        System.out.println("Лучшее время круга для автобуса составляет: " + bestTimeLap + " секунд.");
    }

    @Override
    public void maximumSpeed() {
        int minMovingSpeed = 76;
        int maxMovingSpeed = 146;
        int maximumSpeed = (int) (minMovingSpeed + ((maxMovingSpeed - minMovingSpeed)*Math.random()));
        System.out.println("Максимальная скорость на треке для автобуса составляет: " + maximumSpeed + " километров в час.");
    }
}
