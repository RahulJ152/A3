// import java.util.Scanner;
// import javax.swing.*;
import java.io.*;
// import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Rahul
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class A3 {

    public static void main(String[] args) throws IOException {
    // ***** constants *******
    
    // ***** variables *****

        int assignmentNumber = 0;       // Assignement number
        int questionNumber = 0;         // Question number
    
        // String banner = "";             // output banner
        // String prompt = "";             // prompt for user input
        
        // String strin = "";              // string for keyboard input
        // String strout = "";             // string for formatted output
        
        // String delim = "[ ]+";          // delimiter for splitting input records
        // String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
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
