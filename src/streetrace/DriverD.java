package streetrace;

public class DriverD extends Driver {
    public DriverD(String fullName,
                   boolean hasDriverLicense,
                   int driverExperienceInYear) {
        super(fullName, hasDriverLicense, driverExperienceInYear);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории D " + getFullName() + " остановился");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getFullName() + " заправил машину");

    }
}
