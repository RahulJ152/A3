public class Employee {

    private static final int OVERTIME_START = 40;           // Hours after this are overtime hours
    private static final double OVERTIME_MULTIPLIER = 1.5;  // Wage multiplier
    
    // Current Unique ID shared by every class instance
    private static int nextUid = 1000;

    private int uid;        // class instances unique ID, gotten from nextUid
    private double wage;    // Wage
    private int hours;      // Hours

    /* Constructors */
    public Employee() {
        // No-arg constructor
        // Sets attributes to default values
        this.wage = 0.0;
        this.hours = 0;
        this.uid = getNextId();     // Gets UID
    }
    
    public Employee(double wage, int hours) {
        // Full-arg constructor
        // Sets attributes to parameters passed in
        this.wage = wage;
        this.hours = hours;
        this.uid = getNextId();     // Gets UID
    }

    /* Getters */
    /** @return double wage */
    public double getWage() {
        return this.wage;
    }
    
    /** @return int hours */
    public int getHours() {
        return this.hours;
    }
    
    /** @return int overtime hours */
    public int getOvertimeHours() {
        // If hours greater then overtime start hours then return OT hours.
        // Else return 0 OT hours.
        return this.hours > OVERTIME_START ? this.hours-OVERTIME_START : 0;
    }
    
    /** @return int Unique ID*/
    public int getId() {
        return this.uid;
    }

    /* Setters */
    /** Sets wage*/
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    /** Sets hours*/
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    /* Utility and Calculation Methods */
    /** @return double regular pay*/
    public double getRegularPay() {
        // if hours is greater then overtime start hours
        // then only multiply wage by overtime start hours.
        // Else multiply by hours.
        return this.hours > OVERTIME_START ? this.wage * OVERTIME_START: this.wage * this.hours;
    }
    
    /** @return double overtime pay */
    public double getOvertimePay() {
        // Wage times overtime wage multiplier times overtime hours
        return (this.wage * OVERTIME_MULTIPLIER) * (this.getOvertimeHours());
    }
    
    /** @return double gross pay, regular pay plus overtime pay */
    public double getGrossPay() {
        // Regular pay plus overtime pay
        return getRegularPay() + getOvertimePay();
    }
    
    /* Other Methods */
    /** @return int next ID */
    private int getNextId() {
        return nextUid++;   // Return shared UID then increment it
    }
     
    /** @return string with all attribute information */
    @Override
    public String toString() {
        return String.format("%-6s %-5d $%-8.2f $%-8.2f $%-8.2f $%-8.2f",
                            this.uid,
                            this.hours,
                            this.wage,
                            this.getRegularPay(),
                            this.getOvertimePay(),
                            this.getGrossPay());
    }
}
