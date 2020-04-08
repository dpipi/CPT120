package Independent_Investigation_Effort_06;

import javax.swing.JOptionPane;

/**
 * @author David Pipczak, s3805554
 * @version 2.0
 * 
 *          This program calculates paint costs for a wall and or project based on
 *          room height, room length, costs per square meter. For this program i
 *          needed to make two objects, first one called 'getWallArea' to ask the
 *          user for input and calculate the area of the wall, the second object
 *          called 'calculateCost' is used to calculate the total cost to paint the
 *          wall. Processes to get the program working involved moving repetitive
 *          code into these two modules.The original program had errors when entering
 *          no value so i added a try/catch block to overcome the issue.
 */
public class RenovationProjectManager
{

   public RenovationProjectManager()
   {
      /*
       * Code needed to be modified to work in constructor changes had to me made to
       * the way that methods 'getWallArea' and 'calculateCosts' had been called,
       * original code had an instance created, the original code was coded in the
       * 'RenovationProjectManager project = new RenovationProjectManager' and when
       * calling the methods the code was 'project.getWallArea' , the code was more
       * when using a constructor and did not need to call the object using project
       * and was able to call it directly by its name
       */
      // Declare and initialize variables
      double wallArea = 0, cost;
      int selection;
      // Set up Menu for user interaction
      String tempInput = "";
      String menu = "Menu:\n";
      menu += "1. Calculate paint required for a wall\n";
      menu += "2. Calculate paint required for project\n";
      menu += "Press Cancel then OK to exit\n";

      while (tempInput != null)
      { // run while until null input returned
         tempInput = JOptionPane.showInputDialog(menu); // Display menu

         try
         {
            selection = Integer.parseInt(tempInput);

            if (selection == 1)
            { // Paint required for wall
               tempInput = JOptionPane.showInputDialog("Enter a wall name"); // Get
                                                                             // user
                                                                             // input
               wallArea = getWallArea(tempInput); // Call object
               cost = calculateCost(wallArea); // Call object

               JOptionPane.showMessageDialog(null,
                                             "Cost to paint " + tempInput +
                                                   " wall of " + wallArea +
                                                   " sq.m. is $" + cost);

            }
            else if (selection == 2)
            { // Paint required for Project
               tempInput = JOptionPane.showInputDialog("Enter a wall name"); // Get
                                                                             // user
                                                                             // input
               wallArea = getWallArea(tempInput); // Call object
               cost = calculateCost(wallArea); // Call object

               JOptionPane.showMessageDialog(null,
                                             "Cost to paint " + tempInput +
                                                   " wall(s) of " + wallArea +
                                                   " sq.m. is $" + cost);
            }
         }
         catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Invalid choice! press OK to exit");

         }
      }

   }

   /**
    * Returns a double value, which is height times length taken as user input
    * 
    * @param tempInput
    *           any String
    * @param height
    *           any double value
    * @param length
    *           any double value
    * @return height * length
    */
   public double getWallArea(String tempInput)
   {

      double height = Double.parseDouble(JOptionPane
               .showInputDialog("Enter " + tempInput + " wall height (m)"));
      double length = Double.parseDouble(JOptionPane
               .showInputDialog("Enter " + tempInput + " wall length (m)"));
      double wallArea = height * length;
      return (wallArea);
   }

   /**
    * Returns a double value, which is wallArea times costPerSqm
    * 
    * @param wallArea
    *           any double value
    * @param costPerSqm
    *           any double value
    * @return wallArea * costPerSqm
    */
   public double calculateCost(double wallArea)
   {
      double costPerSqm = Double
               .parseDouble(JOptionPane.showInputDialog("Enter cost per sq.m ($)"));
      double cost = wallArea * costPerSqm; // Calculate area
      return (cost);
   }

   /**
    * Main Program is based around the menu system with minimal input required and
    * the main use is user input selection and information displayed back to to the
    * user.
    */
   public static void main(String[] args)
   {
      /*
       * Comments for the main method am unsure of!, what should we have and not
       * have? Did we need to use a constructor in this program? i'm not sure I can
       * see the advantages of using it, probably in a better way!, I would Think
       * that the constructor method is similar python's __init__ which you can use
       * to initialize variables etc when the object is created. This process also
       * reminds me of python's 'if '__name__' == __main__: method which is used to
       * then call the main program.
       */
      new RenovationProjectManager();

   }
}