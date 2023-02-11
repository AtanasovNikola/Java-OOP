package polimorphism.Vehicles;

public abstract class Vehicle {
    protected double airConditionerConsumption;
    protected double fuelQuantity;
    protected double litersPerKm;
    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double litersPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
        this.tankCapacity = tankCapacity;
    }

    abstract void drive(double distance);

    abstract void refuel(double liters);

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), (double) this.fuelQuantity);
    }
}
