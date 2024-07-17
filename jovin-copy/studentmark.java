
/**
 * Write a description of class studentmark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; // this is done for allowing the code to fetch the input from the user

public class studentmark
{
 
 
 public static void main (String[] args)//shows the code where to start
 {
     
 int numberOfStudents = 30;
 float[] marks = new float[numberOfStudents]; //here we create a marks array of length 30 which is mentioned in the question. Required for mark
 Scanner takeinput = new Scanner(System.in);
     
     
     System.out.println("Give marks for 30 students: ");
     
     for(int i=0; i< numberOfStudents; i++) {
         marks[i] = Scanner.nextFloat();
     
 }
 
 
 System.out.println("Entered marks: ");
 for(int j=0; j<numberOfStudents; j++) {
     System.out.println(marks[j]);
 }
 }
} 
