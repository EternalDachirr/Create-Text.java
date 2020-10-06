//Here are the imports
import java.io.*;
import java.util.Scanner;
public class createTxt {
  public static void main(String[] args) {

    try (
    //First, I check to see if the file exists, open it if it does, or create it if it does not.
      PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Exercise17_01.txt"), true));
    ) {
      //This for loop will iterate through 100 times entering a random number between each one.
      for (int counter = 0; counter < 100; counter++) {
        pw.print((int)(Math.random() * 100) + " ");
      }
    }
    //The catch phrase is here so that the program will exit cleanly if it cannot create the file.
    catch (FileNotFoundException fnfe) {
      System.out.println("Cannot create the file.");
      fnfe.printStackTrace();
    }
  }
}
