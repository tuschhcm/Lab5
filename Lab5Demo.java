//***********************************************************************
// Project: Lab 5
//
// Author: Craig Tuschhoff
//
// Completion time: 1.5 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (write names here or no one) in designing and
// debugging my program.
//***********************************************************************

import java.util.*;

public class Lab5Demo {
   public static void main(String[] args) {
      double[] userInput = new double[5];
      Scanner keyboard = new Scanner(System.in);
      boolean validEntry = false;
      
      while(!validEntry){
         try{   
            //read in five test scores from user
            System.out.print("Enter 5 scores: ");
            for(int i = 0; i < userInput.length; i++) {
               userInput[i] = keyboard.nextDouble();
            } 
            
            //Create the TestScores object and display the values and the mean
            TestScores exam = new TestScores(userInput);
            System.out.println("The scores are: " + exam);
            System.out.println("Their average is " + exam.getAverage());
            validEntry = true;
         
         } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            validEntry = false;
         
         } catch(InputMismatchException e) {
            System.out.println("Input must be numeric");
            keyboard.nextLine();
            validEntry = false;
         }
      }
   }
}