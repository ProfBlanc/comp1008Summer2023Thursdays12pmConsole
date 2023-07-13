package wk6;

public class Week9 {

    static void example1(){
        Dog dog = new Dog();

        Canine canine = new Dog();


        System.out.println(canine);
        System.out.println(dog);


    }
    static void example2(){

        Paws paws = new Dog();

        double result = paws.dig(2);

    }

    public static void main(String[] args) {
        example1();
    }
}
