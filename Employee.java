public class Employee {

    private static int nextUid = 1000;

    private int uid;
    private double wage;
    private int hours;

    /* Constructors */
    public Employee() {
        this.wage = 0.0;
        this.hours = 0;
        this.uid = getNextId();
    }
    
    public Employee(double wage, int hours) {
        this.wage = wage;
        this.hours = hours;
        this.uid = getNextId();
    }

    public Employee(String first, String last, double wage, int hours) {
        this.wage = wage;
        this.hours = hours;
        this.uid = getNextId();
    }

    /* Getters */
    public double getWage() {
        return this.wage;
    }

    public int getHours() {
        return this.hours;
    }

    public int getId() {
        return this.uid;
    }

    /* Setters */
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setWage(int hours) {
        this.hours = hours;
    }

    /* Other Methods */
    private int getNextId() {
        return nextUid++;
    }

    @Override
    public String toString() {
        return "";
    }
}
