package wk6;

public class Dog extends Canine{

    double hairLength;

    public Dog(){}

    public Dog(String name, double weight) {
        super(name, weight);
    }

    public Dog(String name, double weight, double hairLength) {
        super(name, weight);
        this.hairLength = hairLength;
    }

    @Override
    public String speak(int numberOfTimes) {
        return "bark!".repeat(numberOfTimes);
    }

    @Override
    public boolean hasShortHair() {
        return hairLength < 10;
    }

    @Override
    public String toString(){
       // return String.format("Dog{name = '%s', weight = '%.1f', hairLength = %.1f}", getName(), getWeight(), hairLength);
        return "Dog" + super.toString().substring(6, super.toString().length() - 1) + ", hairLength = " + hairLength + "--new--}";
    }
}
