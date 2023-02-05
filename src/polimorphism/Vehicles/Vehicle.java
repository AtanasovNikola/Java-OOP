package polimorphism.Vehicles;

public abstract class Vehicle {
    protected double airConditionerConsumption;
    protected int fuelQuantity;
    protected int litersPerKm;

    public Vehicle(int fuelQuantity, int litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
    }

    abstract void drive(double distance);

    abstract void refuel(double liters);

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),(double)this.fuelQuantity);
    }
}
