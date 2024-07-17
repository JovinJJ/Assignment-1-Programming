
/**
 * Write a description of class studentmark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner; // this is done for allowing the code to fetch the input from the user

public class studentmark
{
 
 
     public static void main (String[] args) {//shows the code where to start
         int numberOfStudents = 30;
         float[] marks = new float[numberOfStudents]; //here we create a marks array of length 30 which is mentioned in the question. Required for mark
         Scanner scanner = new Scanner(System.in);
     
     
        System.out.println("Give marks for 30 students: ");
     
        for(int i=0; i< numberOfStudents; i++){
             // check if input marks is between 0 and 30
             float temp = scanner.nextFlaot();
             
             if ( temp<0 || temp>30) {
                 System.out.println("Invalid marks, please enter the marks again");
             }
             
             marks[i] = temp;
     
        }
 
 
        System.out.println("Entered marks: ");
        for(int j=0; j<numberOfStudents; j++) {
             System.out.println(marks[j]);
     
            }
            
        // mean = sum of all marks/number of marks
        float total = 0;
    
        for (int i=0; i< numberOfStudents;i++) {
            total = total + marks[i];
        }
        
        float mean = total/numberOfStudents;
        
        float summedDiff=0
        for (int i=0;i<numberOfStudents; i++) {
            summedDiff = summedDiff+(marks[i]-mean)*(marks[i]-mean);
        }
        
        summedDiff = summedDiff/numberOfStudents;
        
        //float squareRootSummmedDiff = take a power (exponent) of 0.5
    
    
    
    
    
    
    
    
    
    
    
    
    } 
} 