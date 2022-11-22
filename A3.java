// import java.util.Scanner;
// import javax.swing.*;
import java.io.*;
// import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Rahul
 *  Class:          CS30S
 * 
 *  Assignment:     A3 Q1
 * 
 *  Description:    Program demonstrates the use of OOP.
 *                  The Employee class has setters and getter
 *                  methods to set and get different attributes/fields.
 *                  It also has a full-arg and no-arg constructor.
 *************************************************************/

public class A3 {

    public static void main(String[] args) throws IOException {
    // ***** constants *******
    
    // ***** variables *****

        int assignmentNumber = 3;       // Assignement number
        int questionNumber = 1;         // Question number
    
        // String banner = "";             // output banner
        // String prompt = "";             // prompt for user input
        
        // String strin = "";              // string for keyboard input
        // String strout = "";             // string for formatted output
        
        // String delim = "[ ]+";          // delimiter for splitting input records
        // String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        Employee[] employees = new Employee[5];     // List to hold 5 employees
    
    // ***** objects *****
    
        // Scanner scanner = new Scanner(System.in);
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        // PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        System.out.println(getBanner(nl, assignmentNumber, questionNumber));
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****

        employees[0] = new Employee();                          // Employee 1, with no arg
        employees[1] = new Employee(11.95, 20);     // Employee 2
        employees[2] = new Employee(20, 50);        // Employee 3 with OT hours
        employees[3] = new Employee(15.55, 60);     // Employee 4 with OT hours
        employees[4] = new Employee(11.95, 41);     // Employee 5 with OT hours

        // Print table
        System.out.format("%-6s %-5s %-9s %-9s %-9s %-9s", "ID", "HOURS", "WAGE", "R. Pay", "O.T. Pay", "G. Pay");
        System.out.println();   // Blank line for spacing
        for(Employee e : employees) {
            // Use custom toString method to get all fields and information of each class instance
            System.out.println(e.toString());
        }

        System.out.println();   // Blank line for spacing
        System.out.println();   // Blank line for spacing
        

        // Demonstrates wage getter and setter
        System.out.println("Employee 1 Wage = " + employees[0].getWage());
        System.out.println("  SET NEW WAGE");
        employees[0].setWage(21);   // Set wage to $21.00
        System.out.println("Employee 1 Wage = " + employees[0].getWage());
        
        System.out.println();   // Blank line for spacing
        
        
        // Demonstrates ID and regular pay getter
        System.out.println("Employee 2 ID = " + employees[1].getId());
        System.out.println("Employee 2 Regular Pay = " + employees[1].getRegularPay());
        
        System.out.println();   // Blank line for spacing


        // Demonstrates hours, OT hours, OT pay getters and hours setter
        System.out.println("Employee 3 Hours = " + employees[2].getHours());
        System.out.println("Employee 3 O.T. Hours = " + employees[2].getOvertimeHours());
        System.out.println("Employee 3 O.T Pay = " + employees[2].getOvertimePay());
        System.out.println("  SET NEW HOURS");
        employees[2].setHours(80);  // Set hours to 80
        System.out.println("Employee 3 Hours = " + employees[2].getHours());
        System.out.println("Employee 3 O.T. Hours = " + employees[2].getOvertimeHours());
        System.out.println("Employee 3 O.T Pay = " + employees[2].getOvertimePay());
        
        System.out.println();   // Blank line for spacing
        

        // Demonstrates ID, hours, wage, gross pay getters
        System.out.format("Employee 4 Id = %d, Hours = %d, Wage = $%.2f, Gross Pay = $%.2f" + nl,
                            employees[3].getId(),
                            employees[3].getHours(),
                            employees[3].getWage(),
                            employees[3].getGrossPay());
        System.out.println("  CHANGE HOURS AND WAGE");
        employees[3].setHours(1);   // Set hours to 1
        employees[3].setWage(1);    // Set wage to 1
        System.out.format("Employee 4 Id = %d, Hours = %d, Wage = $%.2f, Gross Pay = $%.2f" + nl,
                            employees[3].getId(),
                            employees[3].getHours(),
                            employees[3].getWage(),
                            employees[3].getGrossPay());
                            
        System.out.println();   // Blank line for spacing
        System.out.println();   // Blank line for spacing

        // Reprint table with new changes and pays calculated
        System.out.println("  REPRINT TABLE");
        System.out.format("%-6s %-5s %-9s %-9s %-9s %-9s", "ID", "HOURS", "WAGE", "R. Pay", "O.T. Pay", "G. Pay");
        System.out.println();   // Blank line for spacing
        for(Employee e : employees) {
            // Use custom toString method to get all fields and information of each class instance
            System.out.println(e.toString());
        }

    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        printClosingMessage();
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();

    } // end main

    // ***** User Defined Methods *****

    public static String getBanner(String nl, int x, int y) {
        // banner to returned to calling function
        String banner = "";

        banner = "*****************************" + nl;
        banner += "Name:        Rahul" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A" + x +  " Q" + y + nl;
        banner += "*****************************" + nl + nl;

        return banner;
    } // end banner

    public static void printClosingMessage() {
        System.out.println();
        System.out.println("End of processing");
        //fout.println("End of Processing");
    } // end print closing message
    
} // end FormatTemplate
