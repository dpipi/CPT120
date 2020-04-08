package Independent_Investigation_Effort_01;

import javax.swing.JOptionPane;

/* public class Myself - a class is a Blueprint for Myself 
   					   - a collection of methods */
public class Myself
{

   /*
    * public static void main(String[] args) - Is a Method Called Myself, public -
    * allows the method to be accessed from anywhere. static - allows the method to
    * be created/ loaded without creating an instance. void - is the return type,
    * void representing no return type main - is the name of the method. c
    */
   public static void main(String[] args)
   {
      // Wijesinghe, G. (2019). MyApps Portal. [online] Rmit.instructure.com.
      // Available at: https://rmit.instructure.com/courses/56609/assignments/373780
      // [Accessed 28 Aug. 2019].

      /*
       * Declare variable named message of type String - a variable is a place to
       * store information that can be altered and manipulated, and a way to name
       * data which helps it be understood and readable.
       */
      String message;
      message = "";
      message = message + "Hello world!\n";
      message = message + "My hobbies are...Programming, Movies and eating out\n";
      message = message +
                "Programming is can be used in my workplace for data transfer\n";
      JOptionPane.showMessageDialog(null, message);
   }
   /*
    * Code Blocks are a group of instructions / recipes or source code that is
    * grouped with a class or method, in java a code block is within the two brackets
    * { and }
    */
}
