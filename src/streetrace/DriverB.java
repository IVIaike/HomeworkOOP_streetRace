package streetrace;

public class DriverB extends Driver{

    public DriverB(String fullName,
                   boolean hasDriverLicense,
                   int driverExperienceInYear) {
        super(fullName, hasDriverLicense, driverExperienceInYear);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");

    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории В " + getFullName() + " остановился");

    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправил машину");

    }

}
