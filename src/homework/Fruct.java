package homework;

public abstract class Fruct {

    private final float weight;

    private String name;

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Fruct(float weight) {
        this.weight = weight;
    }
}
