// Engine Class

package Assignment_03;

public class Engine
{
   // Create instance(member) variables for title and location
   private String engineSize;

   // Create instance method
   public Engine(String engineCylinders)
   {
      this.engineSize = engineCylinders;
   }

   // Create get method for engine
   public String getEngine()
   {
      return this.engineSize;
   }

   // Create set method for engine
   public void setEngineSize(String engineSize)
   {
      this.engineSize = engineSize;
   }

}
