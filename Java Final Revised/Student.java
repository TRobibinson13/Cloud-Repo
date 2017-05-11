import java.util.Arrays;

/**
 *   Represents a Student with all of their necessary information.
 */
public class Student
{
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] _grades;


    /**
     * Constructs a Student with the given fields of information
     * @param studentId : The Students ID Number
     * @param firstName : The Students First Name
     * @param lastName : The Students Last Name
     * @param email : The Students Email address
     * @param age : The Students Age
     * @param grades : The Grades of the Student
     */
    public Student(String studentId,String firstName, String lastName, String email, int age, int[] grades)
    {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    }

    //Accessor Methods (get methods) and Mutator methods (set methods)

    /**
     * @return The student ID number
     */
    public String getStudentId()
    {
        return studentId;
    }

    /**
     * @param studentId : Set the Students ID Number
     */
    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    /**
     * @return the students First Name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName : Set the Students First Name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the students Last Name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName : Set the students Last Name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    /**
     * @return the students email address
     */
    public String getEmail()
    {
        return this.email;
    }

    /**
     * @param email : Set the students email address
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the students age in years
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * @param age : Set the students age in years
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * @return and array of the students grades
     */
    public int[] getGrades()
    {
        return this._grades;
    }

    /**
     * @param grades Set the students grades
     */
    public void setGrades(int[] grades)
    {
        this._grades = grades;
    }

    /**
     * @return a string of the students information with the appropriate format
     */
    public String infoToString()
    {
       // String gradeList = getGrades().toString();

        String fullInfo = "Student ID: " + this.getStudentId() + "\t First Name: " + this.getFirstName() + "\t Last Name: " + this.getLastName() + "\t Email: " + this.getEmail()
                + "\t Age: " + getAge() + "\t Grades: " + Arrays.toString(getGrades());

        return fullInfo;
    }

    /**
     * Prints out the return of the student.infoToString()
     */
    public void print()
    {
        System.out.println(infoToString());
    }
}