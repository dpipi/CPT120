package Independent_Investigation_Effort_12;

public class MysteryProgram
{
   public static void main(String[] args) 
   {
      int a = 1680; // assign the value of 1680 to the variable a
      //@SuppressWarnings("unused")
      //double b = a /2; // This is not used???
      int c = 1; // assign the value of 1 to the variable c
      
      while(c <= (a/c))
      {
         if (a%c == 0) // if a remainder c (a%c) == 0 then do print command
         {
            System.out.println(c +"x" + (a/c) + "=" + a);
         }
         c++; // increment c
      }
   }
}

