package cars;

public class Truck extends Car{
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    public double getTowingCapacity(){
        return towingCapacity;
    }

}
