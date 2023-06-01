package wk4;

public class Week4 {


    //create a static method
    static void example1(){

        /*
        constructors
            a special method used to construct/build
            an object

            What's special about it?
                NO return data type
                name is exact same name as the class
            since a constructor is a special method,
            can a constrcutor be overloaded?
         */

        Student s1 = new Student(); //default aka no-arg
        //constructor


        //every class created: inherits methods
        //from Object class

        //if you want to offer more than one way to
        //construct your object, creating various constructors


        Student s2 = new Student("Student", 18, 90d);
        Student s3 = new Student("Name", 20);


        /*
            method overload
                create a new variable of a method
                    same name
                        unique combo of
                            # of args
                            data type order of args


         */

    }

    static void example2(){

        Student s1 = new Student();
        Student s2 = new Student("Ben", 100, 100);

        System.out.println(s1);
        System.out.println(s2);


    }

    static void example3(){

        Student s1 = new Student();
        s1.setGrade(80);
        Student s2 = new Student("name", 18, 80);

        Student s3 = Student.honorRollStudent();
        System.out.println(s3);

        Student s4 = Student.matureStudent();
        System.out.println(s4);

    }
    //create the main method
    public static void main(String[] args) {

        //call a static method from main method
        example3();
    }
}
