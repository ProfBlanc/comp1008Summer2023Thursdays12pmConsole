package basics;

public class First {


    //psvm+tab
    public static void main(String[] args) {
        //sout+tab
        System.out.println("Hello class! Are you having fun?");
        String name = "Ben";
        byte age = 20;
        /*
        literal values
            String
            char
            int
            double
         */
        float temperature = 23.5f;
        double weight = 50.5d;

        //souf+tab
        /*
                fomratting character
                    % + character for data type

                        s: string
                        d: digit (whole number)
                        f: float (decimal number)
         */
System.out.printf("Hi, my name is %s. I weight %.2f kilograms." +
        "It is %.1f degrees Celsius outside today%n",
        name, weight, temperature


        );











    }

}
