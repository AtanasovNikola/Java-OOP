package polimorphism.Vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {


    public Bus(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm, tankCapacity);
        this.airConditionerConsumption = 1.4;
    }

    void driveEmpty(double distance) {
        double neededLiters = this.litersPerKm * distance;
        printing(distance, neededLiters);
    }

    @Override
    void drive(double distance) {

        double neededLiters = (this.litersPerKm + this.airConditionerConsumption) * distance;
        printing(distance, neededLiters);
    }

    private void printing(double distance, double neededLiters) {
        if (this.fuelQuantity - neededLiters > 0) {
            this.fuelQuantity -= neededLiters;
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), new DecimalFormat("##.##").format(distance));
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }


    @Override
    void refuel(double liters) {
        if (this.tankCapacity >= this.fuelQuantity + liters && liters > 0) {
            this.fuelQuantity += liters;
        } else if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (this.tankCapacity < this.fuelQuantity + liters) {
            System.out.println("Cannot fill fuel in tank");
        }
    }
}
