package Independent_Investigation_Effort_09;

public class Answers
{

   public static void main(String[] args)
   {

      String answer = "\n";

      answer = answer + "a) ANSWER\n";
      answer = answer +
               "DataLoader <- This would be for an application the can both read and write";
      answer = answer + " ASCII data to a servo motor drive unit.\n";
      answer = answer +
               "It would have to options, one it would read the data from a drive ";
      answer = answer + "unit and store it in a file, and two,\n";
      answer = answer + "read data from a file and write it to a drive unit\n";

      answer = answer + "\nb) ANSWER\n";
      answer = answer +
               "Communications <- This would control communications with the drive unit. ";
      answer = answer + "It would read or write data to a location.\\n";
      answer = answer +
               "StringCleaner <- this would be used by taking a string that has been read from ";
      answer = answer +
               "a drive as its input and return an extracted string that is usable.\\n";
      answer = answer +
               "DataSaver <- This would store data location and data values in an array ";
      answer = answer + "so it can then be sent to the fileControl to be stored,\\n";
      answer = answer + "FileControl <- This would read and write to a file\n";

      answer = answer + "\nc) ANSWER\n";
      answer = answer +
               "Communications -  Has a data location and data value that would be needed for communications\n";
      answer = answer +
               "StringCleaner -  Has one input string i.e. DirtyString and one output string i.e. CleanedString\n";
      answer = answer +
               "                 these would be the same type for every string for its input or its output.";
      answer = answer +
               "DataSaver -  Has a data location and data value and there for they would all come from the same array SaveData.\n";
      answer = answer +
               "             Every data location and data value would be added to the array.\n";
      answer = answer +
               "FileControl - This would have the same input which would be the data stored in the array and is to be transferred\n";
      answer = answer +
               "              and saved as a file. It would also read from these files.\n";

      answer = answer + "\nd) ANSWER\n";
      answer = answer + "Communications\n";
      answer = answer + "    - String DataLocation\n";
      answer = answer + "    - Sting DataValue\n";
      answer = answer + "StringCleaner\n";
      answer = answer + "    - String DirtyString\n";
      answer = answer + "    - String CleanString\n";
      answer = answer + "DataSaver\n";
      answer = answer + "    - String DataLocation\n";
      answer = answer + "    - Sting DataValue\n";
      answer = answer + "    - array SaveData\n";
      answer = answer + "FileControl\n";
      answer = answer + "    - array SavetoFile\n";
      answer = answer + "    - array ReadFromFile\n";

      answer = answer + "\ne)  ANSWER\n";
      answer = answer + "Communications\n";
      answer = answer + "    - String DataLocation\n";
      answer = answer + "    - Sting DataValue\n";
      answer = answer + "StringCleaner\n";
      answer = answer + "    - String DirtyString\n";
      answer = answer + "DataSaver\n";
      answer = answer + "    - String DataLocation\n";
      answer = answer + "    - Sting DataValue\n";
      answer = answer + "FileControl\n";
      answer = answer + "    - array SaveData\n";

      answer = answer + "\nf) ANSWER\n";
      answer = answer + "Communications\n";
      answer = answer + "    - readData\n";
      answer = answer + "    - WriteData\n";
      answer = answer + "    - CheckPort\n";
      answer = answer + "StringCleaner\n";
      answer = answer + "    - getCleanString\n";
      answer = answer + "DataSaver\n";
      answer = answer + "    - String readLocation\n";
      answer = answer + "    - Sting readValue\n";
      answer = answer + "FileControl\n";
      answer = answer + "    - SavetoFile\n";
      answer = answer + "    - ReadFromFile\n";

      System.out.println(answer);

   }

}
