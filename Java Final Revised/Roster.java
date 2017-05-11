import java.util.ArrayList;

/**
 * C-169 Final Project
 *
 * @author (Tre Robinson)
 * @version (3.1)
 */

/**
 * Represents a List, "Roster", of Student objects
 */
public class Roster
{
    private static ArrayList<Student> classRoster = new ArrayList<>();

    /**
     * The main method begins execution of the classRoster
     * @param args not used
     */
    public static void main(String[] args)
    {
        String [] students =
                {
                        "1,John,Smith,John1989@gmail.com,20,88,79,59",
                        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                        "5,Tre,Robinson,trerrobinson@gmail.com,23,90,91,92"
                };

        convertStudents(students);

        print_all();
        print_invalid_emails();
        for(Student student : classRoster)
        {
            print_average_grade(student.getStudentId());
        }
        remove("3");
        remove("3");
    }

    /**
     * Breaks down @param students into the necessary parameters for the 'add' method
     * @param students : An array of strings that contains the information for each student
     */
    public static void convertStudents(String[] students)
    {
        for(String student : students)
        {
            String studentInfoString = new String();
            String[] studentInfo = new String[8];

            studentInfoString = student;
            studentInfo = studentInfoString.split(",");

            add(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3], Integer.parseInt(studentInfo[4]), Integer.parseInt(studentInfo[5]), Integer.parseInt(studentInfo[6]), Integer.parseInt(studentInfo[7]));
        }
    }

    /**
     * Student Constructor, and adds to the classRoster
     * @param studentId : The new Students ID Number
     * @param firstName : The new Students First Name
     * @param lastName : The new Students Last Name
     * @param email : The new Students Email address
     * @param age : The new Students Age
     * @param grade1 : The 1st grade of the new Student
     * @param grade2 : The 2nd grade of the new Student
     * @param grade3 : The 3rd grade of the new Student
     */
    public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
    {

        classRoster.add(new Student(studentId, firstName,lastName,email, age, new int[] {grade1, grade2, grade3}));
    }

    /**
     * Removes a Student from the Student roster based off of its studentId
     * @param studentId The studentId of the Student to be removed
     */
    public static void remove(String studentId)
    {
        boolean didRemove = false;

        for(int i = 0; i < classRoster.size(); i++)
        {
            if(studentId.equals(classRoster.get(i).getStudentId()))
            {
                didRemove = true;
                classRoster.remove(i);
            }
        }

        if(didRemove == false)
        {
            String error = new String("Student Cannot be Found");
            System.out.println(error);
        }
    }

    /**
     * Loops through classRoster, and calls the print() method per Student
     */
    public static void print_all()
    {
        for (Student student : classRoster)
        {
            student.print();
        }
    }

    /**
     * Prints the Average grade(double) of a student based of its studentId
     * @param studentId : the targeted studentId
     */
    public static void print_average_grade(String studentId)
    {
        for (Student student : classRoster)
        {
            if(studentId.equals(student.getStudentId()))
            {
                int totalGrade = 0;
                for (int thisGrade : student.getGrades())
                {
                    totalGrade = totalGrade + thisGrade;
                }

                double avgGrade = totalGrade/(double)student.getGrades().length;
                System.out.printf("The average grade for student " + studentId + " is: " + "%.2f", avgGrade);
                System.out.println();
            }
        }
    }

    /**
     * Loops through Students in classRoster and prints out invalid email address.
     */
    public static void print_invalid_emails()
    {
        for(Student student : classRoster)
        {
            //if(student.getEmail().matches("(.*)@.*\\.(.*)"))
            if(student.getEmail().matches("(\\S+)@(\\S+)\\.(\\S+)"))
            {
            }

            else
            {
                System.out.println("The following email address is invalid: " + student.getEmail());
            }
        }
    }

}