package polimorphism.Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    private static final double MAX_PERCENTAGE_TANK_FUELED = 0.95;

    public Truck(int fuelQuantity, int litersPerKm) {
        super(fuelQuantity, litersPerKm);
        this.airConditionerConsumption = 1.6;
    }

    @Override
    void drive(double distance) {
        double neededLiters = (this.litersPerKm + airConditionerConsumption) * distance;
        if (this.fuelQuantity - neededLiters > 0) {
            this.fuelQuantity -= neededLiters;
            System.out.printf("%s travelled %s km", this.getClass().getSimpleName(), new DecimalFormat("##.##").format(distance));
        } else {
            System.out.printf("%s needs refueling", this.getClass().getSimpleName());
        }
    }

    @Override
    void refuel(double liters) {
        this.fuelQuantity += liters * MAX_PERCENTAGE_TANK_FUELED;
    }
}
