package basics;

public class Person {

    String name;
    byte age;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Person(){}

    public Person(String name, byte age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Person(String name, float weight, byte age) {
        this(name, age, weight);
    }
    public Person(float weight, byte age, String name) {
        this(name, age, weight);
    }
    public Person(byte age, float weight, String name) {

        this(name, age, weight);
    }
    }
