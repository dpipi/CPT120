// Good work on demonstrating effort with the Song class. As you know,
// this mark is not based on the correctness of your submission. In assessments,
// all students are required to demonstrate apporaches, patterns shown in class
// examples.

// Note: Please remmember to always submit only valid Java that can be run and tested.

// Simply reading a final code solution does not give anyone the ability to
// iteratively develop and debug code so, please watch the 21/October/2019
// lecture recording below and re-write the code below on your own. The
// code below is given only for ease of referencing only:
// https://au-lti.bbcollab.com/recording/bb2fa92cc8bf45eda1dd372d28eac69c

// Note: Please ensure that your file is named Song.java

package Independent_Investigation_Effort_08;

public class Song
{
   private String title;
   private String location;
   // private int rating;

   public Song(String title, String location)
   {
      this.title = title;
      this.location = location;
      // this.rating = -1; // Must also initialise all remaining member variables
   }

   // A set method is like a mini constructor that works just for one member
   // variable.
   // public void setTitle(String title) {
   // if (title != null && title.trim().length() > 0)
   // this.title = title;
   // }

   public String getTitle()
   {
      return this.title;
   }

   public String getLocation()
   {
      return this.location;
   }
}
