package LAB4;

import java.io.*;

public class Lab4program1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file);
             FileWriter writer = new FileWriter(file, false))
        {

           
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) 
            {
                content.append((char) ch);
            }
            content.reverse();
            writer.write(content.toString());

            System.out.println("File content reversed and written back.");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
