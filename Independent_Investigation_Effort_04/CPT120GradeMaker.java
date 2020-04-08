package Independent_Investigation_Effort_04;

import javax.swing.JOptionPane;

public class CPT120GradeMaker
{
   public static void main(String[] args)
   {
      // Scenario 2: Repeating indefinitely(not infinitely)
      /*
       * DATA TYPES - I would use a float type to store values. Other options could
       * be of integer type (byte, short, integer, long) or could be double. if using
       * one of the integer types (byte, short, integer, long) these would not allow
       * for decimal places, although using a byte would use the least memory out of
       * the four, when using a double, this would allow for decimal places, the
       * issue would be that it uses more memory space than float, the float is
       * stored in 32bits of memory as opposed to a double which uses 64bits of
       * memory.
       */

      /*
       * CONTROLLING TOTALS - I would test each input as they are enter to see if
       * they are within range, if they are not in range and they are over you could
       * get the user to re-enter the value, or you could use an if statement and set
       * the value to the maximum or minimum value depending on its positive or
       * negative direction
       */

      /*
       * NEGATIVE VALUES - when testing for negative values you could assign the
       * value to 0 or you could ask the user to enter a value greater than 0
       */

      // Declare variables
      String grade = null;
      boolean continueMarking = true;

      // Grade why conditions are true
      while (continueMarking == true)
      {

         // "Enter value for IIE total between 0 and 25: "
         float IIEtotal = Float.parseFloat(JOptionPane
                  .showInputDialog("Enter IIE total score 0 to 25"));
         // Test if IIEtotal value is in required range, set to lower or upper value
         // if
         // out of range
         if (IIEtotal < 0)
         {
            IIEtotal = 0;
         }
         else if (IIEtotal > 25)
         {
            IIEtotal = 25;
         }
         // "Enter value for assignment total total between 0 and 25: "
         float assignmentTotal = Float
                  .parseFloat(JOptionPane
                           .showInputDialog("Enter assignment total score 0 to 25"));
         // Test if assignment total value is in required range, set to lower or
         // upper
         // value if out of range
         if (assignmentTotal < 0)
         {
            assignmentTotal = 0;
         }
         else if (assignmentTotal > 25)
         {
            assignmentTotal = 25;
         }
         // "Enter value for exam total between 0 and 50:
         float examTotal = Float.parseFloat(JOptionPane
                  .showInputDialog("Enter exam total score 0 to 50"));
         // Test if exam total value is in required range, set to lower or upper
         // value if
         // out of range
         if (examTotal < 0)
         {
            examTotal = 0;
         }
         else if (examTotal > 50)
         {
            examTotal = 50;
         }

         float nonExamTotal = IIEtotal + assignmentTotal;
         // Round up results for final course mark
         int finalCourseMark = Math.round(nonExamTotal + examTotal);
         // Set String variable to grade type
         if (finalCourseMark < 50)
         {
            grade = " NN";
         }
         else if (finalCourseMark < 60)
         {
            grade = " PA";
         }
         else if (finalCourseMark < 70)
         {
            grade = " CR";
         }
         else if (finalCourseMark < 80)
         {
            grade = " DI";
         }
         else if (finalCourseMark > 80)
         {
            grade = " HD";
         }

         // Display results to user
         JOptionPane.showMessageDialog(null, "\r" + finalCourseMark + grade); // Display
                                                                              // result

         // Ask user if they wish to mark another
         int question =
                  JOptionPane.showInternalConfirmDialog(null, "Mark another?", null,
                                                        JOptionPane.YES_NO_OPTION);
         // Test user input for exit
         if (question == 1)
         { // User wishes to stop marking
            question = JOptionPane
                     .showInternalConfirmDialog(null,
                                                "Are You sure you want to exit?",
                                                null,
                                                JOptionPane.YES_NO_OPTION);
            // Double check user wants to exit
            if (question == 0)
            { // user confirms they want to exit
               continueMarking = false;
            }
         }
      }

   }

   public static void main51(String[] args)
   {
      // Scenario 1: Repeating a specified number of times
      /*
       * DATA TYPES - I would use a float type to store values. Other options could
       * be of integer type (byte, short, integer, long) or could be double. if using
       * one of the integer types (byte, short, integer, long) these would not allow
       * for decimal places, although using a byte would use the least memory out of
       * the four, when using a double, this would allow for decimal places, the
       * issue would be that it uses more memory space than float, the float is
       * stored in 32bits of memory as opposed to a double which uses 64bits of
       * memory.
       */

      /*
       * CONTROLLING TOTALS - I would test each input as they are enter to see if
       * they are within range, if they are not in range and they are over you could
       * get the user to re-enter the value, or you could use an if statement and set
       * the value to the maximum or minimum value depending on its positive or
       * negative direction
       */

      /*
       * NEGATIVE VALUES - when testing for negative values you could assign the
       * value to 0 or you could ask the user to enter a value greater than 0, asking
       * the user to re enter a value greater than zero could be done using a while
       * loop. In this particular code i have used rounding, so if a negative value
       * is entered it will be set to a 0 value.
       */

      // Declare variables
      int counter = 0;
      int HowManyMarks = 0;
      String grade = null;

      // Get input from user, loop while value less than 1
      while (HowManyMarks <= 0)
      {
         // Get Grades to mark total from user
         HowManyMarks = Integer.parseInt(JOptionPane
                  .showInputDialog("Enter amount of Grades to mark"));
      }

      // loop until conditions are met
      while (counter < HowManyMarks)
      {

         // "Enter value for IIE total between 0 and 25: "
         float IIEtotal = Float.parseFloat(JOptionPane
                  .showInputDialog("Enter IIE total score 0 to 25"));
         // Test if IIEtotal value is in required range
         if (IIEtotal < 0)
         { // if less than zero (negative value) set to 0
            IIEtotal = 0;
         }
         else if (IIEtotal > 25)
         { // if less larger than 25 set to 25
            IIEtotal = 25;
         }

         // "Enter value for assignment total total between 0 and 25: "
         float assignmentTotal = Float
                  .parseFloat(JOptionPane
                           .showInputDialog("Enter assignment total score 0 to 25"));
         // Test if assignment total value is in required range
         if (assignmentTotal < 0)
         { // if less than zero (negative value) set to 0
            assignmentTotal = 0;
         }
         else if (assignmentTotal > 25)
         { // if less larger than 25 set to 25
            assignmentTotal = 25;
         }

         // "Enter value for exam total between 0 and 50:
         float examTotal = Float.parseFloat(JOptionPane
                  .showInputDialog("Enter exam total score 0 to 50"));
         // Test if exam total value is in required range
         if (examTotal < 0)
         { // if less than zero (negative value) set to 0
            examTotal = 0;
         }
         else if (examTotal > 50)
         { // if less larger than 25 set to 25
            examTotal = 50;
         }

         float nonExamTotal = IIEtotal + assignmentTotal;
         // Round up results for final course mark
         int finalCourseMark = Math.round(nonExamTotal + examTotal);
         // Test and Display Grade and Course Code
         if (finalCourseMark < 50)
         {
            grade = " NN";
         }
         else if (finalCourseMark < 60)
         {
            grade = " PA";
         }
         else if (finalCourseMark < 70)
         {
            grade = " CR";
         }
         else if (finalCourseMark < 80)
         {
            grade = " DI";
         }
         else if (finalCourseMark > 80)
         {
            grade = " HD";
         }

         JOptionPane.showMessageDialog(null, "\r" + finalCourseMark + grade); // Display
                                                                              // result
         counter++;

      }
   }
}