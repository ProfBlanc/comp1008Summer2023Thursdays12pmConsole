package wk6;

public abstract class Canine {

    private String name;
    private double weight;

    public abstract String speak(int numberOfTimes);

    public abstract boolean hasShortHair();

    public Canine(){}

    public Canine(String name, double weight){
        setName(name);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Canine{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
