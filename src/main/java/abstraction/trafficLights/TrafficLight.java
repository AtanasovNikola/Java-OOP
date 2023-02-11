package abstraction.trafficLights;

public class TrafficLight {
    private String[] trafficLights;
    private int iterations;

    public TrafficLight(int iterations, String... trafficLights) {
        this.trafficLights = trafficLights;
        this.iterations = iterations;
    }


    public void iterateAndPrint() {
        for (int i = 0; i < iterations; i++) {
            String[] newTrafficLight = newTrafficLight(trafficLights);
            System.out.println(String.join(" ", newTrafficLight));
        }
    }

    private String[] newTrafficLight(String... currentTrafficLight) {
        String[] newTrafficLight = new String[currentTrafficLight.length];
        for (int i = 0; i < currentTrafficLight.length; i++) {

            switch (currentTrafficLight[i]) {
                case "RED":
                    newTrafficLight[i] = "GREEN";
                    currentTrafficLight[i] = "GREEN";
                    break;
                case "GREEN":
                    newTrafficLight[i] = "YELLOW";
                    currentTrafficLight[i] = "YELLOW";
                    break;
                default:
                    newTrafficLight[i] = "RED";
                    currentTrafficLight[i]= "RED";
            }
        }
        return newTrafficLight;
    }
}
