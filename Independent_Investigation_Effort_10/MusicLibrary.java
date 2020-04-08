package Independent_Investigation_Effort_10;

import java.io.*;
import javax.swing.JOptionPane;

public class MusicLibrary
{

   public MusicLibrary()
   {

      String menu = "MusicLibrary v1.0\n";
      menu += "[1] Add song\n";
      menu += "[2] Display all songs\n";
      menu += "[3] Clear all songs\n";
      menu += "[4] Find song and play\n";
      menu += "[5] Exit Program\n\n";

      int menuChoice = 0;
      while (menuChoice != 5)
      {
         // Get user input for options
         boolean goodInput = false;
         while (goodInput != true)
         {
            try
            {
               menuChoice = Integer.parseInt(JOptionPane.showInputDialog(menu));
               goodInput = true;
            }
            catch (Exception e)
            {
               JOptionPane.showMessageDialog(null, "Not a valid Input");
            }
         }
         // test user input
         if (menuChoice == 1)
         { // Get input from user
            String title = JOptionPane.showInputDialog("Enter a song title");
            String location = JOptionPane
                     .showInputDialog("Enter song location for '" + title + "'");
            // Call method saveSongs to save songs to file songs.csv
            saveSongs((title + "," + location + "\n"));
         }
         else if (menuChoice == 2)
         {
            // Call method to load songs from songs.csv file
            loadSongs();
         }
         else if (menuChoice == 3)
         {
            // Call method to clear songs.csv file
            clearSongs();
         }
         else if (menuChoice == 4)
         {
            // Call method to find and play songs
            findSongAndPlay();
         }
         else if (menuChoice == 5)
         {
            // Exit program
            menuChoice = 5;
         }
         else
            JOptionPane.showMessageDialog(null, "That wasn't a valid choice!");
      }
   }

   /**
    * Method saveSongs writes data to the songs.csv file using the append option
    */
   public void saveSongs(String DataToStore)
   {
      // Strings and arrayLength is its length.
      BufferedWriter outFile = null;
      try
      {
         outFile = new BufferedWriter(new FileWriter("song.csv", true));
         outFile.write(DataToStore);
         outFile.close();
      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
   }

   /**
    * Method loadSongs reads file song.csv and adds each line to a message that is
    * displayed using JOPtionPane.
    */
   public void loadSongs()
   {
      // The code below must be placed inside a method
      BufferedReader inFile = null;
      try
      {
         inFile = new BufferedReader(new FileReader("song.csv"));
         String currLine = inFile.readLine();
         String displayMessage = "";
         while (currLine != null)
         {
            displayMessage += currLine + "\n";
            currLine = inFile.readLine();
         }
         inFile.close();
         JOptionPane.showMessageDialog(null, displayMessage);
      }
      catch (Exception e)
      {
         System.out.println(e.getMessage());
      }
   }

   /**
    * This method is used to clear the song.csv file by writing no string without
    * appending.
    */
   public void clearSongs()
   {
      // Strings and arrayLength is its length.
      BufferedWriter outFile = null;
      try
      {
         outFile = new BufferedWriter(new FileWriter("song.csv"));
         outFile.write("");
         outFile.close();

      }
      catch (Exception e)
      {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
   }

   /**
    * Find Song and play - this does not work correctly and issue matching song from
    * song.csv file has not been resolved.
    * 
    * @param targetTitle
    *           any String
    * @param songTitles
    *           any String
    * @return None
    */
   public void findSongAndPlay()
   {
      String targetTitle =
               JOptionPane.showInputDialog("Enter a song title to search");
      BufferedReader inFile = null;
      try
      {
         inFile = new BufferedReader(new FileReader("song.csv"));
         String currLine = inFile.readLine();
         String displayMessage = "";

         while (currLine != null)
         {
            displayMessage += currLine + "\n";
            currLine = inFile.readLine();

            if (targetTitle == currLine)
            {

               // ---------------------------------------------------------------
               // For ITP, you do not need to understand how the code segment below
               // works.
               String os = System.getProperty("os.name").toLowerCase();
               String command;
               if (os.contains("windows"))
                  command = "explorer ";
               else if (os.contains("linux"))
                  command = "xdg-open ";
               else
                  command = "open ";
               try
               {
                  Runtime.getRuntime().exec(command + " \"" + currLine + "\"");
               }
               catch (Exception e)
               {
                  JOptionPane.showMessageDialog(null, "Unable to launch player");
               }
               // ---------------------------------------------------------------

            }
            else
            {
               JOptionPane.showMessageDialog(null,
                                             "Could not find any matches for " +
                                                   targetTitle);
               return;
            }
            inFile.close();
            JOptionPane.showMessageDialog(null, displayMessage);
         }
      }
      catch (Exception e)
      {
         System.out.println(e.getMessage());
      }

   }

   public static void main(String[] args)
   {
      @SuppressWarnings("unused")
      MusicLibrary ml = new MusicLibrary();
   }
}