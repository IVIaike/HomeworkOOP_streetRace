package streetrace;

public abstract class Driver {
    private String fullName;
    private boolean hasDriverLicense;
    private int driverExperienceInYear;

    public Driver(String fullName,
                  boolean hasDriverLicense,
                  int driverExperienceInYear) {
        this.fullName = fullName;
        this.hasDriverLicense = hasDriverLicense;
        this.driverExperienceInYear = driverExperienceInYear;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuelCar();

    @Override
    public String toString() {
        return "Водитель. Имя: " + fullName + ", водительские права: " + hasDriverLicense + ", стаж вождения:" + driverExperienceInYear + " лет.";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getDriverExperienceInYear() {
        return driverExperienceInYear;
    }

    public void setDriverExperienceInYear(int driverExperienceInYear) {
        this.driverExperienceInYear = driverExperienceInYear;
    }
}
