
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
         
         //enter the assignment name
         System.out.print("Enter the assignment name: ")
         String assignmentName = scanner.nextLine();
         
        // now we need to input the marks
         
         System.out.println("Give marks for 30 students: ");
     
        for(int i=0; i< numberOfStudents; i++){
            while (true){
                System.out.println("Enter mark for student "+(i+1)+":")
                float temp=scanner.nextFloat();
            
            
             // check if input marks is between 0 and 30
             
             
             if ( temp>=0 && temp<=30) {
                 marks[i]=temp;
                 break;
                 // we are ending the loop here since the valid mark is typed in
                } else{
                 System.out.println("Invalid marks, please enter the marks again");
             }
            }
        }
        
        // print entered marks
        System.out.println("Entered marks: ");
        for (int j = 0;j<numberOfStudents;j++) {
            System.out.println(marks[j]);
        }
        
        // highest mark
        float maximum = mark[0]; // we start maximum as the first mark
        for (int i=0; i<numberOfStudents; i++) {
            if (marks[i]>maximum){
                maximum=marks[i]; // we update the maximum marks after we check the current marks and it is greater
            }
        
        }
        System.out.println("Highest Mark: "+maximum);
        //calculate lowest marks
        
        float minimum = marks[0];//we give minimum with first mark
        for (int i=0;i<numberOfStudents;i++){
            if(marks[i]<minimum){
                minimum=marks[i]; // update minimum if current one is lower
            }
        }
        System.out.println("Lowest mark: "+minimum);
        
        //sum of marks
        
        float total =0;
        for (int i=0; i<numberOfStudents;i++){
            total+=marks[i];
        }
        System.out.println("Sum of mark: "+total);
        
        //finding mean
        
        float mean = total/numberOfStudents;
        System.out.println("Mean of marks: "+mean);
      
    
    
    } 
} 