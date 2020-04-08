package Independent_Investigation_Effort_02;

public class TypeDemo
{

   public static void main(String[] args)
   {
      // Create 8 variables; one for each primitive data type:
      // byte, short, integer, long, float, double, boolean, character

      byte carTyreCost = 127;
      short newCarCost = 32767;
      int buildingProjectCost = 2147483647;
      long distanceFromEarth = 9223372036854775807L;
      float averageIQ = 3.4F;
      double payrisePercentage = 1.7969999999999997D;
      boolean isLying = false;
      char characterletter = 65;

      // Display Original Values to console
      System.out.println("BEFORE\n");
      System.out.println("carTyreCost: " + carTyreCost);
      System.out.println("newCarCost: " + newCarCost);
      System.out.println("buildingProjectCost: " + buildingProjectCost);
      System.out.println("distanceFromEarth: " + distanceFromEarth);
      System.out.println("averageIQ = " + averageIQ);
      System.out.println("isLying: " + isLying);
      System.out.println("payrisePercentage: " + payrisePercentage);
      System.out.println("characterletter: " + characterletter + "\n");

      // Change all variables
      carTyreCost++;
      newCarCost++;
      buildingProjectCost++;
      distanceFromEarth++;
      averageIQ = 88;
      payrisePercentage = 3.0;
      isLying = true;
      characterletter = 99;

      // Display Altered values to console
      System.out.println("AFTER\n");
      System.out.println("carTyreCost: " + carTyreCost);
      System.out.println("newCarCost: " + newCarCost);
      System.out.println("buildingProjectCost: " + buildingProjectCost);
      System.out.println("distanceFromEarth: " + distanceFromEarth);
      System.out.println("averageIQ = " + averageIQ);
      System.out.println("payrisePercentage: " + payrisePercentage);
      System.out.println("isLying: " + isLying);
      System.out.println("characterletter: " + characterletter);

   }

}
