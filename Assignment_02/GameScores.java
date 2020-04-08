package Assignment_02;

import javax.swing.JOptionPane;

/**
 * @author David Pipczak
 * @date 10/10/2019
 * @version 1.04
 * 
 *          This program displays a game score ladder of 10 players, It also takes
 *          input as a string and integer number to update the scores, this program
 *          then reorders them accordingly. The program checks for correct user
 *          input. The JOPtionPane.ShowMessageDialog output does have some alignment
 *          issues, this is around text formatting and having each row evenly spaced.
 *          currently as names and scores change the alignment changes, this is an
 *          issue. I have tried to cover input errors for null type, and no input,
 *          and wrong data type.
 */
public class GameScores
{

   public GameScores()
   {
      // Declare arrays with preset data
      String names[] =
               { "BOB", "BILL", "BEN", "RAY", "ROY", "REX", "JAY", "JOE", "JAX", "KYE" };
      int scores[] = { 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100 };

      // Display initial message
      String message = getMessage(names, scores);
      displayMessage(message, "SCORES");

      // Set conditions for loop
      boolean continueToRun = true;
      // Loop while no data
      while (continueToRun == true)
      {
         // Get Name from User
         String newName =
                  JOptionPane.showInputDialog("Enter Name (Click Cancel to QUIT)");
         // Check for input or cancel
         if (newName == null || newName.length() == 0)
         {
            if (newName == null)
            { // Cancel button pressed
               continueToRun = false;
            }
            else
            { // OK button pressed with no data
               displayMessage("PLEASE ENTER A NAME", "NO NAME ENTERED");
            }

         }
         else
         { // data entered
            // Set conditions for loop
            boolean isInteger = false;
            // Loop while no data or incorrect data type
            while (isInteger != true)
            {
               // Get user input and assign to variable score
               String userInput = JOptionPane
                        .showInputDialog("Enter Score (Click Cancel to QUIT)");
               // Check for input or cancel
               if (userInput == null || userInput.length() == 0)
               {
                  if (userInput == null)
                  { // Cancel button pressed
                     isInteger = true;
                     continueToRun = false;
                  }
                  else
                  { // OK button pressed with no data
                     displayMessage("PLEASE ENTER A SCORE", "NO SCORE ENTERED");
                  }
               }
               else
               {
                  try
                  {
                     int newScore = Integer.parseInt(userInput);
                     /**
                      * Check newScore variable data for position against other
                      * values in array
                      */
                     // Position 01
                     if (newScore > (int) scores[0])
                     {
                        ShiftElementsRight(names, scores, 0, newName, newScore);
                        // Position 02
                     }
                     else if (newScore > (int) scores[1])
                     {
                        ShiftElementsRight(names, scores, 1, newName, newScore);
                        // Position 03
                     }
                     else if (newScore > (int) scores[2])
                     {
                        ShiftElementsRight(names, scores, 2, newName, newScore);
                        // Position 04
                     }
                     else if (newScore > (int) scores[3])
                     {
                        ShiftElementsRight(names, scores, 3, newName, newScore);
                        // Position 05
                     }
                     else if (newScore > (int) scores[4])
                     {
                        ShiftElementsRight(names, scores, 4, newName, newScore);
                        // Position 06
                     }
                     else if (newScore > (int) scores[5])
                     {
                        ShiftElementsRight(names, scores, 5, newName, newScore);
                        // Position 07
                     }
                     else if (newScore > (int) scores[6])
                     {
                        ShiftElementsRight(names, scores, 6, newName, newScore);
                        // Position 08
                     }
                     else if (newScore > (int) scores[7])
                     {
                        ShiftElementsRight(names, scores, 7, newName, newScore);
                        // Position 09
                     }
                     else if (newScore > (int) scores[8])
                     {
                        ShiftElementsRight(names, scores, 8, newName, newScore);
                     }
                     isInteger = true;
                     /**
                      * Display output message after first run
                      */
                     String message1 = getMessage(names, scores);
                     displayMessage(message1, "SCORES");
                  }
                  catch (Exception e)
                  {
                     displayMessage("PLEASE ENTER AN INTEGER VALUE",
                                    "WRONG DATA TYPE");
                     isInteger = false;
                  }

               }

            }

         }

      }

   }

   /**
    * Shift elements of array from 0 to the right
    * 
    * @param names
    *           Array of type String
    * @param scores
    *           Array of type integer
    * @param arrayPosition
    *           integer location
    * @param newName
    *           any String
    * @param newScore
    *           any integer value
    * @return None
    */
   public void ShiftElementsRight(Object[] names, int[] scores, int arrayPosition,
                                  String newName, int newScore)
   {
      for (int elementShiftRight =
               8; elementShiftRight >= arrayPosition; elementShiftRight--)
      {
         names[elementShiftRight + 1] = names[elementShiftRight];
         scores[elementShiftRight + 1] = scores[elementShiftRight];
      }
      names[arrayPosition] = newName;
      scores[arrayPosition] = newScore;
   }

   /**
    * creates message with use of array data
    * 
    * @param names
    *           Array of type String
    * @param scores
    *           Array of type integer
    * @return message of type String
    */
   public String getMessage(Object[] names, int[] scores)
   {
      // Find character length of name
      String message = "TOP SCORES\n\n";
      for (int element = 1; element < 11; element++)
      {
         if (element - 1 < 9)
         {
            message = message + "0" + element + "          " + names[element - 1] +
                      "          " + scores[element - 1] + "\n";
         }
         else
         {
            message = message + element + "          " + names[element - 1] +
                      "          " + scores[element - 1] + "\n" +
                      "\nPress OK to Enter new Scores\n";
         }
      }
      return message;
   }

   /**
    * Display output message with JOptionPane
    * 
    * @param message
    *           of String type
    * @return None
    */
   public String displayMessage(String message, String title)
   {
      JOptionPane.showMessageDialog(null, message, title,
                                    JOptionPane.INFORMATION_MESSAGE);
      return null;
   }

   public static void main(String[] args)
   {
      @SuppressWarnings("unused")
      GameScores obj = new GameScores();
   }

}
