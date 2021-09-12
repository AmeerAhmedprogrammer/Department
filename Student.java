//Ameer Ahmed

//The student IS A person which means inheritance
//department

public class Student extends Person {

    //define instance fields 
    private String stu_id;
    private double GPA;
    private String grade;

    // no args constructor 
    public Student() {

    }

    //Loaded Constructor
    public Student (String name, int age, String SSN, boolean alive, String stu_id, double GPA, String grade) {
        //new super statement
        super(name,age,SSN,alive);
        this.stu_id = stu_id;
        this.GPA = GPA;
        this.grade = grade;
    }

    //copy constructor
    public Student(Student s) {
        //super first
        super(s.getname(),s.getage(),s.getSSN(),s.getalive());

        this.stu_id = s.stu_id;
        this.GPA = s.GPA;
        this.grade = s.grade;
    } 

    //getters 
    public String getstu_id() {
        return this.stu_id;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String getgrade() {
        return this.grade;
    }

    //setters
    public void setstu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }

    // toString method
    public String toString() {
        String output = "";
        output += "The Student's Information is: \n" + super.toString() + '\n';
        output += "The Student ID is: " + this.stu_id + '\n';
        output += "The GPA is: " + this.GPA + '\n';
        output += "The grade is: " + this.grade + '\n' + '\n';
        return output;
    }
}