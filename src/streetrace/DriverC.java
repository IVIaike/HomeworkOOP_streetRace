package streetrace;

public class DriverC extends Driver {
    public DriverC(String fullName,
                   boolean hasDriverLicense,
                   int driverExperienceInYear) {
        super(fullName, hasDriverLicense, driverExperienceInYear);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории C " + getFullName() + " остановился");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getFullName() + " заправил машину");

    }
}
