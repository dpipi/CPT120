package Independent_Investigation_Effort_07;

import javax.swing.JOptionPane;

/**
 * @author David Pipczak, s3805554
 * @version 1.1
 * @date 11/10/2019
 * 
 *       This program asks the user for input regarding how many songs that they wish
 *       to store, It takes user input for choice to add songs, display all songs or
 *       find and play, it then takes user input for song names in String format and
 *       then takes user input for storage location
 */

public class MusicLibraryW7
{

   private int maxNumSongs = maximumNumberOfSongs();
   private String[] songTitles = new String[maxNumSongs];;
   private String[] songLocations = new String[maxNumSongs];
   private int currentNumSongs = 0;

   /**
    * Get user input of integer choice 1,2 or 3, then call relevant method
    * 
    */
   public MusicLibraryW7()
   {
      String menu = "MusicLibrary v1.0\n";
      menu += "[1] Add song\n";
      menu += "[2] Display all songs\n";
      menu += "[3] Find song and play\n";
      String menuChoiceString = JOptionPane.showInputDialog(menu);
      while (menuChoiceString != null)
      {
         int menuChoiceInt = Integer.parseInt(menuChoiceString);
         if (menuChoiceInt == 1)
         {
            addSongs();
         }
         else if (menuChoiceInt == 2)
         {
            displayAllSongs();
            // Code continues on next page...
         }
         else if (menuChoiceInt == 3)
         {
            findSongAndPlay();
         }
         else
            JOptionPane.showMessageDialog(null, "That wasn't a valid choice!");

         menuChoiceString = JOptionPane.showInputDialog(menu);
      }
   }

   /**
    * Get mamimum songs amount from user
    * 
    * @param maximumSongs
    *           any integer value
    * @return maximumSongs
    * 
    */
   public int maximumNumberOfSongs()
   {
      return Integer.parseInt(JOptionPane
               .showInputDialog("Enter maximum number of songs"));
   }

   /**
    * return song title
    * 
    * @return any String
    */
   public String getSongTitle()
   {
      return JOptionPane.showInputDialog("Enter a song title");
   }

   /**
    * return song location
    * 
    * @return any String number in form of integer
    */
   public String getSongLocation(String title)
   {
      return JOptionPane.showInputDialog("Enter song location for '" + title + "'");
   }

   /**
    * add Songs to array
    * 
    * @param title
    *           any String
    * @param currentNumSongs
    *           any positive integer value
    * @param maximumSongs
    *           any positive integer value
    * @return none
    * 
    */
   public void addSongs()
   {
      if (currentNumSongs < maxNumSongs)
      {
         String title = getSongTitle();
         int i = 0;
         while (i < currentNumSongs && !songTitles[i].equalsIgnoreCase(title)) // test
                                                                               // for
                                                                               // space
                                                                               // and
                                                                               // duplication
            i += 1;

         /**
          * Code here does ask the user to enter a new location, it only does this on
          * the first entry and does not does this on the second, it allows a double
          * entry on the second time eg song,1 - song,2 - song,2 , did not get time
          * to correct program to overcome this issue.
          */
         if (i < currentNumSongs)
         {

            boolean newLocation = false;
            // Loop while newLocation equal to current locaation
            while (newLocation != true)
            {
               String location = JOptionPane.showInputDialog(
                                                             "There is already a song titled '" +
                                                             title +
                                                             "' at location" + " " +
                                                             ((int) (i + 1)));

               if (Integer.parseInt(location) != i + 1)
               { // Error is here somewhere with reference, needs to check
                  // all array locations
                  songTitles[currentNumSongs] = title;
                  songLocations[currentNumSongs] = location;
                  currentNumSongs += 1;
                  newLocation = true; //
               }
               else
               {
                  newLocation = false;
               }
            }

         }
         else
         {
            String location = getSongLocation(title);
            songTitles[currentNumSongs] = title;
            songLocations[currentNumSongs] = location;
            currentNumSongs += 1;
         }
      }
      else
      {

         // Expand songTitles array
         String title = getSongTitle();
         String[] expandSongTitles = new String[songTitles.length + 1];
         for (int i = 0; i < songTitles.length; i++)
         {
            expandSongTitles[i] = songTitles[i];
         }
         expandSongTitles[songTitles.length] = title;
         songTitles = expandSongTitles;
         // Expand songLocations array
         String location = getSongLocation(title);
         String[] expandSongLocations = new String[songLocations.length + 1];
         for (int i = 0; i < songLocations.length; i++)
         {
            expandSongLocations[i] = songLocations[i];
         }
         expandSongLocations[songLocations.length] = location;
         songLocations = expandSongLocations;

         currentNumSongs += 1;
      }

   }

   /**
    * Display output message
    * 
    * @param songTitles
    *           any String
    * @param currentNumSongs
    *           any positive integer value
    * @param songLocations
    *           any positive integer value
    * @return None
    */
   public void displayAllSongs()
   {
      String message = "Song List:\n\n";
      int i = 0;
      while (i < this.currentNumSongs)
      {
         message += this.songTitles[i] + "," + this.songLocations[i] + "\n";
         i += 1;
      }
      JOptionPane.showMessageDialog(null, message);
      return;
   }

   /**
    * Find Song and play
    * 
    * @param targetTitle
    *           any String
    * @param songTitles
    *           any String
    * @param currentNumSongs
    *           any positive integer value
    * @return None
    */
   public void findSongAndPlay()
   {
      String targetTitle =
               JOptionPane.showInputDialog("Enter a song title to search");
      int i = 0;
      while (i < this.currentNumSongs &&
             !songTitles[i].equalsIgnoreCase(targetTitle))
         i += 1;

      if (i < this.currentNumSongs)
      {
         // ---------------------------------------------------------------
         // For ITP, you do not need to understand how the code segment below works.
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
            Runtime.getRuntime()
                     .exec(command + " \"" + this.songLocations[i] + "\"");
         }
         catch (Exception e)
         {
            JOptionPane.showMessageDialog(null, "Unable to launch player");
         }
         // ---------------------------------------------------------------
      }
      else
         JOptionPane.showMessageDialog(null, "Could not find any matches for " +
                                             targetTitle);
      return;
   }

   public static void main(String[] args)
   {
      @SuppressWarnings("unused")
      MusicLibraryW7 ml;
      ml = new MusicLibraryW7();
   }
}
