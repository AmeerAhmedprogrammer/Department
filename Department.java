//Ameer Ahmed

public class Department {

    //instance variables
    private String deptName;
    private int numMajors;
    private Teacher[] listTeachers; //inherits from person class
    private Student[] listStudents; //inherits from person class

    //no args constructor
    public Department() {

    }

    //fully loaded constructor
    public Department(String deptName, int numMajors, Teacher[] listTeachers, Student[] listStudents) {
        this.deptName = deptName;
        this.numMajors = numMajors;

        //array
        this.listStudents = new Student[listStudents.length];
        for(int j = 0; j < listStudents.length; j++) {
            this.listStudents[j] = new Student (listStudents[j]);
        }
        //array
        this.listTeachers =  new Teacher[listTeachers.length];
        for(int q = 0; q < listTeachers.length; q++) {
            this.listTeachers[q] = new Teacher (listTeachers[q]);
        }
    } 

    //copy constructor
    public Department(Department d) {
        this.deptName = d.deptName;
        this.numMajors = d.numMajors;

        //array
        this.listStudents = new Student[d.listStudents.length];
        for(int i = 0; i < listStudents.length; i++) {
            this.listStudents[i] = new Student (d.listStudents[i]);
        }

        //array
        this.listTeachers =  new Teacher[d.listTeachers.length];
        for(int i = 0; i < listTeachers.length; i++) {
            this.listTeachers[i] = new Teacher (d.listTeachers[i]);
        }
    }

    //getters
    public String getdeptName() {
        return this.deptName;
    }

    public int getnumMajors() {
        return this.numMajors;
    }

    //deep getter Teacher
    public Teacher [] getTeacher() {
        Teacher[] copyTeacher = new Teacher[this.listTeachers.length];
        for(int j = 0; j < listTeachers.length; j++) {
            copyTeacher[j] = new Teacher(this.listTeachers[j]);
        }
        return copyTeacher;
    }

    //deep getter Student
    public Student[] getStudent() {
        Student[] copyStudent = new Student[this.listStudents.length];
        for(int i = 0; i < listStudents.length; i++) {
            copyStudent[i] = new Student(this.listStudents[i]);
        }
        return copyStudent;	
    }

    //setters
    public void setdeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setnumMajors(int numMajors) {
        this.numMajors = numMajors;
    }

    //deep setter Teacher

    public void setTeacher (Teacher [] t) {
        this.listTeachers = new Teacher[t.length];
        for(int i = 0; i < t.length; i++) {
            this.listTeachers[i] = new Teacher (t[i]);	
        }
    }

    //deep setter Student 
    public void setStudent(Student [] s) {
        this.listStudents = new Student[s.length]; 
        for(int i = 0; i < s.length; i++) {
            this.listStudents[i] = new Student (s[i]);
        }
    }

    //toString method
    public String toString() {
        String output = "";
        output += "The department name is: " + this.deptName + '\n';
        output += "The number of majors is: " + this.numMajors + '\n';

        for(int i = 0; i < listTeachers.length; i++) {
            output += listTeachers[i].toString();
        }

        for(int i = 0; i < listStudents.length; i++) {
            output += listStudents[i].toString();
        }
        return output;
    }
}