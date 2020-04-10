package Assignment_03;

/**
 * @author David Pipczak
 * @version 2.0
 * @date 31/10/2019
 * 
 * 
 * CarDesigner Program Allows the user to make a virtual car from 3 manufacturers(make). 
 * It allows the user to select from 3 models of the make, and allows you to select one 
 * of three colors, each car, model and color is unique, it also add an engine option.
 * 
 * The CarDesigner has the following options:
 * 1) Design Car - build your car design
 * 2) View Car - view the car design in JOPtionPane
 * 3) Save Car - Save the car to Car.txt file
 * 4) Load Car - Load a saved car from Car.txt file
 * 5) Quit - Exit program*/

import java.io.*;
import javax.swing.JOptionPane;

public class CarDesigner
{
   // Set member variables
   private int maxNumCars;
   private int currentNumCars;
   private Car[] CarList;
   private Engine[] EngineList;

   CarDesigner(int MaxCarsDesigned)
   {
      // Declare member Variables
      this.maxNumCars = MaxCarsDesigned;
      this.currentNumCars = 0;
      this.CarList = new Car[this.maxNumCars];
      this.EngineList = new Engine[this.maxNumCars];

      MainMenu();
   }

   public void MainMenu()
   {
      // Declare local variables
      String carMake = "";
      String carModel = "";
      String carColor = "";
      String engineType = "";

      // Declare String mainMessage for Menu
      String mainMessage = "Car Designer\n\n";
      mainMessage += "1) Design New Car\n";
      mainMessage += "2) View Built Car / Loaded Car\n";
      mainMessage += "3) Save Designed Car to File\n";
      mainMessage += "4) Load Designed Car from File\n";
      mainMessage += "5) Quit\n\n";

      // Declare String variable choiceErrorMsg for Error messages
      String choiceErrorMsg = "ERROR - Wrong Input or No Car Created";

      // Set condition for goodChoice
      boolean quitProgram = false;
      while (quitProgram != true)
      { // run unless option 5 quit selected

         try
         { // try convert input to integer
            int designViewAlter =
                     Integer.parseInt(JOptionPane.showInputDialog(mainMessage));
            // test integer between 1 and 5
            if (designViewAlter >= 1 && designViewAlter <= 5)
            {

               if (designViewAlter == 1)
               { // Option 1 Design Car Selected
                  // Declare String messageMake for Menu
                  String messageMake = "Make\n\n";
                  messageMake += "1) Ferrari\n"; // Car Make
                  messageMake += "2) Maserati\n"; // Car Make
                  messageMake += "3) Mercedes-Benz\n\n"; // Car Make

                  int design = OptionMenu(messageMake); // Create Menu and receive
                                                        // returned input

                  if (design == 1)
                  { // Ferrari Selected

                     carMake = "Ferrari"; // Set Car Make type to variable

                     // Declare String messageModel for Ferrari Menu
                     String messageModel = "Ferrari\n\n";
                     messageModel += "1) 812GTS\n"; // Car Model
                     messageModel += "2) F8Spider\n"; // Car Model
                     messageModel += "3) F8Tributo\n\n"; // Car Model

                     int model = OptionMenu(messageModel); // Create Menu and receive
                                                           // returned input

                     if (model == 1)
                     { // Ferrari 812 GTS

                        carModel = "812 GTS"; // Set Car Model type to variable

                        // Declare String messageColor for Ferrari 812 GTS Color Menu
                        String messageColor = "Ferrari 812 GTS Colors\n\n";
                        messageColor += "1) Grigio GTS\n"; // Car Color Option
                        messageColor += "2) Rosso 70 Anni\n"; // Car Color Option
                        messageColor += "3) Bianco Cervino\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Grigio GTS";
                        }
                        else if (color == 2)
                        {
                           carColor = "Rosso 70 Anni";
                        }
                        else
                        {
                           carColor = "Bianco Cervino";
                        }

                     }
                     else if (model == 2)
                     { // Ferrari F8 Spider

                        carModel = "F8 Spider"; // Set Car Model type to variable

                        // Declare String messageColor for Ferrari F8 Spider Color
                        // Menu
                        String messageColor = "Ferrari F8 Spider Color\n\n";
                        messageColor += "1) Blue Corsa\n"; // Car Color Option
                        messageColor += "2) Giallo Modena\n"; // Car Color Option
                        messageColor += "3) Bianco Cervino\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Blue Corsa";
                        }
                        else if (color == 2)
                        {
                           carColor = "Giallo Modena";
                        }
                        else
                        {
                           carColor = "Bianco Cervino";
                        }

                     }
                     else if (model == 3)
                     { // Ferrari F8 Tributo

                        carModel = "F8 Tributo"; // Set Car Model type to variable

                        // Declare String messageColor for Ferrari F8 Tributo Color
                        // Menu
                        String messageColor = "Ferrari F8 Tributo Color\n\n";
                        messageColor += "1) Yellow\n"; // Car Color Option
                        messageColor += "2) Racing Red\n"; // Car Color Option
                        messageColor += "3) Titanium Grey\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Yellow";
                        }
                        else if (color == 2)
                        {
                           carColor = "Racing Red";
                        }
                        else
                        {
                           carColor = "Titanium Grey";
                        }
                     }

                  }
                  else if (design == 2)
                  { // Maserati Selected

                     carMake = "Maserati"; // Set Car Make type to variable

                     // Declare String messageModel for Maserati Menu
                     String messageModel = "Maserati\n\n";
                     messageModel += "1) GranCabrio\n"; // Car Model
                     messageModel += "2) GranTurismo\n"; // Car Model
                     messageModel += "3) Quattroporte\n\n"; // Car Model

                     int model = OptionMenu(messageModel);// Create Menu

                     if (model == 1)
                     { // Maserati GranCabrio
                        carModel = "GranCabrio";

                        // Declare String messageColor for Maserati GranCabrio Color
                        // Menu
                        String messageColor = "Maserati GranCabrio Colors\n\n";
                        messageColor += "1) Grey Alfieri\n"; // Car Color Option
                        messageColor += "2) Rosso Trionfale\n"; // Car Color Option
                        messageColor += "3) Blue Neptune\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           // Assign Selected Color to variable
                           carColor = "Grey Alfieri";
                        }
                        else if (color == 2)
                        {
                           carColor = "Rosso Trionfale";
                        }
                        else
                        {
                           carColor = "Blue Neptune";
                        }

                     }
                     else if (model == 2)
                     { // Maserati GranTurismo

                        carModel = "GranTurismo"; // Set Car Model type to variable

                        // Declare String messageColor for Maserati GranTurismo Color
                        // Menu
                        String messageColor = "Maserati GranTurismo Color\n\n";
                        messageColor += "1) White\n"; // Car Color Option
                        messageColor += "2) Blue Oceano\n"; // Car Color Option
                        messageColor += "3) Grigio Granito\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "White";
                        }
                        else if (color == 2)
                        {
                           carColor = "Blue Oceano";
                        }
                        else
                        {
                           carColor = "Grigio Granito";
                        }

                     }
                     else if (model == 3)
                     { // Maserati Quattroporte

                        carModel = "Quattroporte"; // Set Car Model type to variable

                        // Declare String messageColor for Maserati Quattroporte
                        // Color Menu
                        String messageColor = "Maserati Quattroporte Color\n\n";
                        messageColor += "1) Nero\n"; // Car Color Option
                        messageColor += "2) Bianco\n"; // Car Color Option
                        messageColor += "3) Rosso Folgore\n\n"; // Car Color Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Nero";
                        }
                        else if (color == 2)
                        {
                           carColor = "Bianco";
                        }
                        else
                        {
                           carColor = "Rosso Folgore";
                        }

                     }

                  }
                  else
                  { // Mercedes-Benz Selected

                     carMake = "Mercedes-Benz"; // Set Car Make type to variable

                     // Declare String messageModel for Mercedes-Benz Menu
                     String messageModel = "Mercedes-Benz\n\n";
                     messageModel += "1) AMG GT-C\n"; // Car Model
                     messageModel += "2) AMG GT-S\n"; // Car Model
                     messageModel += "3) AMG GT-R\n\n"; // Car Model

                     int model = OptionMenu(messageModel); // Create Menu and receive
                                                           // returned input

                     if (model == 1)
                     { // Mercedes-Benz AMG GT-C

                        carModel = "AMG GT-C"; // Set Car Model type to variable

                        // Declare String messageColor for Mercedes-Benz AMG GT-C
                        // Color Menu
                        String messageColor = "Mercedes-Benz AMG GT-C Colors\n\n";
                        messageColor += "1) Black\n"; // Car Color Option
                        messageColor += "2) Iridium Silver Metallic\n"; // Car Color
                                                                        // Option
                        messageColor += "3) Iridium Silver Metallic\n\n"; // Car
                                                                          // Color
                                                                          // Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Black";
                        }
                        else if (color == 2)
                        {
                           carColor = "Iridium Silver Metallic";
                        }
                        else
                        {
                           carColor = "Iridium Silver Metallic";
                        }

                     }
                     else if (model == 2)
                     { // Mercedes-Benz AMG GT-S

                        carModel = "AMG GT-S"; // Set Car Model type to variable

                        // Declare String messageColor for Mercedes-Benz AMG GT-S
                        // Color Menu
                        String messageColor = "Mercedes-Benz AMG GT-S Colors\n\n";
                        messageColor += "1) Jupiter Red\n"; // Car Color Option
                        messageColor += "2) Brilliant Blue Metallic\n"; // Car Color
                                                                        // Option
                        messageColor += "3) Designo Cardinal Red Metallic\n\n"; // Car
                                                                                // Color
                                                                                // Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Jupiter Red";
                        }
                        else if (color == 2)
                        {
                           carColor = "Brilliant Blue Metallic";
                        }
                        else
                        {
                           carColor = "Designo Cardinal Red Metallic";
                        }

                     }
                     else if (model == 3)
                     { // Mercedes-Benz AMG GT-R

                        carModel = "AMG GT-R"; // Set Car Model type to variable

                        // Declare String messageColor for Mercedes-Benz AMG GT-R
                        // Color Menu
                        String messageColor = "Mercedes-Benz AMG GT-R Colors\n\n";
                        messageColor += "1) Diamond White Metallic\n"; // Car Color
                                                                       // Option
                        messageColor += "2) Designo� Selenite Grey Magno\n"; // Car
                                                                             // Color
                                                                             // Option
                        messageColor += "3) Designo� Iridium Silver Magno\n\n"; // Car
                                                                                // Color
                                                                                // Option

                        int color = OptionMenu(messageColor); // Create Menu and
                                                              // receive returned
                                                              // input

                        // Assign Selected Color to variable
                        if (color == 1)
                        {
                           carColor = "Diamond White Metallic";
                        }
                        else if (color == 2)
                        {
                           carColor = "Designo� Selenite Grey Magno";
                        }
                        else
                        {
                           carColor = "Designo� Iridium Silver Magno";
                        }

                     }

                  }

                  String messageEngine = "SELECT ENGINE SIZE\n\n";

                  messageEngine += "1) V8 Engine\n";
                  messageEngine += "2) V10 Engine\n";
                  messageEngine += "3) V12 Engine\n\n";

                  int engineSize = OptionMenu(messageEngine); // Create Menu and
                                                              // receive returned
                                                              // input

                  // Assign Selected Engine to variable
                  if (engineSize == 1)
                  {
                     engineType = "V8 Engine - 507kW; 681hp";
                  }
                  else if (engineSize == 2)
                  {
                     engineType = "V10 Engine - 540KW 705hp";
                  }
                  else
                  {
                     engineType = "V12 Engine - 588kW; 789hp";
                  }

                  addCar(carMake, carModel, carColor, engineType); // Add details to
                                                                   // Array

               }
               else if (designViewAlter == 2)
               { // Option 2 view Car Selected
                  displayCar(); // Call method

               }
               else if (designViewAlter == 3)
               { // Option 3 Save Car Selected
                  // Save Car to File
                  saveToFile(); // Call method

               }
               else if (designViewAlter == 4)
               { // Option 4 Load Car Selected
                  // Load Car from File
                  loadCarFromFile(); // Call method

               }
               else
               { // Quit Program Selected
                  quitProgram = true;
               }

            }
         }
         catch (Exception e)
         { // Not able to convert to an integer
            JOptionPane.showMessageDialog(null, choiceErrorMsg);
         }
      }

   }

   /**
    * OptionMenu Sets a default menu that can be used, it takes a String message that
    * is used to display options.It tests input and returns the result.
    * 
    * @param message
    *           any given String
    * @return option integer value 1,2 or 3
    * @return 0 if all else fails
    */
   public int OptionMenu(String message)
   {
      boolean goodOption = false;
      while (goodOption != true)
      {
         try
         { // Try convert input to integer
            int option = Integer.parseInt(JOptionPane.showInputDialog(message));
            // test integer is in usable range
            if (option >= 1 && option <= 3)
            {
               return option;
            }
         }
         catch (Exception e)
         { // unable to convert input to integer
            JOptionPane.showMessageDialog(null, "Enter a valid Input");
         }
      }
      return 0;
   }

   /**
    * Adds Selected car choices to array, if array full then uses a mutator to change
    * the details for each of the three choices.
    */
   public void addCar(String make, String model, String color, String engine)
   {
      // Add details to array
      if (this.currentNumCars != this.maxNumCars)
      {
         this.CarList[currentNumCars] = new Car(make, model, color);
         this.EngineList[currentNumCars] = new Engine(engine);
         this.currentNumCars++;
      }
      else
      { // Array already full - uses a mutator to change details
         this.CarList[0].setMake(make); // Set car make
         this.CarList[0].setModel(model); // Set car model
         this.CarList[0].setColor(color); // Set car color
         this.EngineList[0].setEngineSize(engine);
      }
   }

   /**
    * method displayCar accesses the array to extract details of make, model and
    * color and displays the details using JOptionPane
    */
   public void displayCar()
   {

      // Set up variable displayMessage while accessing array for details make, model
      // and color
      String displayMessage = "Car Designed\n\n";
      displayMessage += "Car Make: " + this.CarList[0].getMake() + "\n"; // Access
                                                                         // array and
                                                                         // extract
                                                                         // car make
      displayMessage += "Car Model: " + this.CarList[0].getModel() + "\n"; // Access
                                                                           // array
                                                                           // and
                                                                           // extract
                                                                           // car
                                                                           // model
      displayMessage += "Car Color: " + this.CarList[0].getColor() + "\n\n"; // Access
                                                                             // array
                                                                             // and
                                                                             // extract
                                                                             // car
                                                                             // color

      displayMessage += "Car Engine: " + this.EngineList[0].getEngine() + "\n\n"; // Access
                                                                                  // array
                                                                                  // and
                                                                                  // extract
                                                                                  // car
      // engine
      JOptionPane.showMessageDialog(null, displayMessage); // Display message
   }

   /**
    * method saveToFile accesses CarList array and saves the 3 details to a text file
    * car.txt
    */
   public void saveToFile()
   {

      BufferedWriter outFile = null;
      try
      {
         // Save Car Design to file
         outFile = new BufferedWriter(new FileWriter("Car.txt")); // Open file
                                                                  // car.txt
         outFile.write(CarList[0].getMake() + "\n"); // access array CarList and
                                                     // write car make to file
                                                     // Car.txt
         outFile.write(CarList[0].getModel() + "\n"); // access array CarList and
                                                      // write car model to file
                                                      // Car.txt
         outFile.write(CarList[0].getColor() + "\n"); // access array CarList and
                                                      // write car color to file
                                                      // Car.txt
         outFile.close(); // Close file

         // Save Engine Size to file
         outFile = new BufferedWriter(new FileWriter("Engine.txt"));
         outFile.write(EngineList[0].getEngine() + "\n"); // write car engine to file
                                                          // Engine.txt
         outFile.close(); // Close file

      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }

   }

   public void loadCarFromFile()
   {
      // Assign variables and declare
      String LoadedMake = null;
      String LoadedModel = null;
      String LoadedColor = null;
      String LoadedEngine = null;

      BufferedReader carFile = null;
      BufferedReader engineFile = null;

      int carlineNum = 0;
      int engLineNum = 0;

      try
      {
         carFile = new BufferedReader(new FileReader("Car.txt")); // Open file
                                                                  // Car.txt
         engineFile = new BufferedReader(new FileReader("Engine.txt")); // Open file
                                                                        // Car.txt

         String carLine = carFile.readLine();
         String engineLine = engineFile.readLine();

         // Load engine from Car.txt file
         while (carLine != null)
         {
            // Read lines from file and assign to variable
            if (carlineNum == 0)
            {
               LoadedMake = carLine;
            }
            else if (carlineNum == 1)
            {
               LoadedModel = carLine;
            }
            else
            {
               LoadedColor = carLine;
            }
            carlineNum++;
            carLine = carFile.readLine();
         }
         // Load engine from Engine.txt file
         while (engineLine != null)
         {
            if (engLineNum == 0)
            {
               LoadedEngine = engineLine;
            }
            engLineNum++;
            engineLine = engineFile.readLine();
         }

         carFile.close(); // Close car file
         engineFile.close(); // Close engine file

      }
      catch (Exception e)
      {
         String exceptionMessage = "No car found\n\n";
         exceptionMessage += "Please design and\n";
         exceptionMessage += "save a new car\n";

         JOptionPane.showMessageDialog(null, exceptionMessage);
      }
      // Add details loaded from file to arrays
      addCar(LoadedMake, LoadedModel, LoadedColor, LoadedEngine);

   }

   public static void main(String[] args)
   {
      // Suppress warning
      @SuppressWarnings("unused")
      CarDesigner build = new CarDesigner(1);
   }

}
