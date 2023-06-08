package wk4;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Welcome to our testing");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("Testing has ended");
    }
    static int NUM_TESTS = 0;
    static Student student;
    @Before
    public void beforeEachTest(){
        System.out.println("Running Test # " + (++NUM_TESTS));
        if(NUM_TESTS < 3)
            student = new Student();
    }
    @After
    public void afterEachTest(){
        System.out.println("Ending Test # " + NUM_TESTS);
    }

    @Test
    public void testAssertions(){

        assertTrue( 1 == 1);
        assertFalse( 1 == 2);
        assertTrue(1 == 1 && 1 < 2);
        assertNull(null);
        assertNotNull("hello");
        assertEquals(20, 5 * 4);
        assertNotEquals(20, 3 * 6);
    }

    @Test
    public void secondSampleTest(){

        //        System.out.println(1 == 2);
        assertFalse(1 == 2);
    }
    @Test
    public void testDefaultConstructorFirstName(){

        assertNotNull(student);
        assertNotNull(student.getName());
        assertEquals("Student", student.getName());
        assertTrue(student.getName().length() >= 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ben", "Blanc", "Joe", "Mary"})  // arrays of primitive datatypes + strings + objects
    public void testDefaultConstructorSetNameValidValues(String name){
        student.setName(name);
        assertEquals(name, student.getName());

    }

    @ParameterizedTest
    @CsvSource({"Ben,20","Blanc, 25","Mary, 19"})
    public void testTwoArgConstructor(String name, int age){

       // assertNull(student);
        student = new Student(name, age);
        assertEquals(name, student.getName());
        assertEquals(age, student.getAge());
    }

    @ParameterizedTest
    @CsvSource({"Ben,30", "Blanc,40"})
    public void testMatureStudentValidValues(String name, int age){
        student = Student.matureStudent(name, age);
        assertEquals(name, student.getName());
        assertEquals(age, student.getAge());

    }

}