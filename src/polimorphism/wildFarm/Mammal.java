package polimorphism.wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String type, String name, double animalWeight, String livingRegion) {
        super(type, name, animalWeight);
        this.livingRegion = livingRegion;
    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]"
                , super.getType(), super.getName(), decimalFormat.format(super.getAnimalWeight()), this.livingRegion, super.getFoodEaten());
    }
}
