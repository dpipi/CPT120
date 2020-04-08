package Assignment_01;

import java.util.Scanner; // Import Scanner 

public class StoryMaker
{
   // Carle, E. (2019). The Official Eric Carle Web Site
   // Reviews. [online] Eric-carle.com.
   // Available at: http://www.eric-carle.com/rev-VHC.html [Accessed 12 Sep. 2019].

   public static void main(String[] args)
   {
      // Create Scanner object named keyboardInput
      Scanner keyboardInput = new Scanner(System.in);

      // Display message on console to give user instruction
      // and to assist in the correct input type and range
      // for the variable of type 'byte'
      System.out.println("enter a number between 1 to 100:");

      // Take input from user as type 'byte', Type 'byte' used due to small memory
      // space and it covers the range of values. short, integer and long could have
      // been used although they would have wasted memory resources. If wrong input
      // type such as a string or decimal number is entered this will cause an
      // InputMisMatchExecption Error
      byte number = keyboardInput.nextByte();

      // Display message on console to give user instruction
      // and to assist in the correct input type, type 'String'
      System.out.println("enter a name:");

      // Take Input from user as type 'String' and assign it to variable named
      // 'nameOne' If wrong input type such as a string or decimal number is
      // entered this will cause an InputMisMatchExecption Error
      String nameOne = keyboardInput.next();

      // Display message on console to give user instruction
      // and to assist in the correct input type, type 'String'
      System.out.println("enter a second name:");

      // Take Input from user as type 'String' and assign it to variable named
      // 'nameOne' If wrong input type such as a string or decimal number is
      // entered this will cause an InputMisMatchExecption Error
      String nameTwo = keyboardInput.next();

      // Declare variable named 'storyInsert' of type 'String' depending on the value
      // stored in the variable named 'number' the string stored in the variable
      // 'storyInsert' changes
      String storyInsert;

      // check if variable named 'number' has a value that is less than or equal to
      // 10
      // assign string to storyInsert variable
      if (number <= 10)
      {
         storyInsert = "This made him very very Happy ";
      }
      // check if variable named 'number' has a value that is greater than 10 and
      // less
      // than 20, and if true assign string to storyInsert variable
      else if (number > 10 && number <= 20)
      {
         storyInsert = "This made hime very very fat";
      }
      // if integer variable named 'number' is greater than 20
      // assign string to storyInsert variable
      else
      {
         storyInsert = "This made him very very sick";
      }

      // Declare variable named story as type string and create story
      // Create story string inserting user inputs of both types, numbers and strings
      String story = "\nThere was a caterpillar named " + nameOne + "\n";
      story = story + nameOne + " was a very hungry catterpillar\n";
      story = story + nameOne + " ate " + number + " leaves of the tree, " +
              storyInsert + "\n";
      story = story + nameOne + " then grew and grew and grew and changed into a\n";
      story = story + "beautiful butterfly and had a new name called " + nameTwo;

      // close Scanner object named keyboardInput
      keyboardInput.close();

      // Display story on console
      System.out.println(story);
   }

}
