package polimorphism.Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(int fuelQuantity, int litersPerKm) {
        super(fuelQuantity, litersPerKm);
        this.airConditionerConsumption = 0.9;
    }

    @Override
    void drive(double distance) {
        double neededLiters = (this.litersPerKm + this.airConditionerConsumption) * distance;
        if (this.fuelQuantity - neededLiters > 0) {
            this.fuelQuantity -= neededLiters;
            System.out.printf("%s travelled %s km", this.getClass().getSimpleName(), new DecimalFormat("##.##").format(distance));
        } else {
            System.out.printf("%s needs refueling", this.getClass().getSimpleName());
        }
    }

    @Override
    void refuel(double liters) {
        this.fuelQuantity += liters;
    }


}
