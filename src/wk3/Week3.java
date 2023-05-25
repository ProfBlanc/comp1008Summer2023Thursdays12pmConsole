package wk3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        example3();
    }

    static void example3(){

        //typecasting: changing from one data type to another
        // size: data type size

        int num1 = -250;
        float num2 = num1;
        short num3 = (short)num1;
        byte num4 = (byte)num1; // value ranges for byte? -128   0     127
        System.out.println(num4);

        float f1 = 100;
        double d1 = f1;

        /*
            implicity typecasting
                from small data type to big data type
                    promotion
                    short => int
                    int => long
                    float => double
                explicit typecasting
                    big to small
                       demotion
                            (taget data type)

         */

    }

    static void example5(){

        Calc c = new Calc();

        double result1 = c.add((byte)1, (byte)2);

        //short, float
        double result2 = c.add((short)10, 20);

        //double, double
        double result3 = c.add(10F, 20L);

        int randomNumber = new Random().nextInt(5); // value 0-4
        Random random = new Random();

        random.nextInt(1, 10);
    }
    static void example2(){

        /*
                multi-dimensional arrays
                    tabular
                        rows and columns

                    Example

                        Row1Col1    Row1Col2    Row1Col3
                        Row2Col1    Row2Col2    Row2Col3
                        Row3Col1    Row3Col2    Row3Col3

         */
        String[][] data1 = new String[3][3];
        data1[0][0] = "Row1Col1";
        data1[0][1] = "Row1Col2";
        data1[0][2] = "Row1Col3";

        System.out.println(data1[0][0]);
        System.out.println(data1[0][1]);
        System.out.println(data1[0][2]);

        for(int row = 1; row < data1.length; row++){
            for(int col = 0; col < data1[row].length; col++){
                data1[row][col] = String.format("Row%dCol%d", row + 1, col + 1 );
            }
        }
        System.out.println("Done");

    }


        /*
            Ask the user how many tempeartures they want to enter
            ensure the value is within 1-7

            if user puts neg # or num gt 7: display error message
            else
                depending on value
                    Enter temp for Monday
                    Enter temp for Tues
                    Enter temp for Monday

                    output average temperature
                    depending on temp for each day
                        tell user what top they should be wearing

            What to wear should be determined by the following
            lt 0 : winter coat
            bt 1-10: light coat
            bt 11-20: long sleeve
            gt 20: t-shirt


            Enter # of days of week you want to enter?
                -1
                    error message
                3
                    Enter temp for Monday
                        10
                    Enter temp for Tuesday
                        21
                    Enter temp for Wednesday
                        -2

                   The average temperature is 9 degrees Celsius
                   On Monday, you should wear a light coat
                   On Tuesday, you should wear a t-shirt
                   On Wednesday, you should wear a winter coat


         */


    static void example1(){

        //variables?
        /*
        Scanner: input
        howManyDaysYouWantToEnter: int
        daysOfWeek: array of Strings
        whatToWearOptions: array of Strings
        temperatureResponses: array of int/double
        averageTemperature: double
        decisionOfWhatToWhere: array of Strings based on temperature and if statements
         */

        /*
            Steps:
                1-declare variables
                2-ask user for # days
                3-validate response b/t 1-7
                NO: output error message
                YES:
                -for loop starting at 0, ending # of days(2) (exclusive)
                    -ask user for temp of that day
                    -store temp for that day
                -generate decisionOfWhatToWhere by iterating thru array of temps
                -iterature temps and generate avg temp
                -iterature any array
                    temp to DAY OF WEEK was TEMP, therefore you should wear WHAT TO WEAR


         */

/*
        Scanner: input
        howManyDaysYouWantToEnter: int
        daysOfWeek: array of Strings
        whatToWearOptions: array of Strings
        temperatureResponses: array of int/double
        averageTemperature: double
        decisionOfWhatToWhere: array of Strings based on temperature and if statements
         */
        Scanner input = new Scanner(System.in);
        int howManyDaysYouWantToEnter = 0;
        String[] dow1 = {"Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun"};
        String[] dow2 = new String[7];
        dow2[0] = "Mon";
        dow2[1] = "Tues";
        String[] whatToWearOptions = {"winter coat", "light coat",
                "long-sleeve","tee-shirt"};
        double[] temperatureResponses; //tempeartureResponses = new double[howMany]
        double averageTemperature = 0d;
        double tempeatureSum = 0d;
        String[] decisionOfWhatToWear;

        System.out.println("Welcome to our program");
        System.out.println("Enter number of days that you want to enter");
        howManyDaysYouWantToEnter = input.nextInt();
        if(howManyDaysYouWantToEnter < 1 || howManyDaysYouWantToEnter > 7){
            System.out.println("Error! Days should be between 1 and 7");
            System.out.println("Goodbye!");
        }
        else{
            temperatureResponses = new double[howManyDaysYouWantToEnter];
            decisionOfWhatToWear = new String[howManyDaysYouWantToEnter];



            for(int i = 0 ; i < howManyDaysYouWantToEnter; i++ ){

                System.out.printf("Enter the temperature for %s %n",
                        dow1[i] + "day");

                double temp = input.nextDouble();
                temperatureResponses[i] = temp;

                tempeatureSum += temp;

                if(temp < 0)
                    decisionOfWhatToWear[i] = whatToWearOptions[0];
                else if (temp < 11)
                    decisionOfWhatToWear[i] = whatToWearOptions[1];
                else if(temp < 21)
                    decisionOfWhatToWear[i] = whatToWearOptions[2];
                else
                    decisionOfWhatToWear[i] = whatToWearOptions[3];
            }

            // for loop: display information
            for(int i = 0 ; i < howManyDaysYouWantToEnter; i++){

                System.out.printf("On %s, it will be %.1f degrees Celsius. " +
                        "You should wear a %s %n", dow1[i] + "day",
                        temperatureResponses[i], decisionOfWhatToWear[i]);
            }
            System.out.println("The average temperature will be " + (tempeatureSum / howManyDaysYouWantToEnter));

            }

        }


    }


