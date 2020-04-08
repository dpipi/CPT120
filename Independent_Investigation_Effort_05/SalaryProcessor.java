package Independent_Investigation_Effort_05;

import javax.swing.JOptionPane;

public class SalaryProcessor
{

   public static void main(String[] args)
   {

      // Declare variables
      int arraySize = 0;
      String errorMessage = null;
      String keyboardInput;
      boolean isInteger = false;
      // Loop while User input not an integer / can not be converted to integer value
      while (isInteger != true)
      {
         /*
          * Get input from user for array length and test if input can be converted
          * into an integer value, It will do this by use of a try / catch statement
          * block, and will throw a message "Please enter an integer value" any
          * string will be rejected as well as a any float value. Does not include an
          * individual way to quickly exit, this would need to be added for a quick
          * exit option.
          */
         if (errorMessage == null)
         { // Take keyboard input on first cycle, message is equal to null
            keyboardInput = JOptionPane
                     .showInputDialog("\n" + "Enter array size as an integer value",
                                      JOptionPane.INFORMATION_MESSAGE);
         }
         else
         { // Take input after 1st cycle, message no longer equal to null
            keyboardInput = JOptionPane.showInputDialog(
                                                        errorMessage + "\n" +
                                                        "Enter array size as an integer value",
                                                        JOptionPane.QUESTION_MESSAGE);
         }
         // Test User input for integer conversion
         try
         { // try convert User input to integer
            arraySize = Integer.parseInt(keyboardInput);
            isInteger = true; // exit while loop
         }
         catch (Exception NonParse)
         { // User input can not be converted so Output message
            errorMessage = "Please enter an Integer value";
         }

      }
      /*
       * Get user to enter both Job titles and salary amounts up to the end of the
       * array length. NO_ERROR_CHECKING here
       */
      // Declare and create array to size equal to user input integer value taken
      // from
      // variable 'arraySize'
      double[] salaries = new double[arraySize];
      String[] jobNames = new String[arraySize];
      // initialize counter variable
      int counter = 0;
      // Loop while counter value is less than arraySize value
      while (counter < arraySize)
      {
         // Get user input for job name
         String jobTitle = JOptionPane.showInputDialog("Enter Job Title");
         // Add jobTitle to JobNames array
         jobNames[counter] = jobTitle;
         // Get user input for salary name
         /*
          * Input request taken as a float, this could cause an error if other data
          * types are entered, in this while loop there is no error checking present
          */
         float salary = Float
                  .parseFloat(JOptionPane.showInputDialog("Enter Salary amount"));
         // Add salary amount to salaries array
         salaries[counter] = salary;
         // update counter
         counter++;
      }

      /*
       * Extracting data from arrays - jobNames and salaries, then adding jobs and
       * salaries to variable 'message
       */
      // Loop goes through indices 0, 1, 2
      int i = 0;
      String outputMessage = null;
      while (i < arraySize)
      {
         // Retrieve and display value at i (current element)
         if (outputMessage == null)
         { // first cycle
            outputMessage = jobNames[i] + ": $" + salaries[i] + "\n"; // Add to
                                                                      // message
         }
         else
         { // second cycle
            outputMessage = outputMessage + jobNames[i] + ": $" + salaries[i] + "\n"; // Add
                                                                                      // to
                                                                                      // message
         }

         i = i + 1;

      }
      /*
       * Calculate total and average salaries values from array 'salaries'
       */
      double total = 0;
      // cycle through salaries indexes
      for (double value : salaries)
      {
         total = total + value; // Add total of salary index values
      }
      // Add total value to outputMessage
      outputMessage = outputMessage + "\nTotal of salaries $" + total + "\n"; // Add
                                                                              // to
                                                                              // message
      // Calculate average of all salaries
      double average = total / salaries.length;
      // Add average value to outputMessage
      outputMessage = outputMessage + "Average salary is $" + average + "\n\n"; // Add
                                                                                // to
                                                                                // message

      /*
       * For each salary, work out if it is above or below the average and display
       * the difference
       */
      // loop through salaries
      counter = 0;
      while (counter < arraySize)
      {
         if (salaries[counter] > average)
         { // Salary above average
            double difference = (salaries[counter] - average);
            outputMessage = outputMessage + "You would earn $" + salaries[counter] +
                            " as an " + jobNames[counter] // Add
                            // to
                            // message
                            + "\n which is $" + difference +
                            " above the average salary\n\n";

         }
         else if (salaries[counter] == average)
         { // Salary equals average
            outputMessage = outputMessage + "You would earn $" + salaries[counter] +
                            " as an " + jobNames[counter] // Add
                            // to
                            // message
                            + "\nwhich is $ is equal to the average salary\n\n";

         }
         else
         { // Salary is below average
            double difference = (average - salaries[counter]);
            outputMessage = outputMessage + "You would earn $" + salaries[counter] +
                            " as an " + jobNames[counter] // Add
                            // to
                            // message
                            + "\nwhich is $" + difference +
                            " below the average salary\n\n";

         }
         counter++;
      }

      /*
       * is with output could be that the values in message are not rounded to 2
       * decimal places, This depends on how accurate the output needs to be
       */
      // Display message
      JOptionPane.showMessageDialog(null, outputMessage + "\n", "OUTPUT MESSAGE",
                                    JOptionPane.INFORMATION_MESSAGE);

   }
}