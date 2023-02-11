package polimorphism.Vehicles;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carArr = getArr(scanner);
        String[] truckArr = getArr(scanner);
        String[] busArr = getArr(scanner);

        Vehicle car = vehicle(carArr);
        Vehicle truck = vehicle(truckArr);
        Vehicle bus = vehicle(busArr);

        int commands = Integer.parseInt(scanner.nextLine());

        while (commands-- > 0) {
            doTheCommands(scanner, (Car) car, (Truck) truck, (Bus) bus);
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static String[] getArr(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }


    private static void doTheCommands(Scanner scanner, Car car, Truck truck, Bus bus) {
        String[] commandArr = getArr(scanner);
        String command = commandArr[0];
        String type = commandArr[1];

        checkType(car, truck, bus, commandArr, command, type);
    }

    private static void checkType(Car car, Truck truck, Bus bus, String[] commandArr, String command, String type) {
        switch (command) {
            case "Drive" -> {
                double distance = Double.parseDouble(commandArr[2]);
                if (type.equals("Car")) {
                    car.drive(distance);
                } else if (type.equals("Truck")) {
                    truck.drive(distance);
                } else if (type.equals("Bus")) {
                    bus.drive(distance);
                }
            }
            case "Refuel" -> {
                double liters = Double.parseDouble(commandArr[2]);
                if (type.equals("Car")) {
                    car.refuel(liters);
                } else if (type.equals("Truck")) {
                    truck.refuel(liters);
                } else if (type.equals("Bus")) {
                    bus.refuel(liters);
                }
            }
            case "DriveEmpty" -> {
                double distance = Double.parseDouble(commandArr[2]);
                bus.driveEmpty(distance);
            }
        }
    }


    private static Vehicle vehicle(String[] inputArr) {
        String type = inputArr[0];
        double fuelQuantity = Double.parseDouble(inputArr[1]);
        double litersPerKm = Double.parseDouble(inputArr[2]);
        double tankCapacity = Double.parseDouble(inputArr[3]);
        Vehicle vehicle = null;
        switch (type) {
            case "Car" -> vehicle = new Car(fuelQuantity, litersPerKm, tankCapacity);
            case "Truck" -> vehicle = new Truck(fuelQuantity, litersPerKm, tankCapacity);
            case "Bus" -> vehicle = new Bus(fuelQuantity, litersPerKm, tankCapacity);
        }
        ;
        return vehicle;
    }


}
