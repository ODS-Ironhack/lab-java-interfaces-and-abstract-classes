package cars;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;
    
    public Car(String vinNumber,String make,String model,int mileage){
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    public void setMileage(int mileage) {
        this.mileage=mileage;
    }
    public int getMileage(){
        return mileage;
    }

    public void setModel(String model) {
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void setMake(String make) {
        this.make=make;
    }
    public String getMake(){
        return make;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber=vinNumber;
    }
    public String getVinNumber(){
        return vinNumber;
    }

    public String  getInfo(){
        return String.format("VIN Number: %s\nMake: %s\nModel: %s\nMileage: %d km",
                vinNumber, make, model, mileage);
    }
}
