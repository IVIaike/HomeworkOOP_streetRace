package streetrace;

public class Car extends Transport {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
