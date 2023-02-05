package polimorphism.Vehicles;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carArr = scanner.nextLine().split("\\s+");
        String[] truckArr = scanner.nextLine().split("\\s+");

        Vehicle car = vehicle(carArr);
        Vehicle truck = vehicle(truckArr);

        int commands = Integer.parseInt(scanner.nextLine());

        while (commands-- > 0) {
            doTheCommands(scanner, (Car) car, (Truck) truck);
        }

        System.out.println(car);
        System.out.println(truck);
    }



    private static void doTheCommands(Scanner scanner, Car car, Truck truck) {
        String[] commandArr = scanner.nextLine().split("\\s+");
        String command = commandArr[0];
        String type = commandArr[1];

        checkType(car, truck, commandArr, command, type);
    }

    private static void checkType(Car car, Truck truck, String[] commandArr, String command, String type) {
        switch (command) {
            case "Drive" -> {
                double distance = Double.parseDouble(commandArr[2]);
                if (type.equals("Car")) {
                    car.drive(distance);
                } else if (type.equals("Truck")) {
                    truck.drive(distance);
                }
            }
            case "Refuel" -> {
                double liters = Double.parseDouble(commandArr[2]);
                if (type.equals("Car")) {
                    car.refuel(liters);
                } else if (type.equals("Truck")) {
                    truck.refuel(liters);
                }
            }
        }
    }


    private static Vehicle vehicle(String[] inputArr) {
        String type = inputArr[0];
        int fuelQuantity = Integer.parseInt(inputArr[1]);
        int litersPerKm = Integer.parseInt(inputArr[2]);
        Vehicle vehicle = null;
        switch (type) {
            case "Car" -> vehicle = new Car(fuelQuantity, litersPerKm);
            case "Truck" -> vehicle = new Truck(fuelQuantity, litersPerKm);
        }
        ;
        return vehicle;
    }


}
