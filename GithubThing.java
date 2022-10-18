import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Denise
 *  Class:          CS30S
 * 
 *  Assignment:     Research Project 2
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class GithubThing {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        //String banner = "";             // output banner
        int x = 0;                      // assignemnt number for banner
        int y = 0;                      // question number for banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        
        
        System.out.println(getBanner(nl, x, y));
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        printClosingMessage();
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
    // **** user defined methods ****
    
    public static String getBanner(String nl, int x, int y){
        String banner = "";   // banner to be returned to calling function 
        
        banner = "*****************************" + nl;
        banner += "Name:        Denise" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A" + x + " Q" + y + nl;
        banner += "*****************************" + nl + nl;
        
        return banner;
    }//end banner
    
    public static void printClosingMessage(){
        System.out.println();
        System.out.println("end of processing");
    }// end print closing message
} // end FormatTemplate
