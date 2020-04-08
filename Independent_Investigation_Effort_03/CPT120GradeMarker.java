package Independent_Investigation_Effort_03;

import java.util.Scanner;

public class CPT120GradeMarker
{

   public static void main(String[] args)
   {
      // Create Scanner Object named scanner1
      Scanner scanner1 = new Scanner(System.in);

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

      // Get input from user for IIE total
      System.out.print("Enter value for IIE total between 0 and 25: ");
      float IIEtotal = scanner1.nextFloat(); // Returns a double
      // test IIE value to ensure in correct range
      if (IIEtotal < 0 || IIEtotal > 25)
      {
         if (IIEtotal < 0)
         {
            IIEtotal = 0; // set value to 0 if user inputs value less than 0
         }
         else
         {
            IIEtotal = 25; // set value to 25 if user inputs value greater than 25
         }

      }

      // Get input from user for assignment total
      System.out.print("Enter assignment total 0-25: ");
      float assignmentTotal = scanner1.nextFloat(); // Returns an double
      // test assignmentTotal value to ensure in correct range
      if (assignmentTotal < 0 || assignmentTotal > 25)
      {
         if (assignmentTotal < 0)
         {
            IIEtotal = 0; // set value to 0 if user inputs value less than 0
         }
         else
         {
            assignmentTotal = 25; // set value to 25 if user inputs value greater
                                  // than 25
         }

      }

      // Calculate non exam total
      float nonExamTotal = IIEtotal + assignmentTotal;

      // Get input from user for exam total
      System.out.print("Enter exam total 0-50: ");
      float examTotal = scanner1.nextFloat(); // Returns a double
      // test examTotal value to ensure in correct range
      if (examTotal < 0 || examTotal > 50)
      {
         if (examTotal < 0)
         {
            IIEtotal = 0; // set value to 0 if user inputs value less than 0
         }
         else
         {
            examTotal = 50; // set value to 50 if user inputs value greater than 50
         }

      }

      // Round up results for final course mark
      int finalCourseMark = Math.round(nonExamTotal + examTotal);
      // Test and Display Grade and Course Code
      if (finalCourseMark <= 49)
      {
         System.out.println("\r" + finalCourseMark + " Fail");
      }
      else if (finalCourseMark >= 50 && finalCourseMark <= 59)
      {
         System.out.println("\r" + finalCourseMark + " Pass");
      }
      else if (finalCourseMark >= 60 && finalCourseMark <= 69)
      {
         System.out.println("\r" + finalCourseMark + " Credit");
      }
      else if (finalCourseMark >= 70 && finalCourseMark <= 79)
      {
         System.out.println("\r" + finalCourseMark + " Distinction");
      }
      else if (finalCourseMark >= 80)
      {
         System.out.println("\r" + finalCourseMark + " High Distinction");
      }

      scanner1.close();
   }
}