package streetrace;

public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
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
