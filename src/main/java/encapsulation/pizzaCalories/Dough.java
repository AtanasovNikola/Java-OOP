package encapsulation.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public void setFlourType(String flourType) {
        if (!isValid(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private boolean isValid(String type) {
        return (type.equals("White") || type.equals("Wholegrain"))
                || (type.equals("Crispy") || type.equals("Chewy") || type.equals("Homemade"));
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (!isValid(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = 2 * weight;

        switch (flourType) {
            case "White" -> calories *= 1.5;
            case "Wholegrain" -> calories *= 1;
        }

        switch (bakingTechnique) {
            case "Crispy" -> calories *= 0.9;
            case "Chewy" -> calories *= 1.1;
            case "Homemade" -> calories *= 1.0;
        }
        return calories;
    }
}
