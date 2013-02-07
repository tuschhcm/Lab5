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

public class TestScores{

   //static fields
   final private double MIN_SCORE = 0;
   final private double MAX_SCORE = 100;
   
   //instance Fields
   private double[] scores;
   
   //constructor
   public TestScores(double[] s) {

      //import data into instance field
      scores = new double[s.length];
      for(int i = 0; i < s.length; i++) {
         if(s[i] < MIN_SCORE || s[i] > MAX_SCORE) {
            throw new IllegalArgumentException("Invalid Score: " + s[i]);
         
         } else {
            scores[i] = s[i];
         }
      }
   }
   
   //getAverage returns the average of all scores
   public double getAverage(){
      double total = 0;
      for(double s : scores)total += s;
      return total/scores.length;
   }
   
   //toString returns all values in scores
   public String toString(){
      StringBuilder string =  new StringBuilder();
      for(double s : scores)string.append(s + " ");
      return string.toString();
   }
}