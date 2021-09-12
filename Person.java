//Ameer Ahmed

//department

public class Person {

    //instance fields
    private String name; 
    private int age;
    private String SSN;
    private boolean alive;

    //no args constructor 
    public Person() {

    }

    //fully loaded constructor
    public Person(String name, int age, String SSN, boolean alive) {
        this.name = name;
        this.age = age; 
        this.SSN = 	SSN;
        this.alive = alive;
    }

    //getters
    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public String getSSN() {
        return this.SSN;
    }

    public boolean getalive() {
        return this.alive;
    }

    //setters
    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setalive(boolean alive) {
        this.alive = alive;
    }

    // toString method
    public String toString() {
        String output = "";
        output += "Person's Name: " + this.name + '\n';
        output += "The age is: " + this.age + '\n';
        output += "The SSN is: " + this.SSN + '\n';
        output += "The person is alive? : " + this.alive;
        return output;
    }
}