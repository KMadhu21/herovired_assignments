import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class countcharacters {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int Count = 0;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Sample input : filePath: ");
            String path=sc.next();
            reader = new BufferedReader(new FileReader(path));

            int character = reader.read();

            while (character != -1) {
                Count++;
                character = reader.read();
                System.out.print((char)character);
            }

            System.out.println("Total number of characters in the file are: " + Count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
