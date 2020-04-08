package Independent_Investigation_Effort_08;

// Good work on demonstrating effort with the MusicLibrary class. As you know,
// this mark is not based on the correctness of your submission. In assessments,
// all students are required to demonstrate apporaches, patterns shown in class
// examples.

// Note: Please remmember to always submit only valid Java that can be run and tested.

// Simply reading a final code solution does not give anyone the ability to
// iteratively develop and debug code so, please watch the 21/October/2019
// lecture recording below and re-write the code below on your own. The
// code below is given only for ease of referencing only:
// https://au-lti.bbcollab.com/recording/bb2fa92cc8bf45eda1dd372d28eac69c

// Note: Please ensure that your file is named MusicLibrary.java

import javax.swing.JOptionPane;

public class MusicLibrary
{
   // In ITP, all member variables must be private and not static and there should
   // be
   // no = signs up here at the object member declaration level.
   private int maxNumSongs;
   // private String[] songTitles;
   // private String[] songLocations;
   private Song[] songList;
   private int currentNumSongs;

   public MusicLibrary(int maxNumSong)
   {
      // String songTitles;
      // int maxNumSongs;

      // All object member initialisations must be performed in the constructor.
      this.maxNumSongs = maxNumSong;
      // this.songTitles = new String[this.maxNumSongs];
      // this.songLocations = new String[this.maxNumSongs];
      this.songList = new Song[this.maxNumSongs];
      this.currentNumSongs = 0;

      showMenu();
   }

   public void showMenu()
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
            addSong();
         }
         else if (menuChoiceInt == 2)
         {
            displaySongs();
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

   public int getSongIndexByTitle(String title)
   {
      int result = -1;
      int i = 0;
      // while (i < this.currentNumSongs &&
      // !this.songTitles[i].equalsIgnoreCase(title))
      while (i < this.currentNumSongs &&
             !this.songList[i].getTitle().equalsIgnoreCase(title))
         i += 1;
      if (i < this.currentNumSongs)
         result = i;

      return result;
   }

   public void expandArray()
   {
      // String[] biggerSongTitles = new String[this.maxNumSongs * 2];
      // String[] biggerSongLocations = new String[biggerSongTitles.length];
      Song[] biggerSongList = new Song[this.maxNumSongs * 2];
      int i = 0;
      while (i < this.currentNumSongs)
      {
         // biggerSongTitles[i] = this.songTitles[i];
         // biggerSongLocations[i] = this.songLocations[i];
         biggerSongList[i] = this.songList[i];
         i += 1;
      }
      // this.songTitles = biggerSongTitles;
      // this.songLocations = biggerSongLocations;
      this.songList = biggerSongList;
      // this.maxNumSongs = biggerSongTitles.length;
      this.maxNumSongs = biggerSongList.length;
   }

   public void addSong()
   {
      if (this.currentNumSongs >= this.maxNumSongs)
         expandArray();

      String title = JOptionPane.showInputDialog("Enter a song title");
      int i = getSongIndexByTitle(title);

      // The if-statement can be restructured but is kept like this because
      // we want to compare with the previous approach
      if (i >= 0)
      {
         String location = JOptionPane
                  .showInputDialog("Enter a new song location for '" + title + "'");
         // this.songLocations[i] = location;
         this.songList[i] = new Song(title, location);
         // this.songList[i].setLocation(location); // If we had a setLocation
         // method...
      }
      else
      {
         String location = JOptionPane
                  .showInputDialog("Enter song location for '" + title + "'");
         // this.songTitles[this.currentNumSongs] = title;
         // this.songLocations[this.currentNumSongs] = location;
         this.songList[this.currentNumSongs] = new Song(title, location);
         this.currentNumSongs += 1;
      }
   }

   public void displaySongs()
   {

      String message = "Song List:\n\n";
      int i = 0;
      while (i < this.currentNumSongs)
      {
         // message += this.songTitles[i] + "," + this.songLocations[i] + "\n";
         message += this.songList[i].getTitle() + "," +
                    this.songList[i].getLocation() + "\n";
         i += 1;
      }
      JOptionPane.showMessageDialog(null, message);
   }

   public void findSongAndPlay()
   {
      String targetTitle =
               JOptionPane.showInputDialog("Enter a song title to search");
      int i = getSongIndexByTitle(targetTitle);
      if (i >= 0)
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
                     .exec(command + " \"" + this.songList[i].getLocation() + "\"");
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
   }

   public static void main(String[] args)
   {
      @SuppressWarnings("unused")
      MusicLibrary ml;
      ml = new MusicLibrary(1);

   }

}
