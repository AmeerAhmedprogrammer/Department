//Ameer Ahmed

//The teacher IS A person which means inheritance
//department 

public class Teacher extends Person {
    //instance fields 
    private String ID;
    private int salary;
    private int num_yr_prof;

    //no args constructor
    public Teacher() {

    }

    //fully loaded constructor
    public Teacher(String name, int age, String SSN, boolean alive, String ID, int salary, int num_yr_prof) {
        //new super statement
        super(name,age,SSN,alive);
        this.ID = ID;
        this.salary = salary;
        this.num_yr_prof = num_yr_prof;
    }

    //copy constructor
    public Teacher(Teacher t) {
        //super first
        super(t.getname(),t.getage(),t.getSSN(),t.getalive());

        this.ID = t.ID;
        this.salary = t.salary;
        this.num_yr_prof = t.num_yr_prof;
    }

    //getters
    public String getID() {
        return this.ID;
    }

    public int getsalary() {
        return this.salary;
    }

    public int getnum_yr_prof() {
        return this.num_yr_prof;
    }

    //setters 
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public void setnum_yr_prof(int num_yr_prof) {
        this.num_yr_prof = num_yr_prof;
    }

    // toString method
    public String toString() {
        String output = "";
        output += "The Teacher's Information is: \n" + super.toString() + '\n' + '\n';
        output += "The teacher ID is: " + this.ID + '\n';
        output += "The teacher's salary is: " + this.salary + '\n';
        output += "The number of years of the profession is: " + this.num_yr_prof + '\n' + '\n';
        return output;
    }
}