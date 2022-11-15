package ie.atu.week8;

import java.io.*;

public class FirstFile {
    public static void main(String[] args) {
        {
            File myFile = new File("MyFile.txt");
            System.out.println("My File is located at " + myFile.getAbsolutePath());
            String content = "Details to write";
            try{
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write(" Hello bbg");
                myWriter.close();
            } catch (IOException f)
            {
                f.printStackTrace();
            }
        }
    }
}
