public class Employee {

    private static final int OVERTIME_SART = 40;
    private static final double OVERTIME_MULTIPLIER = 1.5;
    
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

    /* Utility and Calculation Methods */
    public double getRegularPay() {
        return (this.wage * (this.hours % OVERTIME_SART));
    }
    
    public double getOvertimePay() {
        if (this.hours > OVERTIME_SART) {
            return (this.wage * OVERTIME_MULTIPLIER) * (this.hours-OVERTIME_SART);
        }
        return 0.0;
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
