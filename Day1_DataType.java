import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int integer;
        double decimal;
        String string;
        int integer;
        double decimal;
        String string;
        // Read and save an integer, double, and String to your variables.
        integer=scan.nextInt();
        decimal=scan.nextDouble();
        scan.nextLine();
        string=scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+integer);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+decimal);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.print(s.concat(string));

        scan.close();
    }
}
