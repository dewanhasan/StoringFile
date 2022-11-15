package ie.atu.week8;

import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FirstFile {
    public static void main(String[] args) {
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the name of the file: ");
            String filename = keyboard.nextLine();
            try{
                Scanner inputFile = new Scanner(new File(filename));
                while(inputFile.hasNextLine()){
                    System.out.println(inputFile.nextLine());
                }

            } catch (IOException f)
            {
                f.printStackTrace();
            }
        }
    }
}
