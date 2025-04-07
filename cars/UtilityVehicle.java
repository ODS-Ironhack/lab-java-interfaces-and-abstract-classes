package cars;

public class UtilityVehicle extends Car{

    private boolean fourWheelDrive;
    
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        setHasFourWheelDrive(fourWheelDrive);
    }

    public void setHasFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive=fourWheelDrive;
    }
}
