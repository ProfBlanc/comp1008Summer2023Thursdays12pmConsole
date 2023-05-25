package wk3;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {

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

    }

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
        String[] whatToWearOptions = {"winter coat", "long-sleeve",
                "tee-shirt", "light coat"};
        double[] temperatureResponses; //tempeartureResponses = new double[howMany]
        double averageTemperature = 0d;
        String[] decisionOfWhatToWear;


    }

}
