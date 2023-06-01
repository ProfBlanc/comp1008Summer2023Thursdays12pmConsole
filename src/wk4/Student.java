package wk4;

public class Student {

    private String name = "Student";
    private int age = 20;
    private double grade = 50;

    //alt+insert
    //right-click => Generate...
    public Student(){} //default, no-args constructors

    public Student(String name, int age, double grade) {
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
        this(name, age, 0);
    }
    public Student(double grade, int age, String name) {

        this(name, age, grade);

    }

    public void method(double a, double b){}
    public Student(int age, double grade){
        this("Student", age, grade);
    }
    public Student(String name, double grade){
        this(name, 18, grade);
    }

    public Student(double grade, String name, int age){
        this(name, age, grade);
    }
    public Student(double grade){
        this("Student", 18, grade);
    }

    //alt+insert => Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 100)
            this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >= 20 && grade <= 100)
            this.grade = grade;
    }


    //generate the toString method
    //method to summarize the instance variables of a class
    //alt+insert

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    //an HonorRollStudent
    // a student with at least grade of 80
    public static Student honorRollStudent(){

        return new Student("Smarty Pants", 20, 80);
    }

    public static Student honorRollStudent(String name, double grade){


        /*
            ternary operator
                aka condensed if-statement
                if(grade >= 80)
                    grade = grade
                else
                    grade = 80
         */

        return new Student(name, 18, grade >= 80 ? grade : 80);

    }

    public static Student matureStudent(){
        return new Student("", 30);
    }
}
