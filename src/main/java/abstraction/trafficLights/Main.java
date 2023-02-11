package abstraction.trafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] trafficLights = scanner.nextLine().split("\\s+");
        int iterations = Integer.parseInt(scanner.nextLine());

        TrafficLight trafficLight = new TrafficLight(iterations, trafficLights);

        trafficLight.iterateAndPrint();

    }
}
